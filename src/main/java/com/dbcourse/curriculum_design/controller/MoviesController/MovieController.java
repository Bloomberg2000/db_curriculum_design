package com.dbcourse.curriculum_design.controller.MoviesController;

import com.dbcourse.curriculum_design.controller.MoviesController.bean.request.MovieSearchRequest;
import com.dbcourse.curriculum_design.controller.MoviesController.bean.response.*;
import com.dbcourse.curriculum_design.elasticsearch.SearchMovie;
import com.dbcourse.curriculum_design.model.*;
import com.dbcourse.curriculum_design.redis.services.HotMovieService;
import com.dbcourse.curriculum_design.service.*;
import com.dbcourse.curriculum_design.utils.RequestUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/movie", method = {RequestMethod.GET}, produces = "application/json;charset=UTF-8")
public class MovieController {
    @Resource
    private HttpServletRequest request;

    @Resource
    private LongCommentsService longCommentsService;

    @Resource
    private UserInfoService userInfoService;

    @Resource
    private LongCommentsLikesService longCommentsLikesService;

    @Resource
    private DiscussesService discussesService;

    @Resource
    private MoviesService moviesService;

    @Resource
    private MoviesAndStaffsService moviesAndStaffsService;

    @Resource
    private ShortCommentsService shortCommentsService;

    @Resource
    private TagsService tagsService;

    @Resource
    private UsersAndShortCommentsService usersAndShortCommentsService;

    @Resource
    private ShortCommentsLikesService shortCommentsLikesService;

    @Resource
    private UsersAndLongCommentsService usersAndLongCommentsService;

    @Resource
    private UsersAndDiscussesService usersAndDiscussesService;

    @Resource
    private HotMovieService hotMovieService;

    @Resource
    private AwardsAndMovieIdService awardsAndMovieIdService;


    /**
     * 返回电影的详细信息
     *
     * @param id 电影的id
     */
    @RequestMapping(value = "/{id:\\d+}", method = RequestMethod.GET)
    public MovieInfoResponse MovieInfo(@PathVariable("id") int id) {
        MovieInfoResponse result = new MovieInfoResponse();
        Movies movies = moviesService.getMovieById(id);
        if (movies == null) {
            return new MovieInfoResponse();
        }
        hotMovieService.addMovieAccessNum(id);
        result.setMovies(movies);
        List<MoviesAndStaffs> staffs = moviesAndStaffsService.getStaffsByMovieId(id);
        result.setStaffs(staffs);
        // 拉评分
        long star5Num = shortCommentsService.countShortCommentsByScore(id, (short) 5);
        long star4Num = shortCommentsService.countShortCommentsByScore(id, (short) 4);
        long star3Num = shortCommentsService.countShortCommentsByScore(id, (short) 3);
        long star2Num = shortCommentsService.countShortCommentsByScore(id, (short) 2);
        long star1Num = shortCommentsService.countShortCommentsByScore(id, (short) 1);

        long starSum = star5Num + star4Num + star3Num + star2Num + star1Num;
        long d = starSum;
        if (d == 0) {
            d = 1;
        }

        result.setScore(ScoreCount.builder().star5((double) star5Num / d)
                .star4((double) star4Num / d)
                .star3((double) star3Num / d)
                .star2((double) star2Num / d)
                .star1((double) star1Num / d)
                .comment_num(starSum).build());

        // 返回电影获奖情况
        List<AwardsAndMovieId> awards = awardsAndMovieIdService.getAwards(id);
        result.setAwards(awards);

        return result;
    }

    /**
     * TODO 返回自己评分但内容，需要被拦截器拦截
     *
     * @param movieId 电影id
     * @return
     */
    @RequestMapping(value = "/{id:\\d+}/myshortComment", method = RequestMethod.GET)
    public ShortComments MyMovieShortComments(@PathVariable("id") int movieId) {
        ShortComments shortComments = null;
        Integer userId = (Integer) request.getSession().getAttribute("user");
        if (userId != null) {
            shortComments = shortCommentsService.getShortCommentByUserIdAndMovieId(userId, movieId);
        }
        return shortComments;
    }

    /**
     * 返回前十个标签
     */
    @RequestMapping(value = "/tags", method = RequestMethod.GET)
    public TagsInfoResponse MytenTags() {
        List<Tags> tags = tagsService.getTopNumTags(10);
        return new TagsInfoResponse(tags);
    }

    // 获取短评
    @RequestMapping(value = "/{id:\\d+}/shortComment", method = RequestMethod.GET)
    public ShortCommentsResponse ShortCommentsByPage(@PathVariable("id") int movieId) {
        int pageNum = RequestUtils.GetPage(request);
        int pageSizeNum = RequestUtils.GetPageSize(request);

        List<UsersAndShortComments> usersAndShortComments = usersAndShortCommentsService.getShortCommentsByPage(movieId, pageNum, pageSizeNum);
        ShortCommentsResponse shortCommentsResponse = new ShortCommentsResponse();

        Integer user = (Integer) request.getSession().getAttribute("user");
        if (user != null) {
            List<Integer> shortCommentsIds = new ArrayList<>();
            usersAndShortComments.forEach(s -> shortCommentsIds.add(s.getShortcommentsid()));
            List<ShortCommentsLikes> likes = shortCommentsLikesService.getShortCommentsLikesByCommentsIdListAndUserId(shortCommentsIds, user);
            // 筛选出哪些评论点过赞
            for (UsersAndShortComments usersAndShortComment : usersAndShortComments) {
                boolean like = false;
                for (ShortCommentsLikes l : likes) {
                    if (usersAndShortComment.getShortcommentsid().equals(l.getNShortCommentId())) {
                        like = true;
                        break;
                    }
                }
                shortCommentsResponse.newShort(usersAndShortComment, like);
            }
        } else {
            usersAndShortComments.forEach(s -> shortCommentsResponse.newShort(s, false));
        }
        shortCommentsResponse.setShortCommentsNum(shortCommentsService.countShortCommentsByMovieId(movieId));
        return shortCommentsResponse;
    }

    /**
     * 获取电影长评列表
     *
     * @param movieId
     * @return
     */
    @RequestMapping(value = "/{id:\\d+}/longComment", method = RequestMethod.GET)
    public LongCommentsResponse LongCommentsByPage(@PathVariable("id") int movieId) {
        int pageNum = RequestUtils.GetPage(request);
        int pageSizeNum = RequestUtils.GetPageSize(request);

        LongCommentsResponse response = new LongCommentsResponse();
        List<UsersAndLongComments> longComments = usersAndLongCommentsService.getLongCommentsByPage(movieId, pageNum, pageSizeNum);
        // 判断是否点过赞
        Integer user = (Integer) request.getSession().getAttribute("user");
        if (user != null) {
            List<Integer> longCommentsIds = new ArrayList<>();
            longComments.forEach(l -> longCommentsIds.add(l.getLongcommentsid()));

            // 筛选Like
            List<LongCommentsLikes> likes = longCommentsLikesService.getLongCommentsLikesByCommentsIdListAndUserId(longCommentsIds, user);
            for (UsersAndLongComments c : longComments) {
                int likeType = -1;
                for (LongCommentsLikes l : likes) {
                    if (c.getLongcommentsid().equals(l.getNLongCommentId())) {
                        likeType = l.getNType();
                        break;
                    }
                }
                LongCommentsResponse.LongComment comment = LongCommentsResponse.LongComment.builder()
                        .username(c.getNickname()).avatar(c.getUseravatar()).longCommentsId(c.getLongcommentsid())
                        .createTime(c.getLongcommentscreatetime())
                        .likeNum(c.getLongcommentslikenum()).unlikeNum(c.getLongcommentsunlikenum())
                        .title(c.getLongcommentstitle()).content(c.getLongcommentscontent()).score(c.getLongcommentsscore()).likeType(likeType).userId(c.getUserid()).build();
                response.addComment(comment);
            }
        } else {
            longComments.forEach(c -> {
                LongCommentsResponse.LongComment comment = LongCommentsResponse.LongComment.builder()
                        .username(c.getNickname()).avatar(c.getUseravatar()).longCommentsId(c.getLongcommentsid())
                        .createTime(c.getLongcommentscreatetime())
                        .likeNum(c.getLongcommentslikenum()).unlikeNum(c.getLongcommentsunlikenum())
                        .title(c.getLongcommentstitle()).content(c.getLongcommentscontent()).likeType(-1).userId(c.getUserid()).score(c.getLongcommentsscore()).build();
                response.addComment(comment);
            });
        }

        response.setCommentsNum(longCommentsService.countLongCommentsByMovieId(movieId));
        return response;
    }

    /**
     * 获取电影讨论区
     *
     * @param movieId
     * @return
     */
    @RequestMapping(value = "/{id:\\d+}/discusses", method = RequestMethod.GET)
    public DiscussesResponse DiscussesByPage(@PathVariable("id") int movieId) {
        int pageNum = RequestUtils.GetPage(request);
        int pageSizeNum = RequestUtils.GetPageSize(request);

        DiscussesResponse response = new DiscussesResponse();
        List<UsersAndDiscusses> longComments = usersAndDiscussesService.getDiscussesByPage(movieId, pageNum, pageSizeNum);
        longComments.forEach(c -> response.addComment(DiscussesResponse.Discus.builder()
                .avatar(c.getUseravatar())
                .createTime(c.getDiscussescreatetime())
                .title(c.getDiscussesname())
                .username(c.getNickname())
                .DiscusId(c.getDiscussesid())
                .build()));
        response.setDiscusesNum(discussesService.countDiscussesByMovieId(movieId));
        return response;
    }


    /**
     * 返回前30个电影
     *
     * @param
     * @return
     */
    @RequestMapping(value = "/movies", method = RequestMethod.GET)
    public TopNumMovieInfoResponse My30Tags() {
        List<Movies> movies = moviesService.getTopNumMovies(30);
        return new TopNumMovieInfoResponse(movies);
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public MoviesSearchResponse SearchMovies(@RequestBody MovieSearchRequest movieSearchRequest) {
        SearchMovie movie = new SearchMovie();
        int pageNum = RequestUtils.GetPage(request);
        int pageSizeNum = RequestUtils.GetPageSize(request);
        StringBuilder builder = new StringBuilder();
        movieSearchRequest.getTerms().forEach(t -> {
            builder.append(t.replaceAll("\\s*", ""));
            builder.append(" ");
        });
        String terms = builder.toString();
        Object[] r = movie.search(terms, pageNum, pageSizeNum);
        MoviesSearchResponse response = new MoviesSearchResponse(r[0], r[1]);
        movie.closeClient();
        return response;
    }

    // 为你推荐
    // TODO random
    @RequestMapping(value = "/recommend", method = RequestMethod.GET)
    public MoviesResponse RecommendMovies() {
        Integer user = (Integer) request.getSession().getAttribute("user");

        if (user == null)
            return new MoviesResponse(moviesService.getRecommendMovies(10), null);
        else
            return new MoviesResponse(moviesService.getRecommendMovies(10), userInfoService.getUserInfoById(user));
    }



    // 正在热映
    @RequestMapping(value = "/latest", method = RequestMethod.GET)
    public MoviesResponse LatestMovies() {
        // TODO month可传
        return MoviesResponse.builder().movies(moviesService.getMoviesByLatest(3)).build();
    }

    // 热门电影
    @RequestMapping(value = "/hot", method = RequestMethod.GET)
    public MoviesResponse HotMovies() {
        return MoviesResponse.builder().movies(moviesService.getHotMovies(15)).build();
    }

    // 电影列表
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Map<String, Object> GetMoviesList() {
        int pageNum = RequestUtils.GetPage(request);
        int pageSizeNum = RequestUtils.GetPageSize(request);

        Map<String, Object> res = new HashMap<>();
        res.put("movies", moviesService.getMoviesByPage(pageNum, pageSizeNum));
        res.put("num", moviesService.countMovies());
        return res;
    }


}

package com.dbcourse.curriculum_design.controller.MoviesController;

import com.dbcourse.curriculum_design.controller.MoviesController.bean.response.MovieInfoResponse;
import com.dbcourse.curriculum_design.controller.MoviesController.bean.response.ScoreCount;
import com.dbcourse.curriculum_design.controller.MoviesController.bean.response.ShortCommentsResponse;
import com.dbcourse.curriculum_design.controller.MoviesController.bean.response.TagsInfoResponse;

import com.dbcourse.curriculum_design.model.*;
import com.dbcourse.curriculum_design.service.*;
import com.dbcourse.curriculum_design.controller.MoviesController.bean.response.TopNumMovieInfoResponse;

import com.dbcourse.curriculum_design.utils.RequestUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/movie", method = {RequestMethod.GET}, produces = "application/json;charset=UTF-8")
public class MovieController {
    @Resource
    private HttpServletRequest request;

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

    /**
     * 返回电影的详细信息
     *
     * @param id 电影的id
     */
    @RequestMapping(value = "/{id:\\d+}", method = RequestMethod.GET)
    public MovieInfoResponse MovieInfo(@PathVariable("id") int id) {
        MovieInfoResponse result = new MovieInfoResponse();
        Movies movies = moviesService.getMovieById(id);
        if (movies != null) {
            result.setMovies(movies);
            List<MoviesAndStaffs> staffs = moviesAndStaffsService.getStaffsByMovieId(id);
            result.setStaffs(staffs);
        }

        // 拉评分
        long star5Num = shortCommentsService.countShortCommentsByScore((short) 5);
        long star4Num = shortCommentsService.countShortCommentsByScore((short) 4);
        long star3Num = shortCommentsService.countShortCommentsByScore((short) 3);
        long star2Num = shortCommentsService.countShortCommentsByScore((short) 2);
        long star1Num = shortCommentsService.countShortCommentsByScore((short) 1);

        long starSum = star5Num + star4Num + star3Num + star2Num + star1Num;

        result.setScore(ScoreCount.builder().star5((double) star5Num / starSum)
                .star4((double) star4Num / starSum)
                .star3((double) star3Num / starSum)
                .star2((double) star2Num / starSum)
                .star1((double) star1Num / starSum)
                .comment_num(starSum).build());

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
    public ShortCommentsResponse ShortCommentsByPage(@PathVariable("id") int movieId){
        int pageNum = RequestUtils.GetPage(request);
        int pageSizeNum = RequestUtils.GetPageSize(request);

        List<UsersAndShortComments> usersAndShortComments = usersAndShortCommentsService.getShortCommentsByPage(pageNum, pageSizeNum);
        ShortCommentsResponse shortCommentsResponse = new ShortCommentsResponse();

        Integer user = (Integer) request.getSession().getAttribute("user");
        if (user != null){
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
        }else {
            usersAndShortComments.forEach(s -> shortCommentsResponse.newShort(s, false));
        }

        return shortCommentsResponse;
    }

//    @RequestMapping(value = "/{id:\\d+}/shortComment", method = RequestMethod.GET)


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



}

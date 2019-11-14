package com.dbcourse.curriculum_design.controller.MoviesController;

import com.dbcourse.curriculum_design.controller.MoviesController.been.response.MovieInfoResponse;
import com.dbcourse.curriculum_design.controller.MoviesController.been.response.ScoreCount;
import com.dbcourse.curriculum_design.controller.MoviesController.been.response.TagsInfoResponse;
import com.dbcourse.curriculum_design.controller.MoviesController.been.response.TopNumMovieInfoResponse;
import com.dbcourse.curriculum_design.model.Movies;
import com.dbcourse.curriculum_design.model.MoviesAndStaffs;
import com.dbcourse.curriculum_design.model.ShortComments;
import com.dbcourse.curriculum_design.model.Tags;
import com.dbcourse.curriculum_design.service.MoviesAndStaffsService;
import com.dbcourse.curriculum_design.service.MoviesService;
import com.dbcourse.curriculum_design.service.ShortCommentsService;
import com.dbcourse.curriculum_design.service.TagsService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping(value = "/api/movie", method = {RequestMethod.GET}, produces = "application/json;charset=UTF-8")
public class MovieController {
    @Resource
    private HttpServletRequest request;
    @Resource
    private HttpServletResponse response;

    @Resource
    private MoviesService moviesService;

    @Resource
    private MoviesAndStaffsService moviesAndStaffsService;

    @Resource
    private ShortCommentsService shortCommentsService;

    @Resource
    private TagsService tagsService;

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
    @RequestMapping(value = "/{id:\\d+}/shortComment", method = RequestMethod.GET)
    public ShortComments MyMovieShortComments(@PathVariable("id") int movieId) {
        ShortComments shortComments = null;
        String userId = (String) request.getSession().getAttribute("user");
        if (userId != null) {
            shortComments = shortCommentsService.getShortCommentByUserIdAndMovieId(Integer.parseInt(userId), movieId);
        }
        return shortComments;
    }

    /**
     * 返回前十个标签
     *
     * @param
     * @return
     */
    @RequestMapping(value = "/tags", method = RequestMethod.GET)
    public TagsInfoResponse MytenTags() {
        List<Tags> tags = tagsService.getTopNumTags(10);
        return new TagsInfoResponse(tags);
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

}

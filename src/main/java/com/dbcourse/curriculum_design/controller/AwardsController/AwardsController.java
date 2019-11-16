package com.dbcourse.curriculum_design.controller.AwardsController;


import com.dbcourse.curriculum_design.controller.AwardsController.response.AwardInfoResponse;
import com.dbcourse.curriculum_design.model.Awards;
import com.dbcourse.curriculum_design.model.MoviesAndAwards;
import com.dbcourse.curriculum_design.service.AwardsService;
import com.dbcourse.curriculum_design.service.MoviesAndAwardsService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/api/awards", method = {RequestMethod.GET, RequestMethod.POST}, produces = "application/json;charset=UTF-8")
public class AwardsController {

    @Resource
    AwardsService awardsService;

    @Resource
    MoviesAndAwardsService moviesAndAwardsService;

    @RequestMapping(value = "/{id:\\d+}", method = RequestMethod.GET)
    public AwardInfoResponse GetAwardInfo(@PathVariable int id){
        AwardInfoResponse response = new AwardInfoResponse();
        Awards award = awardsService.selectByAwardId(id);
        if (award==null){
            return response;
        }
        List<MoviesAndAwards> movies = moviesAndAwardsService.getMoviesByAwardId(id);

        response.setAward(award);
        response.setMovies(movies);
        return response;
    }


}

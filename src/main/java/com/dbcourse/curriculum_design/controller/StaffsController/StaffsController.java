package com.dbcourse.curriculum_design.controller.StaffsController;


import com.dbcourse.curriculum_design.controller.StaffsController.request.StaffsSearchRequest;
import com.dbcourse.curriculum_design.controller.StaffsController.response.StaffsResponse;
import com.dbcourse.curriculum_design.controller.StaffsController.response.StaffsSearchResponse;
import com.dbcourse.curriculum_design.elasticsearch.SearchStaff;
import com.dbcourse.curriculum_design.model.MoviesInfoAndStaffsId;
import com.dbcourse.curriculum_design.model.Staffs;
import com.dbcourse.curriculum_design.service.MoviesInfoAndStaffsIdService;
import com.dbcourse.curriculum_design.service.StaffsService;
import com.dbcourse.curriculum_design.utils.RequestUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "/api/staffs", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
public class StaffsController {

    @Resource
    HttpServletRequest request;

    @Resource
    StaffsService staffsService;

    @Resource
    MoviesInfoAndStaffsIdService moviesInfoAndStaffsIdService;

    @RequestMapping(value = "/{id:\\d+}", method = RequestMethod.GET)
    public StaffsResponse GetStaffs(@PathVariable int id) {
        StaffsResponse response = new StaffsResponse();
        Staffs staffs = staffsService.getStaffById(id);
        if (staffs == null) {
            return response;
        }
        int pageNum = RequestUtils.GetPage(request);
        int pageSizeNum = RequestUtils.GetPageSize(request);

        List<MoviesInfoAndStaffsId> movies = moviesInfoAndStaffsIdService.selectMoviesByStaffIdAndPage(id, pageNum, pageSizeNum);
        long moviesNum = moviesInfoAndStaffsIdService.countMoviesNumByStaffId(id);

        response.setMovies(movies);
        response.setMoviesNum(moviesNum);
        response.setStaffs(staffs);

        return response;
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public StaffsSearchResponse SearchStaffs(@RequestBody StaffsSearchRequest staffsSearchRequest){
        int pageNum = RequestUtils.GetPage(request);
        int pageSizeNum = RequestUtils.GetPageSize(request);
        SearchStaff searchStaff = new SearchStaff();
        StringBuilder builder = new StringBuilder();
        staffsSearchRequest.getTerms().forEach(t -> {
            builder.append(t.replaceAll("\\s*", ""));
            builder.append(" ");
        });
        String terms = builder.toString();
        Object[] o = searchStaff.search(staffsSearchRequest.getName(), terms, pageNum, pageSizeNum);
        searchStaff.closeClient();
        return new StaffsSearchResponse(o[0], o[1]);
    }
}

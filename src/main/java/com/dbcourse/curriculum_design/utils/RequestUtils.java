package com.dbcourse.curriculum_design.utils;

import javax.servlet.http.HttpServletRequest;

public class RequestUtils {
    public static Integer GetUser(HttpServletRequest request){
        return (Integer) request.getSession().getAttribute("user");
    }

    public static int GetPage(HttpServletRequest request){
        String page = request.getParameter("page");
        int pageNum = 1;
        if (page != null){
            pageNum = Integer.parseInt(page);
        }
        return pageNum;
    }

    public static int GetPageSize(HttpServletRequest request){
        String pageSize = request.getParameter("size");
        int pageSizeNum = 10;
        if (pageSize != null){
            pageSizeNum = Integer.parseInt(pageSize);
        }
        return pageSizeNum;
    }
}

package com.dbcourse.curriculum_design.controller.been.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StatusResponse {

    String code;
    String err;

    public static StatusResponse ok(){
        return StatusResponse.builder().code("200").build();
    }

    public static StatusResponse err(String code, String msg){
        return new StatusResponse(code,msg);
    }
}


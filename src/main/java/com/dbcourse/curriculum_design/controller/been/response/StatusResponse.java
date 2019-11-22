package com.dbcourse.curriculum_design.controller.been.response;

import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StatusResponse {
    @Expose
    String code;
    @Expose
    String err;

    public static StatusResponse ok(){
        return StatusResponse.builder().code("200").build();
    }

    public static StatusResponse err(String code, String msg){
        return new StatusResponse(code,msg);
    }
}


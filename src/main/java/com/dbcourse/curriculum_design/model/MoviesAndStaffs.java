package com.dbcourse.curriculum_design.model;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MoviesAndStaffs implements Serializable {

    @SerializedName("staff_id")
    @Expose
    private Integer staffid;

    @Expose(serialize = false)
    private Integer moiveid;

    @SerializedName("staff_type")
    @Expose
    private Integer stafftype;

    @SerializedName("staff_name")
    @Expose
    private String staffname;

    @SerializedName("staff_gender")
    @Expose
    private Short staffgender;


    @SerializedName("staff_photo")
    @Expose
    private String staffphoto;

    private static final long serialVersionUID = 1L;

    public static MoviesAndStaffsBuilder builder() {
        return new MoviesAndStaffsBuilder();
    }
}
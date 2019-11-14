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
    private Integer staffid;

    @Expose(serialize = false)
    private Integer moiveid;

    @SerializedName("staff_type")
    private Integer stafftype;

    @SerializedName("staff_name")
    private String staffname;

    @SerializedName("staff_gender")
    private Short staffgender;

    @SerializedName("staff_birthday")
    private String staffbirthday;

    @SerializedName("staff_occupation")
    private String staffoccupation;

    @SerializedName("staff_foreignname")
    private String staffforeignname;

    @SerializedName("staff_birthplace")
    private String staffbirthplace;

    @SerializedName("staff_photo")
    private String staffphoto;

    private static final long serialVersionUID = 1L;

    public static MoviesAndStaffsBuilder builder() {
        return new MoviesAndStaffsBuilder();
    }
}
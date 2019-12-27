package com.dbcourse.curriculum_design.model;

import java.io.Serializable;
import java.util.Date;

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
public class Movies implements Serializable {

    @SerializedName("id")
    @Expose
    private Integer nId;

    @SerializedName("name")
    @Expose
    private String cName;

    @SerializedName("film_length")
    @Expose
    private Integer nFilmLength;

    @SerializedName("alias")
    @Expose
    private String cAlias;

    @SerializedName("release_date")
    @Expose
    private Date dReleaseDate;

    @SerializedName("date_str")
    @Expose
    private String cDateStr;

    @SerializedName("info")
    @Expose
    private String cInfo;

    /**
     * ????
     */
    @SerializedName("movie_type")
    @Expose
    private String cMoiveType;

    /**
     * ????
     */
    @SerializedName("movie_area")
    @Expose
    private String cMoiveArea;

    /**
     * ????
     */
    @SerializedName("movie_language")
    @Expose
    private String cMoiveLanguage;

    @SerializedName("movie_cover")
    @Expose
    private String cMoiveCover;

    @SerializedName("movie_score")
    @Expose
    private Float fMovieScore;


    private Date dEditTime;

    private static final long serialVersionUID = 1L;

    public static MoviesBuilder builder() {
        return new MoviesBuilder();
    }
}
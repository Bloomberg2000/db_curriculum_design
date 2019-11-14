package com.dbcourse.curriculum_design.model;

import java.io.Serializable;
import java.util.Date;

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
    private Integer nId;

    @SerializedName("name")
    private String cName;

    @SerializedName("film_length")
    private Integer nFilmLength;

    @SerializedName("alias")
    private String cAlias;

    @SerializedName("release_date")
    private Date dReleaseDate;

    @SerializedName("date_str")
    private String cDateStr;

    @SerializedName("info")
    private String cInfo;

    /**
     * ????
     */
    @SerializedName("movie_type")
    private String cMoiveType;

    /**
     * ????
     */
    @SerializedName("movie_area")
    private String cMoiveArea;

    /**
     * ????
     */
    @SerializedName("movie_language")
    private String cMoiveLanguage;

    @SerializedName("movie_cover")
    private String cMoiveCover;

    @SerializedName("movie_score")
    private Float fMovieScore;

    private static final long serialVersionUID = 1L;

    public static MoviesBuilder builder() {
        return new MoviesBuilder();
    }
}
package com.stylefeng.guns.rest.film.vo;

import java.io.Serializable;

/**
 * @author: jia.xue
 * @create: 2019-11-27 11:42
 * @Description
 **/
public class FilmVO implements Serializable {

    private static final long serialVersionUID = 2583225089712528974L;

    private Integer uuid;

    private String filmName;

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }
}
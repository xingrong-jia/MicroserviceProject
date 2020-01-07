package com.stylefeng.guns.rest.film;

import com.stylefeng.guns.rest.film.vo.FilmVO;

/**
 * @author: jia.xue
 * @create: 2019-11-27 11:39
 * @Description
 **/
public interface FilmService {
    FilmVO getById(Integer id);
}
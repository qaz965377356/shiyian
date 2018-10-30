package com.shiyian.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.shiyian.entity.Film;

import java.util.List;

/**
 * @Auther: jzhang
 * @Date: 2018/10/23 22:32
 * @Description:
 */
public interface FilmService {
    IPage<Film> findPageList(Integer page, Integer size);
    void saveFilm(Film film);
}

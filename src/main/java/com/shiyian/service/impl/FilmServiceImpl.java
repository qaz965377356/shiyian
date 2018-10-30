package com.shiyian.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shiyian.entity.Film;
import com.shiyian.mapper.FilmMapper;
import com.shiyian.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: jzhang
 * @Date: 2018/10/23 22:33
 * @Description:
 */
@Service
public class FilmServiceImpl extends ServiceImpl<FilmMapper, Film> implements FilmService {
    public static Integer CURRENT_PAGE = 1;
    public static Integer PAGE_SIZE = 2;

    @Autowired
    private FilmMapper filmMapper;

    @Override
    public IPage<Film> findPageList(Integer page, Integer size) {
        if (page != null) {
            CURRENT_PAGE = page;
        }
        if (size != null) {
            PAGE_SIZE = size;
        }
        IPage<Film> pageFilm = filmMapper.selectPage(
                new Page<>(CURRENT_PAGE, PAGE_SIZE),
                new QueryWrapper<>());
        return pageFilm;
    }

    @Override
    public void saveFilm(Film film) {
        if(film.getId() != null) {
            filmMapper.updateById(film);
        } else {
            filmMapper.insert(film);
        }
    }
}

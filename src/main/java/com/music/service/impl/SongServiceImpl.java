package com.music.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.music.dao.SongDao;
import com.music.pojo.Song;
import com.music.service.SongService;
import com.music.utils.PagingResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 本类作者：贾伟杰
 * 创建时间为：2021/9/7 17:32
 * 本类作用：xxxx
 */
@Service
public class SongServiceImpl implements SongService {

    @Autowired
    private SongDao sDao;

    @Override
    public PagingResult selectAllSong(int pageNum, String name) {
        Page<Object> objects = PageHelper.startPage(pageNum, 6);
        List<Song> songs = sDao.selectAllSong(name);
        PagingResult pagingResult = new PagingResult();
        pagingResult.setData(songs);
        pagingResult.setMaxPage(objects.getPages());
        pagingResult.setTotal(objects.getTotal());
        return pagingResult;
    }

    @Override
    public String addSong(Song song) {
        try {
            sDao.addSong(song);
            return "ok";
        }catch (Exception e) {
            return "no";
        }
    }

    @Override
    public String updateNameById(Song song) {
        try {
            if(!"".equals(song.getName()) &&song.getName() != null) {
                sDao.updateNameById(song);
            }
            return "ok";
        }catch (Exception e) {
            return "no";
        }
    }

    @Override
    public String updateUrlById(Song song) {
        try {
            if(!"".equals(song.getUrl()) && song.getUrl() != null) {
                sDao.updateUrlById(song);
            }
            return "ok";
        }catch (Exception e) {
            return "no";
        }
    }
}

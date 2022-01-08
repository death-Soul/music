package com.music.service;


import com.music.pojo.Song;
import com.music.utils.PagingResult;

/**
 * 本类作者：贾伟杰
 * 创建时间为：2021/9/7 17:31
 * 本类作用：xxxx
 */
public interface SongService {
    
    PagingResult selectAllSong(int pageNum, String name);

    String addSong(Song song);

    String updateNameById(Song song);

    String updateUrlById(Song song);
}

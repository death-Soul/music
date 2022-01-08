package com.music.dao;

import com.music.pojo.Song;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 本类作者：贾伟杰
 * 创建时间为：2021/9/7 17:30
 * 本类作用：xxxx
 */
@Repository
public interface SongDao {

    List<Song> selectAllSong(@Param("name") String name);

    void addSong(Song song);

    void updateNameById(Song song);

    void updateUrlById(Song song);
}

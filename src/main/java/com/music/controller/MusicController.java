package com.music.controller;

import com.music.pojo.Song;
import com.music.service.SongService;
import com.music.utils.PagingResult;
import com.music.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 本类作者：贾伟杰
 * 创建时间为：2021/9/7 17:28
 * 本类作用：xxxx
 */
@Controller
@RequestMapping("/music")
public class MusicController {

    @Autowired
    private SongService songService;
    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping("/music")
    public String goMusic() {
        return "music";
    }

    @RequestMapping("selectAllSong")
    @ResponseBody
    public PagingResult selectAllSong(Integer pageNum, String name) {
        return songService.selectAllSong(pageNum, name);
    }

    @RequestMapping("/getColor")
    @ResponseBody
    public String getColor() {
        return (String) redisUtil.getObject("color");
    }

    @RequestMapping("/updateColor")
    @ResponseBody
    public String updateColor(String color) {
        try {
            redisUtil.putObject("color", color);
            return "ok";
        }catch (Exception e) {
            return "no";
        }
    }

    @RequestMapping("/addSong")
    @ResponseBody
    public String addSong(@RequestBody Song song) {
        return songService.addSong(song);
    }

    @RequestMapping("/updateNameById")
    @ResponseBody
    public String updateNameById(@RequestBody Song song) {
        return songService.updateNameById(song);
    }

    @RequestMapping("/updateUrlById")
    @ResponseBody
    public String updateUrlById(@RequestBody Song song) {
        return songService.updateUrlById(song);
    }
}

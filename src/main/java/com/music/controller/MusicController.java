package com.music.controller;

import com.music.pojo.Song;
import com.music.redis.Redis;
import com.music.service.SongService;
import com.music.utils.PagingResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.Jedis;

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
        Jedis jedis = Redis.getJedis();
        return jedis.get("color");
    }

    @RequestMapping("/updateColor")
    @ResponseBody
    public String updateColor(String color) {
        try {
            Jedis jedis = Redis.getJedis();
            jedis.set("color", color);
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

package com.music.controller;

import com.music.pojo.Song;
import com.music.utils.ResultInfo;
import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 本类作者：贾伟杰
 * 创建时间为：2021/12/30 15:39
 * 本类作用：xxxx
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public ResultInfo test() {
        return new ResultInfo(true, "eretyrutikyjt");
    }


    @Test
    public void testOne() {
        Song song = new Song();
        song.setName("测试");
        int num = 10;
        System.out.println(song);
        testData(song, num);
        System.out.println(song);
        System.out.println(num);
    }

    private void testData(Song song, int num) {
        song.setId(1);
        num--;
        System.out.println(num);
//        return song;
    }

    @Test
    public void testTwo() {
        int a = 10;
        Integer num = new Integer(10);
        System.out.println(num.equals(a));
        String str = null;
        System.out.println(str.equals(null));   //空指针
    }
}

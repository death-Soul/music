package com.music.controller;

import com.music.utils.ResultInfo;
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
public class Test {

    @RequestMapping("/test")
    @ResponseBody
    public ResultInfo test() {
        return new ResultInfo(true, "eretyrutikyjt");
    }
}

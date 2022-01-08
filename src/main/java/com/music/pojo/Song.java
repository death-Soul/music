package com.music.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 本类作者：贾伟杰
 * 创建时间为：2021/9/7 17:29
 * 本类作用：xxxx
 */
@Data
public class Song implements Serializable {

    private int id;
    private String url;
    private String name;

}

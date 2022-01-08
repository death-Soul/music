package com.music.redis;

import redis.clients.jedis.Jedis;

/**
 * 本类作者：贾伟杰
 * 创建时间为：2021/11/25 19:57
 * 本类作用：xxxx
 */
public class Redis {

    private static Jedis jedis;

    static {
        jedis = new Jedis("192.168.16.1", 6379);
    }
    
    public static Jedis getJedis() {
        return jedis;
    }
}

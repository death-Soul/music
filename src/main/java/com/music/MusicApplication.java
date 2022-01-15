package com.music;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import redis.clients.jedis.JedisPool;

@SpringBootApplication
@MapperScan(basePackages = {"com.music.dao"})
public class MusicApplication {

    public static void main(String[] args) {
        SpringApplication.run(MusicApplication.class, args);
    }

    @Bean
    public JedisPool getRedisPool() {
        return new JedisPool("127.0.0.1", 6379);
    }
}

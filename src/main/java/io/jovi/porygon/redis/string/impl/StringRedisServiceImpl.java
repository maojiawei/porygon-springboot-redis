package io.jovi.porygon.redis.string.impl;

import io.jovi.porygon.redis.string.StringRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * <p>
 * Title:
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2019
 * All rights reserved. 2019-03-28.
 * </p>
 *
 * @author MaoJiaWei
 * @version 1.0
 */
@Service
public class StringRedisServiceImpl implements StringRedisService {
    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    /**
     * 为指定的key设置值
     *
     * @param key redis的键
     * @param value redis对应的值
     */
    public void set(String key,String value) {
        redisTemplate.opsForValue().set(key,value);
    }

    /**
     * 获取key对应的值
     *
     * @param key redis的键
     */
    public String get(String key) {
        return redisTemplate.opsForValue().get(key);
    }
}

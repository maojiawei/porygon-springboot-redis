package io.jovi.porygon.redis.string;

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
public interface StringRedisService {
    /**
     * 为指定的key设置值
     *
     * @param key redis的键
     * @param value redis对应的值
     */
    void set(String key,String value);

    /**
     * 获取key对应的值
     *
     * @param key redis的键
     */
    String get(String key);
}

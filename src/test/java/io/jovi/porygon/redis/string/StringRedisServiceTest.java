package io.jovi.porygon.redis.string;

import io.jovi.porygon.redis.RedisApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * <p>
 * Title:
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2019
 * All rights reserved. 2019-03-29.
 * </p>
 *
 * @author MaoJiaWei
 * @version 1.0
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {RedisApplication.class})
public class StringRedisServiceTest {
    @Autowired
    private StringRedisService service;

    @Test
    public void set(){
        service.set("springboot:redis:key","springboot-value");
    }

    @Test
    public void get(){
        String value = service.get("springboot:redis:key");
        log.info("value={}",value);
    }
}

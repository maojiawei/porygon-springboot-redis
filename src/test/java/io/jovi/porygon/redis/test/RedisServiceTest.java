package io.jovi.porygon.redis.test;

import io.jovi.porygon.redis.RedisApplication;
import io.jovi.porygon.redis.entity.UserDO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
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
 * </p>
 *
 * @author Jovi
 * @version 1.0
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {RedisApplication.class})
public class RedisServiceTest {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test(){
        UserDO user = new UserDO();
        user.setName("jovi");
        user.setGender(1);
        redisTemplate.opsForValue().set("porgon:redis:test",user);


        Object value = redisTemplate.opsForValue().get("porgon:redis:test");

        log.info(value.toString());
    }
}

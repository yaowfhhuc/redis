package me.test.redis.myredis;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import me.test.redis.myredis.pojo.MSEvent;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class ApplicationTest {

    @Autowired
    private RedisTemplate<String,MSEvent> redisTemplate;

    @Test
    public void test() throws Exception {
        // 保存对象
        MSEvent event = new MSEvent();
        event.setRECORD_ID(12344);
        redisTemplate.opsForValue().set(event.getRECORD_ID()+"", event);

        Assert.assertEquals(12344, redisTemplate.opsForValue().get("12344").getRECORD_ID());
    }

}
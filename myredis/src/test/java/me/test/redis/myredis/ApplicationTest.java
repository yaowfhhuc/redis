package me.test.redis.myredis;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import me.test.redis.myredis.dao.MSEventDao;
import me.test.redis.myredis.pojo.MSEvent;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class ApplicationTest {

	@Autowired
	private MSEventDao msEventDao;

    @Test
    public void test() throws Exception {
        // 保存对象
        MSEvent event = new MSEvent();
        event.setRECORD_ID(12344);
        event.setDISP_ID("disp_id");
        msEventDao.set( event);

        Assert.assertEquals("disp_id", msEventDao.get("disp_id").getDISP_ID());
    }

}
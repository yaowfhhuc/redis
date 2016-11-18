package me.test.redis.myredis;

import java.util.Map;
import java.util.UUID;

import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;

import me.test.redis.myredis.pojo.MSEvent;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String[] args) {
		final String key = UUID.randomUUID().toString();
		JedisConnectionFactory conn;
		final RedisTemplate<String, Object> redisTemplate;
		conn = new JedisConnectionFactory();
		conn.setHostName("localhost");
		conn.setPort(6379);
		conn.afterPropertiesSet();
		redisTemplate = new RedisTemplate<String, Object>();
		redisTemplate.setConnectionFactory(conn);
		redisTemplate.afterPropertiesSet();

		BoundHashOperations<String, Object, Object> boundHashOperations = redisTemplate.boundHashOps(key);
		MSEvent event = new MSEvent();
		event.setUSERS_TAG("bbbbbbbbbbbbbbbbbb");
		event.setDISP_ID("aaaaaaaaaaaaaaa");
		boundHashOperations.put("event", event);
		boundHashOperations.put("count", 12);

		redisTemplate.execute(new RedisCallback<Object>() {
			@Override
			public MSEvent doInRedis(RedisConnection connection) throws DataAccessException {
				BoundHashOperations<String, Object, Object> boundHashOperations = redisTemplate.boundHashOps(key);
				Map<Object, Object> data = boundHashOperations.entries();
				System.out.println(data.get("event"));
				System.out.println(data.get("count"));
				return null;
			}
		});
	}
}

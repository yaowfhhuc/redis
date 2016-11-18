package me.test.redis.myredis.dao;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import me.test.redis.myredis.pojo.MSEvent;

@Repository
public class MSEventDao {

	@Autowired
	RedisTemplate<Object, Object> redisTemplate;
	
	@Resource(name="redisTemplate")
	ValueOperations<Object, Object> operations;
	
	public void set(MSEvent event){
		operations.set(event.getDISP_ID(), event);
	}
	
	public MSEvent get(String id){
		return (MSEvent)operations.get(id);
	}
	
}

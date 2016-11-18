package me.test.redis.myredis.controller;

import java.util.Map;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.test.redis.myredis.dao.MSEventDao;
import me.test.redis.myredis.pojo.MSEvent;

@RequestMapping("/")
@RestController
public class RedisController {

	private Logger logger = LoggerFactory.getLogger(RedisController.class);
	
	@Autowired
	private MSEventDao msEventDao;

	@RequestMapping("/set")
	public String set(){
		MSEvent event = new MSEvent();
		event.setUSERS_TAG("bbbbbbbbbbbbbbbbbb");
		event.setDISP_ID("aaaaaaaaaaaaaaa");
		msEventDao.set(event);
		logger.info("set "+event.toString());
		return event.toString();
	}
	
	@RequestMapping("/get")
	public String get(){
		return msEventDao.get("aaaaaaaaaaaaaaa").toString();
	}
	
}

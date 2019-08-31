package com.zzy.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisTest1 {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost",6379);
		int i = 0;
		try {
			long start = System.currentTimeMillis();
			while(true) {
				long end = System.currentTimeMillis();
				if(end-start>1000) {
					break;
				}
				i++;
				jedis.set("test"+i, i+"");
			}
		}finally {
			jedis.close();
		}
		System.out.println("redis每秒操作"+i+"次");
	}
	public static void JedisPool() {
		JedisPoolConfig jedisPool = new JedisPoolConfig();
		//设置最大空闲数
		jedisPool.setMaxIdle(50);
		//最大连接数
		jedisPool.setMaxTotal(100);
		//最大等待
		jedisPool.setMaxWaitMillis(20000);
		//使用配置创建连接池
		JedisPool pool = new JedisPool(jedisPool,"localhost");
		//从连接池中获取单个连接
		Jedis jedis = pool.getResource();
	}
}

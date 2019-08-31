package com.zzy.redis;

import java.util.Iterator;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisTest {
	public static Log log = LogFactory.getLog(RedisTest.class);
	@Test
	public void testJedisSingle() {
		//设置IP地址和端口
//		Jedis jedis = new Jedis("192.168.43.156",6379);
		Jedis jedis = new Jedis("127.0.0.1",6379);
		//设置数据
		//jedis.set("ID", "4102211994");
		//获得数据
		System.out.println(jedis.dbSize());
		jedis.flushAll();
		System.out.println(jedis.dbSize());
		//String id = jedis.get("ID");
		//System.out.println("id:"+id);
		jedis.close();
		
	}
	private void batchDel(Jedis jedis){
		String pre_str = "organ_user";
		Set<String> set = jedis.keys(pre_str +"*");
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String keyStr = it.next();
			System.out.println(keyStr);
			jedis.del(keyStr);
		}
	}


	//@Test
	public void testJedisPool() {
		//获得连接池配置对象，设置配置项
		JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
		//最大连接数
		jedisPoolConfig.setMaxTotal(30);
		//最大空闲连接数
		jedisPoolConfig.setMaxIdle(10);
		
		//获得连接池
		JedisPool jedisPool = new JedisPool(jedisPoolConfig,"192.168.43.156",6379);
		//获得核心对象
		Jedis jedis = null;
		try {
			jedis = jedisPool.getResource();//核心点，jedis从jedisPool中获取
			//设置数据
			jedis.set("subject", "Redis");
			String subject = jedis.get("subject");
			System.out.println("subject->"+subject);
		}catch (Exception e) {
			//e.printStackTrace();
			log.error("出现异常",e);
		}finally {
			if(jedis !=null) {
				jedis.close();
			}
			//虚拟机关闭时，释放pool资源
			if(jedisPool !=null) {
				jedisPool.close();
			}
		}
		
		
	}
}

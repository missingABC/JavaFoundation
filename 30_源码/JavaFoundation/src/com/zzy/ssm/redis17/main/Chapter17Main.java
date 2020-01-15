package com.zzy.ssm.redis17.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

import com.zzy.ssm.redis17.jedis.JedisTest;
import com.zzy.ssm.redis17.pojo.Role;

public class Chapter17Main {
	public static void main(String[] args) {
		testJedis();
		testSpring();
	}
	private static void testJedis() {
		JedisTest jedisTest = new JedisTest();
		jedisTest.testJedis();
	}
	private static void testSpring() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		RedisTemplate redisTemplate = applicationContext.getBean(RedisTemplate.class);
		Role role = new Role();
		role.setId(1L);
		role.setRoleName("role_name_1");
		role.setNote("note_1");
		redisTemplate.opsForValue().set("role_1", role);
		Role role1 = (Role) redisTemplate.opsForValue().get("role_1");
		System.out.println(role1.getRoleName());
	}
}

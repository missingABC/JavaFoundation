package com.zzy.ssm.chapter2.proxy;

import org.junit.Test;

public class ProxyTest {
	//测试jdk动态代理
//	@Test
	public void testJdkProxy() {
		JdkProxyExample jdkProxyExample = new JdkProxyExample();
		HelloWorld proxy = (HelloWorld)jdkProxyExample.bind(new HelloWorldImpl());
		proxy.sayHelloWorld();
		
	}
	//测试CGLIB代理
	@Test
	public void testCGLIBProxy() {
		CglibProxyExample cglibProxyExample = new CglibProxyExample();
		ReflectServiceImpl proxy = (ReflectServiceImpl)cglibProxyExample.getProxy(ReflectServiceImpl.class);
		proxy.sayHello("张三");
	}
}

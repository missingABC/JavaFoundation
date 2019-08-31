package com.zzy.ssm.chapter2.interceptor;

import org.junit.Test;

import com.zzy.ssm.chapter2.proxy.HelloWorld;
import com.zzy.ssm.chapter2.proxy.HelloWorldImpl;

public class TestInterceptor {
	
	
	@Test
	public  void testInterceptor() {
		HelloWorld proxy = (HelloWorld) InterceptorJdkProxy.bind(new HelloWorldImpl(), 
				"com.zzy.ssm.chapter2.interceptor.MyInterceptor");
		proxy.sayHelloWorld();
	}
	
	public static void testChain() {
		HelloWorld proxy1 = (HelloWorld) InterceptorJdkProxy.bind(
                new HelloWorldImpl(), "com.lean.ssm.chapter2.intercept.Interceptor1");
        HelloWorld proxy2 = (HelloWorld) InterceptorJdkProxy.bind(
                proxy1, "com.lean.ssm.chapter2.intercept.Interceptor2");
        HelloWorld proxy3 = (HelloWorld) InterceptorJdkProxy.bind(
                proxy2, "com.lean.ssm.chapter2.intercept.Interceptor3");
        proxy3.sayHelloWorld();
	}
}

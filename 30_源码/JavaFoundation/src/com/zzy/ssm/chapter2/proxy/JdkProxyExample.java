package com.zzy.ssm.chapter2.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxyExample implements InvocationHandler{
	//真实对象
	private Object target = null;
	/**
	 * 建立真实对象和代理对象之间的代理关系，并返回代理对象
	 * @return
	 */
	public Object bind(Object target) {
		this.target = target;
		//三个参数：类加载器；把生成的代理对象下挂到哪些接口下（将生成的代理对象放在target实现的接口下）；实现方法逻辑的代理类（this代表当前类）
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
	
	/**
	 * 代理方法逻辑
	 * 代理对象、当前调度的方法，当前方法参数
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("进入代理逻辑方法");
		System.out.println("在调度真实对象之前的服务");
		Object obj = method.invoke(target, args);
		System.out.println("在调度真实对象之后的服务");
		return obj;
	}

}

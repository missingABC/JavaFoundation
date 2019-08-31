package com.zzy.ssm;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxyExample implements InvocationHandler {

	// 真实对象
	private Object target = null;

	/**
	 * 第一步：建立代理对象和真实对象的代理关系，并返回代理对象
	 * @Title: bind
	 * @Description: 首先使用类的属性target保存了真实对象，通过newProxyInstance生成代理的对象
	 * 三个参数 ①类加载器（使用target本身的类加载器）②把生成的动态代理对象下挂到哪些接口下 ③定义实现方法逻辑代理类，
	 * @param @param target
	 * @param @return
	 * @return Object
	 * @throws
	 */
	public Object bind(Object target) {
		this.target = target;
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}

	/**
	 * 实现 代理方法逻辑
	 * 
	 * @param proxy
	 *            --代理对象 就是bind方法生成的对象
	 * @param method
	 *            --当前调度方法
	 * @param args
	 *            --当前方法参数
	 * @return 代理结果返回
	 * @throws Throwable
	 *             异常
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("进入代理逻辑方法");
		System.out.println("在调度真实对象之前的服务");
		Object obj = method.invoke(target, args);// 相当于调用sayHelloWorld方法
		System.out.println("在调度真实对象之后的服务");
		return obj;
	}
}
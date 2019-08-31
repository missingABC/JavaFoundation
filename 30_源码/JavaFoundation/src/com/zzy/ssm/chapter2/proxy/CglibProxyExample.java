package com.zzy.ssm.chapter2.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * Cglib代理
 * @author Administrator
 * 不需要提供接口，只要一个非抽象类就可以实现动态代理
 *
 */
public class CglibProxyExample implements MethodInterceptor{
	
	/**
	 * 生成Cglib代理对象
	 */
	public Object getProxy(Class cla) {
		//Cglib enhancer增强类对象
		Enhancer enhancer = new Enhancer();
		//设置增强类型
		enhancer.setSuperclass(cla);
		//定义代理逻辑对象为当前对象，要求当前对象实现MethodInterceptor方法
		enhancer.setCallback(this);
		//生成并返回对象
		return enhancer.create();
	}
	
	/**
	 * 代理逻辑方法
	 */
	@Override
	public Object intercept(Object proxy, Method method,
			Object[] args, MethodProxy methodProxy) throws Throwable {
		System.out.println("调用真实对象前");
		Object invokeSuper = methodProxy.invokeSuper(proxy, args);
		System.err.println("调用真实对象后");
		return invokeSuper;
	}

}

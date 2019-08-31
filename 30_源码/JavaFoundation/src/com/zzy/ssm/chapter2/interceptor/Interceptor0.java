package com.zzy.ssm.chapter2.interceptor;

import java.lang.reflect.Method;

public interface Interceptor0 {
	//参数，proxy代理对象，target真实对象，method方法，args运行时参数
		//真实对象前调用，返回true，则反射真实对象的方法，返回false时调用around方法
		public boolean before(Object proxy,Object target,Method method,Object[] args);
		
		public void around(Object proxy,Object target,Method method,Object[] args);
		
		public void after(Object proxy,Object target,Method method,Object[] args);
}

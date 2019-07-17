package com.ys.ClassicExample;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理设计模式
 * @类描述：
 * @创建人：zzy
 * @创建时间：2019年7月17日下午5:38:00
 * @version v1.0
 */
interface Subject{
	String say(String name,int age);
}

class RealSubject implements Subject{

	@Override
	public String say(String name, int age) {
		return "姓名："+name+",年龄："+age;
	}
	
}

class MyInvocationHandler implements InvocationHandler{
	private Object obj;
	public Object bind(Object obj) {
		this.obj = obj;
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),this);
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object temp = method.invoke(this.obj, args);
		return temp;
	}
	
}
public class DynaProxyDemo {
	public static void main(String[] args) {
		Subject sub = (Subject) new MyInvocationHandler().bind(new RealSubject());
		String info = sub.say("张三", 22);
		System.out.println(info);
				
	}
}

package com.ys.ClassicExample;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ��̬�������ģʽ
 * @��������
 * @�����ˣ�zzy
 * @����ʱ�䣺2019��7��17������5:38:00
 * @version v1.0
 */
interface Subject{
	String say(String name,int age);
}

class RealSubject implements Subject{

	@Override
	public String say(String name, int age) {
		return "������"+name+",���䣺"+age;
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
		String info = sub.say("����", 22);
		System.out.println(info);
				
	}
}

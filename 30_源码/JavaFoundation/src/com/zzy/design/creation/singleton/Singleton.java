package com.zzy.design.creation.singleton;

import org.junit.Test;

public class Singleton {
	//持有私有静态属性实例，防止被引用，此处赋为null，目的是为了实现延迟加载
	private static Singleton instance = null;
	//私有构造方法，防止被实例化
	private Singleton() {
	}
	
	//对外提供的创建实例的方法
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	//如果该对象用于序列化，可以保证对象在序列化前后保持一致
	public Object readResolve() {
		return instance;
	}
	
}

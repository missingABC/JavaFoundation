package com.zzy.design.creation.singleton;
/**
 * ③当JVM创建对象和赋值操作时分开时，那么SingletonSafe中的②方法这种安全就不安全了-》
 * @author Administrator
 *解决办法：使用内部类，JVM能够保证当一个类被加载的时候，这个类的加载过程是线程互斥的（即这个类在加载的过程中，不可能再被加载）
 *将创建实例的 办法写在内部类中，即可保证instance只被创建一次，并且能够保证把值赋给instance的内存初始化完毕
 */
public class SingletonThreadSafe2 {
	//私有构造方法，防止被实例化
	private SingletonThreadSafe2() {
	}
	//此处使用一个内部类在维护单例
	private static class SingletonFactory{
		private static SingletonThreadSafe2  instanThreadSafe2 = new SingletonThreadSafe2();
	}
	//获取实例
	public static SingletonThreadSafe2 getInstance() {
		return SingletonFactory.instanThreadSafe2;
	}
	//如果该对象用于序列化，可以保证对象在序列化前后一致
	public Object readResolve() {
		return getInstance();
	}
}

package com.zzy.design.creation.singleton;
/**
 * 在多线程中保证单例模式的线程安全
 * @author Administrator
 * ①在创建实例的方法上加锁（getInstance）->性能低下，每次调用都会加锁
 * ②只在第一次创建对象的时候加锁就可以了,只当instance为null需要创建的的时候才加锁=》双重同步锁
 * ③当JVM创建对象和赋值操作时分开时，那么②这种安全就不安全了-》
 *
 */
public class SingletonThreadSafe {
	private static SingletonThreadSafe instanceSingleton = null;
	private SingletonThreadSafe() {
	}
	public static /*synchronized*/ SingletonThreadSafe getInstance() {
		if(instanceSingleton == null) {
			synchronized (instanceSingleton) {
				if(instanceSingleton == null) {
					instanceSingleton = new SingletonThreadSafe();
				}
			}
		}
		return instanceSingleton;
	}
}

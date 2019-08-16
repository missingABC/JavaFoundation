package com.zzy.design.creation.singleton;

/**
 * 继上
 * 因为创建和赋值可能被分开完成，造成线程不安全的隐患，所以直接将创建和赋值分开进行处理，也是可以的
 * 只需要在创建instance的时候加锁就可以了
 * @author Administrator
 * 
 *
 */
public class SingletonThreadSafe3 {
	private static SingletonThreadSafe3 instanceThreadSafe3 = null;
	private SingletonThreadSafe3() {
	}
	private static synchronized void syncInit() {
		if(instanceThreadSafe3 == null) {
			instanceThreadSafe3 = new SingletonThreadSafe3();
		}
	}
	public static SingletonThreadSafe3 getInstance() {
		if(instanceThreadSafe3 == null) {
			syncInit();
		}
		return instanceThreadSafe3;
	}
}

package com.ys.ClassicExample;
/**
 * 单例模式
 * @类描述：
 * @创建人：zzy
 * @创建时间：2019年7月17日下午1:06:52
 * @version v1.0
 */
class Singleton{
	//1.内部产生本类的实例化对象
	private static Singleton instance = new Singleton();
		/**
		 * 2.通过静态方法获得instance对象
		 * @描述:
		 * @return
		 * @返回类型 Singleton
		 * @创建人 ZZY
		 * @创建时间 2019年7月17日下午12:50:52
		 */
		public static Singleton getInstance() {
			return instance;
		}		
		//将构造方法进程封装、私有化
		public Singleton() {
		}
		public void print() {
			System.out.println("Hello Singleton");
		}
}

public class SingletonDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s1 = null;
		Singleton s2 = null;
		Singleton s3 = null;
		s1 = Singleton.getInstance();
		s2 = Singleton.getInstance();
		s3 = Singleton.getInstance();
		s1.print();
		s2.print();
		s3.print();
		System.out.println("s1->"+s1);
		System.out.println("s2->"+s2);
		System.out.println("s3->"+s3);//地址相同说明是同一对象
	}

}

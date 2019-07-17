package com.ys.ClassicExample;
/**
 * ����ģʽ
 * @��������
 * @�����ˣ�zzy
 * @����ʱ�䣺2019��7��17������1:06:52
 * @version v1.0
 */
class Singleton{
	//1.�ڲ����������ʵ��������
	private static Singleton instance = new Singleton();
		/**
		 * 2.ͨ����̬�������instance����
		 * @����:
		 * @return
		 * @�������� Singleton
		 * @������ ZZY
		 * @����ʱ�� 2019��7��17������12:50:52
		 */
		public static Singleton getInstance() {
			return instance;
		}		
		//�����췽�����̷�װ��˽�л�
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
		System.out.println("s3->"+s3);//��ַ��ͬ˵����ͬһ����
	}

}

package com.ys.intTest;

public class IntegerTest {
	public static void main(String[] args) {
		 Integer i = 10;//�Զ�װ�� Integer i = Integer.valueOf(10)
		 Integer j = 10;
		 System.out.println(i == j);//true
		 Integer a = 128;//û�л���
		 Integer b = 128;
		 System.out.println(a == b);//false
		 int k = 10;
		 System.out.println(k == i);//true ����Ƚ�
		 int kk = 128;
		 System.out.println(kk == a);//true
		 Integer m = new Integer(10);
		 Integer n = new Integer(10);
		 System.out.println(m == n);
		
	}
	
}

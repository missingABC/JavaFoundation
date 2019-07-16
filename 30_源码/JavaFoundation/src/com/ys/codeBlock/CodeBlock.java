package com.ys.codeBlock;

public class CodeBlock {
	static{
		System.out.println("静态代码块");
	}
	{
		System.out.println("构造代码块");
	}
	public CodeBlock(){
		System.out.println("无参构造函数");
	}
	public CodeBlock(String str){
		System.out.println("有参构造函数");
	}
	public void sysHello(){
		{
			System.out.println("普通构造代码块");
		}
	}
	public static void main(String[] args) {
		new CodeBlock().sysHello();
		System.out.println("main");
		System.out.println("--------------------");
		new CodeBlock().sysHello();
	}
}

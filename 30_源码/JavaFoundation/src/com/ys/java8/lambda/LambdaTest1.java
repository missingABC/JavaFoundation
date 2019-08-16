package com.ys.java8.lambda;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class LambdaTest1 {
	public static void main(String[] args) {
		//java8以前
		 new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Before Java8,too much code for to do little thing");
			}
		}).start();
		 //java8
		new Thread(()->System.out.println("In Java8,Lambda expression rocks!")).start();
		System.out.println("----------带参数------");
		//使用Java8lambda表达式进行事件处理
		JButton show = new JButton("show");
		show.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Event handing without Java8 lambda expression is boring ");
			}
		});
		//Java8方式
		show.addActionListener((e)->System.out.println("Light,Camera ,Java8"));
		
		
	}
}

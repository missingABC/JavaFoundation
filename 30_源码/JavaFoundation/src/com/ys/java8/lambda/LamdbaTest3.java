package com.ys.java8.lambda;

import java.util.Arrays;
import java.util.List;

public class LamdbaTest3 {
	public static void main(String[] args) {
		List<Integer> costBeforeTax = Arrays.asList(100,200,300,400);
		for (Integer cost : costBeforeTax) {
			double price = cost + 0.12*cost;
			System.out.println(price);
		}
		//使用lambda表达式
		System.out.println("使用Lambda表达式");
		List<Integer> costBeforeTaxa = Arrays.asList(100,200,300,400);
		costBeforeTaxa.stream().map((cost)->cost+0.12*cost).forEach(System.out::println);
	}
}

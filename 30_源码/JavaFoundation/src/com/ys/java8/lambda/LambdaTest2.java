package com.ys.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaTest2 {
	public static void main(String[] args) {
		List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
		for (String feature : features) {
			System.out.println(feature);
		}
		System.out.println("---------Java8 以后---------");
		List<String> arrays = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
		//arrays.forEach(n->System.out.println(n));
		arrays.forEach(System.out::println);//Java8的新语法
		
		
		System.out.println("----------Predicate接口---------");
		List<String> language = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
		System.out.println("Languages which starts with J :");
		filter(language,(str)->str.startsWith("J"));
		System.out.println("Print all languages :");
		filter(language, (str)->true);
		System.out.println("Print no languages :");
		filter(language, (o)->false);
		System.out.println("Print language whose length greater than 4:");
		filter(language, (v)->v.length()>=4);
		
	}
	public static void filter(List<String> names,Predicate<String> condition) {
		for (String name : names) {
			if(condition.test(name)) {
				System.out.println(name+" ");
			}
		}
	}
	//filter方法优化
	private static  void filters(List<String> names,Predicate<String> condition) {
		names.stream().filter((name)->(condition.test(name))).forEach((name)->{
			System.out.println(name+" ");
		});
		
	}
}

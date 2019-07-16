package com.ys.enumTest;

public class SeasonTest {
	public static void main(String[] args) {
		System.out.println(Season.SPRING);
		System.out.println(Season.SUMMER);
		System.out.println(Season.FALL);
		System.out.println(Season.WINTER);
		System.out.println("Enum---");
		for(SeasonEnum s:SeasonEnum.values()){
			System.out.println(s.toString());
		}
		
		System.out.println("Interface Enum---");
		for(SeasonEnumTest s:SeasonEnumTest.values()){
			System.out.println(s+"->"+s.getMonth()+"ÔÂ");
		}
	}
}

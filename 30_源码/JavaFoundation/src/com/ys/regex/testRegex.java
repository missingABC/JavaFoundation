package com.ys.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class testRegex {
	@Test
	public void testRegex() {
//		Pattern pattern = Pattern.compile("^(?![A-Za-z0-9]+$)(?![a-z0-9\\\\W]+$)(?![A-Za-z\\\\W]+$)(?![A-Z0-9\\\\W]+$)[a-zA-Z0-9\\\\W]{8,16}$");
		//Pattern pattern = Pattern.compile("^(?=.*[a-zA-Z0-9].*)(?=.*[a-zA-Z\\W].*)(?=.*[0-9\\W].*).{8,16}$");
		Pattern pattern = Pattern.compile("^(?![A-Z]+$)(?![a-z]+$)(?!\\d+$)(?![\\W_]+$)\\S{8,16}$");
//		String s = "uim_2019";
		
		
//		String s = "!@#qwe123";
		String s = "#$%%_!@#1";
		Matcher matcher =  pattern.matcher(s);
		if(matcher.matches()) {
			System.out.println("验证成功");
		}else {
			System.out.println("验证失败！");
		}
	}
}

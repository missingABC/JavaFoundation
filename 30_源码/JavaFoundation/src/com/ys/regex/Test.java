package com.ys.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static void main(String [] args) {
		String str = "办公厅（暂时）aa14";
		String pattern = "[\u4e00-\u9fa5-\\w-.（.）]+";

		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(str);
		System.out.println(m.matches());
	}



}

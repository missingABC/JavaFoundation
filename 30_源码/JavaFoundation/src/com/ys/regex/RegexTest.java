package com.ys.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
	public static void main(String[] args) {
		//电话
//		Pattern pattern = Pattern.compile("^1([38][0-9]|4[579]|5[0-3,5-9]|6[6]|7[0135678]|9[89])\\d{8}$");
		//密码
		Pattern pattern = Pattern.compile("^(?![A-Za-z0-9]+$)(?![a-z0-9\\\\W]+$)(?![A-Za-z\\\\W]+$)(?![A-Z0-9\\\\W]+$)[a-zA-Z0-9\\\\W]{8,}$");
		//^(?![A-Za-z0-9]+$)(?![a-z0-9\\W]+$)(?![A-Za-z\\W]+$)(?![A-Z0-9\\W]+$)[a-zA-Z0-9\\W]{8,}$
		String s = "19939912808";
		Matcher matcher =  pattern.matcher(s);
//		if(matcher.find()) {
		//matches()方法是完全匹配，即整个字符串必须匹配该正则表达式
		//find()方法是部分匹配，即在整个字符串中，寻找匹配该正则表达式的子字符串序列，只要找到这样的子字符串，即返回true。
		if(matcher.matches()) {
			System.out.print("匹配成功！");
		}else {
			System.out.print("匹配失败！");
		}
		//方式2
		String regex = "1[378][0-9]{9}";
		boolean b = s.matches(regex);
		
	}
}

package com.ys.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
	public static void main(String[] args) {
		//�绰
//		Pattern pattern = Pattern.compile("^1([38][0-9]|4[579]|5[0-3,5-9]|6[6]|7[0135678]|9[89])\\d{8}$");
		//����
		Pattern pattern = Pattern.compile("^(?![A-Za-z0-9]+$)(?![a-z0-9\\\\W]+$)(?![A-Za-z\\\\W]+$)(?![A-Z0-9\\\\W]+$)[a-zA-Z0-9\\\\W]{8,16}$");
		//^(?![A-Za-z0-9]+$)(?![a-z0-9\\W]+$)(?![A-Za-z\\W]+$)(?![A-Z0-9\\W]+$)[a-zA-Z0-9\\W]{8,}$
		String s = "19939912808";
		Matcher matcher =  pattern.matcher(s);
//		if(matcher.find()) {
		//matches()��������ȫƥ�䣬�������ַ�������ƥ���������ʽ
		//find()�����ǲ���ƥ�䣬���������ַ����У�Ѱ��ƥ���������ʽ�����ַ������У�ֻҪ�ҵ����������ַ�����������true��
		if(matcher.matches()) {
			System.out.print("ƥ��ɹ���");
		}else {
			System.out.print("ƥ��ʧ�ܣ�");
		}
		//��ʽ2
		String regex = "1[378][0-9]{9}";
		boolean b = s.matches(regex);
		
	}
}

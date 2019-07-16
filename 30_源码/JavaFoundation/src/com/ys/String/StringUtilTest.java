package com.ys.String;

import org.apache.commons.lang.StringUtils;





public class StringUtilTest {
	public static void main(String[] args) {
		String str = "";
		StringUtils.isNotEmpty(str);//等价于 str != null && str.length > 0
		StringUtils.isNotBlank(str); //等价于 str != null && str.length > 0 && str.trim().length > 0
		System.out.println(StringUtils.isNotEmpty(str.trim()));
		System.out.println(StringUtils.isNotBlank(str));
	}
}

package com.ys.typeCon;
/**
 * 常见数据类型的转换
 * @author zzy
 * @date 创建时间：2019年4月28日
 */
public class DataTypeCon {
	public static void main(String[] args) {
		//int->char
		int num1 = 8;
		char char1 = (char)(num1+48);
		System.out.println(char1);//8
		System.out.println(getType(char1));
		//char->int
		Character char2 = '8';
		int num2 = Integer.parseInt(char2.toString());
		System.out.println(num2+" 数据类型为："+getType(num2));//8
		char char3 = '8';
		int num3 = char3 - 48;
		System.out.println(num3+" 数据类型为："+getType(num3));//8
		
		//int/Long/short/Float/double->String
		//推荐使用String.valueOf() toString()要先使用instanceof判断是否能转换
		int num4 = 23;
		short num5 = 15;
		double num6 = 3.25;
		long num7 = 112565;
		String str1 = Integer.toString(num4);
		String str2 = Short.toString(num5);
		String str3 = Double.toString(num6);
		String str4 = Long.toString(num7);
		System.out.println(str1+"-"+getType(str1));
		System.out.println(str2+"-"+getType(str2));
		System.out.println(str3+"-"+getType(str3));
		System.out.println(str4+"-"+getType(str4));
		System.out.println(String.valueOf(num4)+"----------");//推荐使用
		//String->int/long/float/double
		String str5 = "25";
		int num8 = Integer.parseInt(str5);
		long num9 = Long.parseLong(str5);
		float num10 = Float.parseFloat(str5);
		double num11 = Double.parseDouble(str5);
		System.out.println(num8+getType(num8));
		System.out.println(num9+getType(num9));
		System.out.println(num10+getType(num10));
		System.out.println(num11+getType(num11));
		String str6 = "135";
		int num12 = Integer.valueOf(str6);
		System.out.println(num12);
		
		
	}
	/**
	 * 判类型
	 * @param obj
	 * @return
	 */
	public static String getType(Object obj){
		return obj.getClass().toString();
	}
	
}

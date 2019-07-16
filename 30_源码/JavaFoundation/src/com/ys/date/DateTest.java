package com.ys.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {
	public static void main(String[] args) {
		Date da = new Date();
		System.out.println(da);
		DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd 23:59:59"); 
		String dateString = format1.format(da);
		System.out.println(dateString);
		try {
			Date ss = format1.parse(dateString);
			System.out.println(ss);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//date=new   date(); //取时间 
		Calendar  calendar = new GregorianCalendar(); 
		calendar.setTime(da); 
		calendar.add(calendar.DATE,1); //把日期往后增加一天,整数  往后推,负数往前移动 
		Date date=calendar.getTime(); //这个时间就是日期往后推一天的结果 
		System.out.println(date);
	}
}

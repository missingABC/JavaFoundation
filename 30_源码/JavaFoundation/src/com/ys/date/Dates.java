package com.ys.date;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
 
/**
 * date datetime dateStamp
 * @author zzy
 * @date 创建时间：2019年4月28日
 */
public class Dates {
	public static void main(String[] args) {
		//获取当前日期并格式输出
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		//HH24h制 hh12h制度
		System.out.println(df.format(new Date()));//2019-04-28 08:12:29
		
		//Date->timestamp 毫秒
		Date date = new Date();
		Timestamp timestamp = new Timestamp(date.getTime());
		System.out.println(timestamp);
		
		//String->Date
		String str = "2019-04-27";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date da = null;
		try {
			da = sdf.parse(str);//Sat Apr 27 00:00:00 CST 2019
		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(da);
		
		//date转String
		Date dat = new Date();
		SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");
		String s = form.format(dat);
		System.out.println(s);
		
		//String转化为java.sql.Date
		String stri = "2019-05-15";
		SimpleDateFormat simdf = new SimpleDateFormat("yyyy-MM-dd");
		java.sql.Date sdate = null;
		java.util.Date udate;
		try {
			udate = simdf.parse(stri);
			sdate = new java.sql.Date(udate.getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(sdate);
		
		//lizi
		System.out.println("--------f----g----f------------");
		SimpleDateFormat myFmt=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒"); 
		SimpleDateFormat myFmt1=new SimpleDateFormat("yy/MM/dd HH:mm");
		SimpleDateFormat myFmt2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat myFmt3=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒SS毫秒，今天是yyyy的第D天 E ");  
		SimpleDateFormat myFmt4=new SimpleDateFormat(  
                "一年中的第 D 天 一年中第w个星期 一月中第W个星期 在一天中k时 z时区");  
		Date now = new Date();
//		System.out.println(myFmt.format(now));//2019年04月28日 08时48分08秒
//		System.out.println(myFmt1.format(now));//19/04/28 08:48
//		System.out.println(myFmt2.format(now));//2019-04-28 08:48:08
//		System.out.println(myFmt3.format(now));//2019年04月28日 08时52分10秒33毫秒 今天是2019的第118天  星期日 
//		System.out.println(myFmt4.format(now));
//		System.out.println(now.toGMTString());
//		System.out.println(now.toLocaleString());
//		System.out.println(now.toString());
		int year = 2019;
		int bh = 1005;
		String ahqz = "'"+"（"+year+"）"+"%"+bh+"号"+"'";
		System.out.println(ahqz);
		StringBuilder ah = new StringBuilder();
		ah.append("'").append("（").append(year).append("）").append("%").append(bh).append("号").append("'");
		System.out.println(ah);
		String ab = "%"+'（'+year+')'+'%'+bh+"%";
		System.out.println(ab);
		BigDecimal a = new BigDecimal(10005);
		String strr = a.toString();
		String strrr = String.valueOf(a);//推荐使用
		
		Integer abd = 56;
		Integer bcd = 56;
		System.out.println(bcd == abd);
		Integer asd = new Integer(100);
		Integer k = 100;
		System.out.println(k==asd);
		final int asad = 10;
		
		
	}
}

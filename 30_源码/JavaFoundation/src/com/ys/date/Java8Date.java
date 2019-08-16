package com.ys.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

/**
 * @author zzy
 * @date 2019/6/14
 */
public class Java8Date {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();//只有日期，沒有時間
        System.out.println("今天的日期是："+today);
        int year = today.getYear();
        LocalTime time = LocalTime.now();
        System.out.println("当前时间为："+time);
        LocalTime NowTime = LocalTime.of(15,34,53);
        System.out.println(NowTime);
        LocalDate localDate1 = LocalDate.parse("2018-11-05");
        sout(localDate1);
        LocalDate secondDayOfMonth = today.withDayOfMonth(2);//获取本月第二天
        sout(secondDayOfMonth);
        LocalTime localTime1 = time.withNano(0);
        sout(localTime1);//不包含毫秒
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy-MM-dd");
        sout(formatter.format(localDate1));
        sout(formatter.format(today));
        sout("LocalDateTime:"+ldt);
        sout("LocalDateTime格式化"+formatter.format(ldt));
        LocalDate lastDayOfMonth = localDate1.with(TemporalAdjusters.lastDayOfMonth());
        sout("本月最后一天："+lastDayOfMonth);

        LocalDate natian = LocalDate.of(2018,03,05);
        Period period = Period.between(natian,today);
        sout("已经过去"+period.getDays()+"天了");
        long days = ChronoUnit.DAYS.between(natian,today);
        sout(days);

        //Date->LocalDateTime
        Date date = new Date();
        LocalDateTime localDateTime1 = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        sout(date+" --Date->LocalDateTime-- "+localDateTime1);
        //Date->LocalDate
        LocalDate localDate2 = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        sout(date+"--Date->LocalDate--"+localDate2);
        //Date->LocalTime
        LocalTime localTime2 = date.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
        sout(date+"--Date->localTime--"+localDate2);
    }
    private static void sout(Object object){
        System.out.println(object);
    }
}

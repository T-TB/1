package test;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Day14 {
    public static void main(String[] args) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LocalDateTime now = LocalDateTime.now();//年月日时分秒毫秒
        LocalDate now1 = LocalDate.now();//年月日时分秒毫秒
        System.out.println("-----今天----");
        System.out.println(f.format(now));
        System.out.println(now1);
        String s=String.valueOf(System.currentTimeMillis());
        System.out.println("当前时间的时间戳"+s);

//        int year = now.getYear();//获得年
//        System.out.println(year);
//        Month month = now.getMonth();//获得英文月
//        System.out.println(month);
//        int mon = now.getMonthValue();//获得数字月
//        System.out.println(mon);
//        int dayofY = now.getDayOfYear();//今天是这一年的第几天
//        System.out.println(dayofY);
//        int dayofM = now.getDayOfMonth();//今天是这个月的第几天
//        System.out.println(dayofM);
//        DayOfWeek dayOfWeek = now.getDayOfWeek();
        System.out.println("------昨天------");
        System.out.println(f.format(now.minusDays(1)));
        System.out.println(now1.minusDays(1));
        System.out.println("------明天------");
        System.out.println(f.format(now.plusDays(1)));
        System.out.println(now1.plusDays(1));
        System.out.println("------后天------");
        System.out.println(f.format(now.plusDays(2)));
        System.out.println(now1.plusDays(2));

    }
}

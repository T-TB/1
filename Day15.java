package test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Time;
import java.util.Arrays;
import java.util.Random;

public class Day15 {
    public static void main(String[] args) {
//        R();
//        System.out.println("--------------------------------");
//        time();
//        System.out.println("-------------------------------");
//        SYS();
//        System.out.println("--------------------------------");
        BINT();
        BDcimal();
    }
    public static void R(){
        Random r = new Random();
        for (int i=0;i<10;i++){
            System.out.println(r.nextInt());
        }
        System.out.println("============================");
        for (int i=0;i<10;i++){
            System.out.println(r.nextInt(20));

        }
    }
    public static void time(){
        Long t=System.currentTimeMillis();

        System.out.println(t);
        for (int i=0;i<2500;i++){
            System.out.println(i);
        }
        long t1 = System.currentTimeMillis();
        long l =t1-t;
        System.out.println("for循环运行时间"+l+"毫秒");
    }
    public static void SYS(){
        int [] a={1,2,3,4,5};
        int a1[]={6,7,8,9,10};
        System.arraycopy(a,1,a1,1,2);
        System.out.println(Arrays.toString(a) );
        System.out.println(Arrays.toString(a1));
    }
    public static void BINT(){
        BigInteger bi1=new BigInteger("1000");
        BigInteger bi2=new BigInteger("100");
        System.out.println(bi1.add(bi2));//和
        System.out.println(bi1.divide(bi2));//商
        System.out.println(bi1.subtract(bi2));//差
        BigInteger [] bi= bi1.divideAndRemainder(bi2);//商和余
        System.out.println(bi[0]);//商
        System.out.println(bi[1]);//余数

    }
    //精度不准
    public static void BDcimal(){
        BigDecimal bd1 = new BigDecimal("12.1");
        BigDecimal bd2 = new BigDecimal("2.12");
        System.out.println(bd1.add(bd2));//和
        System.out.println(bd1.subtract(bd2));//差
        System.out.println(bd1.divide(bd2,2));//商,精确到小数点后几位
        BigDecimal bd3 = new BigDecimal("1.501");
        BigDecimal bd4 = new BigDecimal("100");

        System.out.println(bd3.divide(bd4,2,BigDecimal.ROUND_HALF_DOWN));

    }
}

package test;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Demo2Integer {
    public static void main(String[] args) {
//        System.out.println("Integer.max(12,13):       "+Integer.max(12,13));
//        System.out.println("Integer.bitcount(int x)       是指将参数x转化为二进制数，其中1的个数");
//        System.out.println("Integer.bitCount(12):          "+Integer.bitCount(12));
//        System.out.println("Integer.bitCount(8):          "+Integer.bitCount(8));
//        System.out.println("Integer.bitCount(2):          "+Integer.bitCount(2));
//        System.out.println("Integer.bitCount(1):          "+Integer.bitCount(1));
//        System.out.println("Integer.bitCount(15):          "+Integer.bitCount(15));
//        System.out.println("Integer.compare(int i,int j )   比较两个数i与j的大小，若i>j则返回1，若相等返回0；若小于则返回-1");
//        System.out.println("Integer.compare(-15,-18):           "+Integer.compare(-15,-18));
//        System.out.println("Integer.compare(15,18):           "+Integer.compare(15,18));
//        System.out.println("Integer.compareUnsigned(—12,-15):    指的是将带符号的负数用2的32次幂减去负数绝对值");
//        System.out.println("Integer.compareUnsigned(12,15):          "+Integer.compareUnsigned(12,15));
//        System.out.println("Integer.compareUnsigned(-12,-15):          "+Integer.compareUnsigned(-12,-15));
//        System.out.println("Integer.decode(String s):        是指将参数s转为Integer  decode 适用于8进制  16进制   10进制");
//        /*
//        八进制：baiint a=031; //8进制du，以数字0开始。
//        十六进制：int b=0x1B;//16进制，以0x开始。
//         */
//        System.out.println("八进制Integer.decode(\"010\"):           "+Integer.decode("010"));
//        System.out.println("十进制Integer.decode(\"123\"):            "+Integer.decode("123"));
//        System.out.println("二进制Integer.decode(\"1010\"):            "+Integer.decode("1010"));
//        System.out.println("二进制Integer.decode(100):            "+Integer.decode("100"));
//
//        System.out.println("10进制Integer.decode(\"1010B\"):            "+Integer.decode("0XA"));
//        System.out.println("Integer.valueOf():           ");
//        System.out.println("Integer.valueOf(12):           "+Integer.valueOf(12));
//        System.out.println("Integer.valueOf(\"123\"):           "+Integer.valueOf("123"));
//        System.out.println("将2进制1010转化为 Integer  Integer.valueOf(\"1010\",2):           "+Integer.valueOf("1010",2));
//        System.out.println("将16进制12转化为 Integer  Integer.valueOf(\"12\",16):           "+Integer.valueOf("12",16));
//        System.out.println("将8进制010转化为 Integer Integer.valueOf(\"010\",16):           "+Integer.valueOf("010",8));
//        System.out.println("Integer.valueOf(100):           "+Integer.valueOf(100));
//
//        System.out.println("Integer.ParseInt()");
//        System.out.println("Integer.parseInt(\"010\",8):        "+Integer.parseInt("010",8));
//        System.out.println("Integer.reverse:       按照二进制的32位进行反转10 ( 0000 0000 0000 0000 0000 0000 0000) 1010反转后1010 (0000 0000 0000 0000 0000 0000)");
//        System.out.println("Integer.reverse(12):          "+Integer.reverse(12));
//        System.out.println("Integer.reverse(805306368):          "+Integer.reverse(805306368));
//        System.out.println("Integer.reverse(0):          "+Integer.reverse(0));
//        System.out.println("Integer.lowestOneBit(15 ):         "+Integer.lowestOneBit(15));//15 二进制1111取最右边的一的二进制值 2的0次幂
//        System.out.println("Integer.lowestOneBit(20):         "+Integer.lowestOneBit(20));//20 二进制1 0100取最右边的一的二进制值 2的2次幂
//        System.out.println("Integer.highestOneBit:         "+Integer.highestOneBit(20));//20 二进制1 0100取最右边的一的二进制值 2的4次幂


//     Integer in =new Integer(16);
//     in.intValue();
     int num=0;
     int max=0;
     int min=0;

     Scanner sc = new Scanner(System.in);
     String s = sc.nextLine();
     for (int i=0;i<s.length();i++){
         char c= s.charAt(i);
//判断数字
        if(Character.isDigit(c)) {
       num++;
        }
        else if (Character.isLowerCase(c)){
            min++;
        }
        else if(Character.isUpperCase(c)){
            max++;
         }

     }
        System.out.println("字符串中含有"+num+"个数字，含有"+min+"个小写字符，含有"+max+"个大写字符");
    }
}

package test;

public class DemoInteger {
    static   String str;
    public   static void  one(){
        String s="123456789";
        System.out.println("局部变量String"+s);
    }
    public static void main(String[] args) {

        System.out.println(str);
        one();
        Integer a = null;
        Integer b = null;
        Integer f = null;
        String s ="123";
        int e =123;
        int i =12;
        String  s1 ="1010";
        a = new Integer(-1005);
        b= new Integer(1112);
        f = new Integer(15);
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("byteValue:     "+a.byteValue());//返回在二进制补码表示的指定 int值的比特数。
        System.out.println("compare a and b：   "+a.compareTo(b));//比较两个值
        System.out.println("compare a and b：   "+Integer.compare(a,b));
        Integer c =Integer.bitCount(1234);//将参数转为二进制数，其中1的个数
        System.out.println(+c);
        System.out.println("compareUnsigned( a, b):         "+Integer.compareUnsigned(a,b));//比较的是无符号数数值
        System.out.println("decode(String nm):    "+Integer.decode("123"));//decod可以解码8进制，10进制，16进制等；valueofzh只能转换字符串数字
        System.out.println("divideUnsigned(int dividend, int divisor) :    "+Integer.divideUnsigned(100,5));//返回第一个参数初一第二个参数的商
        System.out.println("doubleValue() :       "+a.doubleValue());
        System.out.println("equals(Object obj) :    "+a.equals(b));
        System.out.println("floatValue()  :    "+a.floatValue() );
       // System.Setproperty("abc",1);
        System.out.println("getInteger(String nm) :    "+Integer.getInteger("123") );//Integer.getInteger(String)方法假设String参数是一个系统属性数值的名称，会读取该系统属性，然后把系统属性的值转换成一个数字。也就是说，  Integer.getInteger("12345") 应该是得到 null（假设没有名为12345的系统属性）
        System.out.println("hashCode() :    "+Integer.hashCode(a) );
        System.out.println("hashCode() :    "+a.hashCode() );
        System.out.println("doubleValue()  :    "+a.doubleValue() );
        System.out.println("parseInt()  :    "+Integer.parseInt("123"));
        System.out.println("intValue()  :    "+a.intValue());
        System.out.println("highestOneBit(int i) "+Integer.highestOneBit(f));//15 二进制1111 取最左边的一的二进制值
        System.out.println("longValue() :     "+a.longValue());
        System.out.println("lowestOneBit(int i):    "+Integer.lowestOneBit(f));//15 二进制1111 取最右边的一的二进制值
        System.out.println("max(int a, int b) :     "+Integer.max(a,f));
        System.out.println("min(int a, int b) :     "+Integer.min(a,f));
                System.out.println("numberOfLeadingZeros(int i) :     "+Integer.numberOfLeadingZeros(i) );//32位中参数非零数前的0的个数
        System.out.println("numberOfLeadingZeros(int i) :     "+Integer.numberOfTrailingZeros(i) );//32位中参数非零数后的0的个数
        System.out.println("parseInt(String s):      "+Integer.parseInt(s));//parseInt中的参数只能是String
        System.out.println("parseInt(String s, int radix) :     "+Integer.parseInt(s,10));
        System.out.println("parseInt(String s, int radix) :     "+Integer.parseInt(s1,2));//String参数是几进制的数后面的参数就是几
        String s2 ="-123";
        System.out.println("parseUnsignedInt(String s) :     "+Integer.parseUnsignedInt(s) );
        System.out.println("parseUnsignedInt(String s) :     "+Integer.parseUnsignedInt(s,16) );
        System.out.println("reverse(int i) :     "+Integer.reverse(10) );
        //按照二进制的32位进行反转10 ( 0000 0000 0000 0000 0000 0000 0000) 1010反转后1010 (0000 0000 0000 0000 0000 0000)
        System.out.println("remainderUnsigned(int dividend, int divisor) :      "+Integer.remainderUnsigned(10,2));//将x、y两个整数转换为无符号整数后计算它们相除的余数。
        System.out.println("reverseBytes(int i) :      "+Integer.reverseBytes(10) );
       // ?
        System.out.println("rotateLeft(int i, int distance) :    "+Integer.rotateLeft(10,2) );//?
        System.out.println("rotateRight(int i, int distance)  :    "+Integer.rotateRight(10,2)  );//?
        System.out.println("shortValues:         "+a.shortValue());
        System.out.println("signum(int i ):      "+Integer.signum(0));//正数返回1，负数返回-1，0返回0
        System.out.println("sum():    "+Integer.sum(10,11));
        System.out.println("toBinaryString(int 12) :   "+Integer.toBinaryString(12) );//返回二进制
        System.out.println("toHexString(int 12) :         "+Integer.toHexString(12));//返回i6进制
        System.out.println("toOctalString(int 12) :         "+Integer.toOctalString(12));//返回8进制
        System.out.println("toString() :           "+Integer.toString(12));
        System.out.println("toString(inti,int radix):       "+Integer.toString(10,2));
        System.out.println("toUnsignedLong(int x) :         "+Integer.toUnsignedLong(-12));
        System.out.println("totoUnsignedString(int i):        "+Integer.toUnsignedString(-12) );//无符号数为2的32次幂-12
        System.out.println("toUnsignedString(12,2) :             "+Integer.toUnsignedString(12,2) );//将第一个int参数转换为第二次参数指定的进制
        System.out.println("valueOf(int i):      "+Integer.valueOf(12) );
        System.out.println("valueOf(String s):      "+Integer.valueOf("123") );
        System.out.println("valueOf(String s,int radix):      "+Integer.valueOf("12",16) );//将16进制的String类型12转换成10进制






    }
}

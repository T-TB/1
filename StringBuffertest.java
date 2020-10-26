package test;

public class StringBuffertest {
    /*
    添加功能： public StringBuffer append(String str):追加在原有的基础上，添加新数据
    将指定的参数类型数据（任意类型）。添加到当前字符串中的缓冲区中，返回当前字符串缓冲对象
     public StringBuffer insert(String str) 插入，在原有的数据基础上，插入数据
     */
    /*
    删除功能：
    public StringBuffer deleteCharAt(int index)
    把指定位置上的数据，在当前字符串缓冲区对象上中删除，返回当前字符串缓冲对象
    public StringBuffer deleteCharAt(int start，int end)
     */
    public static void main(String[] args) {
        StringBuffer  Buffer = new StringBuffer();
        StringBuffer  Buffer2 = Buffer.append("Hello");
        Buffer.append("Java").append(123).append('a');
        System.out.println(Buffer.toString());
        System.out.println(Buffer2);
        Buffer.insert(0,"张天宝");
        Buffer.insert(1,"张天宝");
        Buffer.insert(Buffer.length(),"张天宝");
        System.out.println(Buffer);
        System.out.println(Buffer.deleteCharAt(0));
        System.out. println(Buffer.delete(0,10));
        System.out.println("Buffer2"+Buffer2);
        System.out.println(Buffer2.replace(0,1,"h"));
        System.out.println(Buffer2.reverse());
        System.out.println("Buffer2"+Buffer2);
        System.out.println(Buffer.substring(2));
        /*
        StringBuffer------->String
        1. String s = new Strini(StringBuffer b);
        2.String.ValueOf();
        3.toString
         */
        StringBuffer ab= new StringBuffer("HelloJava");
        System.out.println(String.valueOf(ab));
        System.out.println(ab.toString());
        System.out.println(new String(ab));
    }
}

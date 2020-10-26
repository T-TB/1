package test;

public class demoString {
    public static final String a;
    public static final String b;

    static {
        a = "123";
        b = "456";
    }

    public static void main(String[] args) {
//     String a = "123345677890";
//     String b = new String();
//     String c ="";
//     String d = new String("");
//        System.out.println("String.valueOf(12345):         "+String.valueOf(12345));
//        System.out.println("String.valueOf(new char[]{'a','b','c','d','f'},1,4):         "+String.valueOf(new char[]{'a','b','c','d','f'},1,4));
//        System.out.println("a.concat(\"00000\"):          "+a.concat("00000"));
//        System.out.println("a.replace(\"123\",\"0\"):            "+a.replace("123","0"));
//        System.out.println("a.intern():         "+a.intern());
//        //判断功能
//        System.out.println(a.contains("12"));
//        System.out.println(a.equals("12334567890"));
//        System.out.println(a.startsWith("1"));
//        System.out.println(a.endsWith("0"));
//        System.out.println(b.isEmpty());
//        System.out.println(c.isEmpty());
//        System.out.println(b.equals(c));
//        System.out.println(c.equals(d));
//        System.out.println(b.equals(d));
//        System.out.println(b==c);

        System.out.println(a +""+b);
        String c = "1234516";
        String d = a + b;
        System.out.println(c == d);
        Double a1=20.0;
        Double  a2 = 20.0;
        System.out.println(a1==a2); 

        System.out.println(c.replaceAll("1","a"));
    }
}
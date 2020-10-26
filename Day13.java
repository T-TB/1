package test;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;



import  java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day13 {
    public static void main(String[] args) {
        MathDemo();
        System.out.println("\\\\");
//        while (true) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("请输入手机号");
//            String s = sc.nextLine();
//            String law = "1[34578][0-9]{9}";
//            boolean b = s.matches(law);
//            System.out.println(b);
//        }
        String s ="aa.bb.cc";
        String s1 ="aa,bb,cc";
        String s2 ="aa bb cc";
        String s3="\\.";
        String s4=",";
        String s5=" ";
        String [] ss=s.split(s3);
        String [] ss1=s1.split(s4);
        String [] ss2=s2.split(s5);
        for (int i=0;i< ss.length;i++){
            System.out.println(ss[i]);
        }
        System.out.println("------------------------------");
        for (int i=0;i< ss1.length;i++){
            System.out.println(ss1[i]);
        }
        System.out.println("-------------------------------");
        for (int i=0;i< ss2.length;i++){
            System.out.println(ss2[i]);
        }
        System.out.println("---------------------------");
        String [] s6 = {"12","23","45","11","68","1"};
        //将字符串数组转换为int数组
        //创建一个int数组
        int []a = new int[s6.length];
        //将字符串中的每一个元素存放到int数组中
        for (int i =0;i<s6.length;i++){
          a[i]=  Integer.parseInt(s6[i]);
        }
        //对int数组排序
        Arrays.sort(a);
        //自定义方法，将int数组转换成String
        String result = intoString(a);
        //输出
        System.out.println(result);
        System.out.println("---------------------");
        System.out.println("请输入");
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        //设置正则表达式
        String res = "[0-9]+";
        //替换
        String str1 = str.replaceAll(res,"*");
        System.out.println(str1);
        System.out.println("--------------------");
        String  s13_1 ="da jia ting wo shuo, jin tian yao xia yu,wan shang bu yong xie zuo ye le ";
        //正则表达式
        String res_13="\\b[a-z]{3}\\b";
        //把正则表达式字符串，编译成对象
        Pattern p =Pattern.compile(res_13);
        //使用正则表达式对象 与数据进行匹配 将结果封装到匹配器对象中
        Matcher m =p.matcher(s13_1);
        //判断是否有满足条件的数据
        while(m.find()){
            //获取满足条件的数据
            System.out.println(m.group());
        }

    }
//自定义方法
    private static String intoString(int[] a) {
        //定义StringBUffer对象
        StringBuffer sb = new StringBuffer();
        //将int数组中的每一个元素存放到StringBuffer中
        for (int i =0;i<a.length;i++){
            sb.append(a[i]).append(" ");
        }
        return sb.toString();
    }
    private static void MathDemo(){
        System.out.println("返回立方根"+Math.cbrt(8));
        System.out.println("返回比Double值大的最小整数"+Math.ceil(5.3));
        System.out.println("返回Double值大的最小整数"+Math.ceil(5.9));
        System.out.println("返回Double值小的最大整数"+Math.floor(5.9));
        System.out.println("返回Double值小的最大整数"+Math.floor(6.1));
    }
}

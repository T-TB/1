package test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//try{...} catch(){...}finally{...}     快捷键ctrl alt T
public class Day24 {

    public static void main(String[] args)  {
//      one();
//        Two();
      //  System.out.println("----------------------");
//       int a= three();
//        System.out.println(a);
//        try {
//            four();
//        } catch (test.becomehappy becomehappy) {
//            becomehappy.printStackTrace();
//        }
//        System.out.println("好开心啊");
        try {
            five();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void five() throws IOException {
        File file = new File("G:\\JAVA黑马\\eeee.txt");//只是对文件创建目录
      //以下两种是拼接方式
        File file1 = new File("G:\\JAVA黑马","eeee.txt");
        File file2 = new File("G:\\JAVA黑马");
        File file3 = new File(file2,"eeee.txt");
        File file4 = new File("G:\\JAVA黑马\\1.txt");
        boolean newFile = file4.createNewFile();
        System.out.println(newFile);
        File file5 = new File("G:\\JAVA黑马\\张天宝");
        boolean mkdir = file5.mkdir();
        System.out.println(mkdir);
        File file6 = new File("G:\\JAVA黑马\\张天宝\\aaa\\bbb");
        boolean mkdirs = file6.mkdirs();
        System.out.println(mkdir);
    }


    private static void four() throws becomehappy {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        String s=scanner.nextLine();
       if( s.equals("no happy")){
            throw new becomehappy("变开心");
        }
    }



    private static int three() {
        int arr[]={1,2,3};
        int x=10;
        try {
            x=20;
            System.out.println(arr[3]);
            //异常后面的代码执行不到
            x=30;//不执行
        } catch (Exception e) {
           // x=40;
            e.printStackTrace();
            x=40;

            return x;

        } finally {
            x=50;


        }
return x;
        //System.out.println("over");
        //System.out.println("X="+x);
    }

    private static void Two() throws Exception {
        int x=0;
        int y=0;
        System.out.println(x/y);
    }

    private static void one() {
        int x=1;
        int y=0;
        System.out.println("zzt");
        try {
            System.out.println(x/y);
        } catch (Exception e) {

            System.out.println("============");
            e.printStackTrace();//异常类名，原因，位置
            System.out.println("ztb");

        } finally {

        System.out.println("zzt");

        }
    }
}


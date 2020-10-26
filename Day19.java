package test;

import com.sun.xml.internal.ws.addressing.WsaTubeHelper;
import sun.reflect.generics.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;

public class Day19 {
    public static void main(String[] args) {
       //one();
       // two();
       // three();
       // four();
       // five();
        //six();
       // seven();
       // eight();
        //nine();
        //test();
        //ten();
        eleven();

    }

    private static void eleven() {
        HashMap<String, Student> hashMap = new HashMap<>();
        Student s1 = new Student("太宰治", 12);
        Student s2 = new Student("中原中也", 14);
        Student s3 = new Student("中岛敦", 10);
        Student s4 = new Student("中岛敦", 10);
        hashMap.put("001",s1);
        hashMap.put("002",s2);
        hashMap.put("003",s3);
        hashMap.put("004",s4);
        Set<String> keySet = hashMap.keySet();
        for (String s :
                keySet) {
            System.out.println(s+"    "+hashMap.get(s).getName()+"    "+hashMap.get(s).getAge());
        }

    }

    private static void ten() {
        HashMap<String, String> map = new HashMap<>();
        map.put("太宰治","中原中也");
        map.put("蓝忘机","魏无羡");
        map.put("严峫","江亭");
        System.out.println("------遍历1---------");
        Set<String> keySet = map.keySet();
        for (String s :
                keySet) {
            System.out.println(s+"---"+map.get(s));
        }
        System.out.println("--------遍历2------");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> en:entries
        ){
            System.out.println(en.getKey()+"---"+en.getValue());
        }
    }

    private static void test() {
        HashMap<String, String> map = new HashMap<>();
       List<Object> list = new LinkedList<>();
        list.add(null);
        System.out.println(list);
        map.put("太宰治","中原中也");
        map.put("","");
        map.put("蓝忘机","魏无羡");
        map.put("严峫","江亭");
        map.put(null,null);
        System.out.println("------遍历1-----");
        Set<String> keySet = map.keySet();
        for (String s:keySet
             ) {
            System.out.println(s+"-------"+map.get(s));

        }
        System.out.println("--------遍历2-------");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String,String> en:entries
             ) {
            System.out.println(en.getKey()+"------"+en.getValue());

        }

    }

    private static void nine() {
        Map<String, Integer> map = new HashMap<>();
        map.put("zzt",18);
        map.put("z",18);
        map.put("t",20);
        map.put("z1",null);
        map.put("zzt",20);
        map.put(null,20);
        System.out.println(map.remove("z1"));
        System.out.println(map);
        System.out.println(map.containsKey("zzt"));
        System.out.println(map.containsValue(20));
        //获取功能 Set<k> keySet();
        Set<String> keySet = map.keySet();
        System.out.println(keySet);
        //获取一个包含所有值的Collextion
        Collection<Integer> values = map.values();
        System.out.println(values);
        Integer integer = map.get(null);
        System.out.println(integer);
        //遍历1
        for (String a :
                keySet) {
            Integer integer1 = map.get(a);
            System.out.println(a+"----"+integer1);

        }
        System.out.println("=================================");
        //遍历2
        //获取键值对元素的Set集合
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        //遍历当前的Set集合的每一个键值对元素对象
        for (Map.Entry<String, Integer> en:
        entries){
            String key = en.getKey();
            Integer value = en.getValue();
            System.out.println(key+"-----"+value);
        }
        //通过键值对元素对象，获取键，获取值
        
    }

    private static void eight() {
        TreeSet<Stu> stus = new TreeSet<Stu>(new Comparator<Stu>() {
            @Override
            public int compare(Stu o1, Stu o2) {
                int num =o2.zongfrn()-o1.zongfrn();
                int num1=(num==0)?o2.getYuwen()-o1.getYuwen():num;
                int num2=(num==0)?o2.getShuxue()-o1.getShuxue():num1;
                int num3=(num==0)?o2.getName().compareTo(o1.getName()):num2;
                return num3;

            }
        });

        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("请输入学生姓名");
           String name= scanner.nextLine();
            System.out.println("请输入语文成绩");
            int YW=scanner.nextInt();
            System.out.println("请输入数学成绩");
            int SX=scanner.nextInt();
            System.out.println("请输入英语成绩");
            int YY=scanner.nextInt();
            stus.add(new Stu(name,YW,SX,YY));

        }
        System.out.println("=============================");
        System.out.println("姓名\t"+"语文成绩\t"+"数学成绩\t"+"英语成绩\t"+"总分成绩\t");
        for (Stu s :
                stus) {
            System.out.println(s.getName()+"\t"+s.getYuwen()+"\t"+s.getShuxue()+"\t"+s.getYingyu()+"\t"+s.zongfrn()+"\t");
        }

    }

    private static void seven() {
        HashSet<Integer> hashSet = new HashSet<>();
        Random r =new Random();

        while(hashSet.size()<=10) {
            hashSet.add(r.nextInt(20));
        }

        for (Integer i :
                hashSet) {
            System.out.println(i);
        }
    }

    private static void six() {
        TreeSet<Student> set = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                System.out.println("---------------");
                int num=o1.getAge()-o2.getAge();
                int num1 =(num==0)?o1.getName().compareTo(o2.getName()):num;
                return  num1;
            }
        });
        Student s1 = new Student("张子天", 12);
        Student s2 = new Student("张天宝", 15);
        Student s3 = new Student("张天宝", 15);
        Student s4 = new Student("张天宝", 16);
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        for (Student s:set
             ) {
            System.out.println(s);
        }

    }

    private static void five() {
        TreeSet<Integer> integers = new TreeSet<>();
        integers.add(12);
        integers.add(13);
        integers.add(1);
        integers.add(64);
        integers.add(1);
        for (Integer i :
                integers) {
            System.out.println(i);
        }
    }

    //比较器 接口 Comparator
    private static void four() {
        TreeSet<Student> set = new TreeSet<Student>(new Comparator<Student>() {
            //用来比较两个对象比较大小
            @Override
            public int compare(Student o1, Student o2) {
                //年龄
                int num=(o1.getAge()-o2.getAge());
                //姓名
                int num2 = (num==0)?o1.getName().compareTo(o2.getName()):num;
                return num2;
            }
        });
        Student s1 = new Student("太宰治", 12);
        Student s2 = new Student("中原中也", 14);
        Student s3 = new Student("中岛敦", 10);
        Student s4 = new Student("中岛敦", 10);
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        for (Student ss :
                set) {
            System.out.println(ss);
        }
    }

    private static void three() {
        TreeSet<Student> students = new TreeSet<>();
        Student s1 =new Student("太宰治",12);
        Student s2 =new Student("中原中也",13);
        Student s3 =new Student("中岛敦",14);
        Student s4 =new Student("中岛敦",14);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        for (Student s :
                students) {
            System.out.println(s);
        }

    }

    private static void two() {
        TreeSet<Integer> integers = new TreeSet<>();
        integers.add(12);
        integers.add(11);
        integers.add(13);
        integers.add(11);
        integers.add(1);
        integers.add(15);
        for (Integer i :
                integers) {
            System.out.println(i);
        }

    }

    private static void one() {
        HashSet<Student> students1 = new HashSet<>();

        Student s1 = new Student("太宰治", 18);
        Student s2 = new Student("中原中也", 18);
        Student s3 = new Student("中岛敦", 18);
        Student s4 = new Student("中岛敦", 18);
        students1.add(s1);
        students1.add(s2);
        students1.add(s3);
        students1.add(s1);
        students1.add(s4);
        for (Student s : students1){
            System.out.println(s);
        }
    }
}

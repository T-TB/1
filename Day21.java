package test;

import java.util.*;

//跳到下一行 shift enter
public class Day21 {
    public static void main(String[] args) {
        D21one();
       // D21two();
        //D21Three();
        //D21Four();

    }

    private static void D21Four() {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(12);
        integers.add(212);
        integers.add(22);
        integers.add(121);
        System.out.println(integers);
        System.out.println("排序后");
        Collections.sort(integers);
        System.out.println(integers);
        System.out.println("二分查找12索引："+Collections.binarySearch(integers,12));
        System.out.println("最大值："+Collections.max(integers));
        Collections.reverse(integers);
        System.out.println("反转后：");
        System.out.println(integers);
        System.out.println("随机打乱");
        Collections.shuffle(integers);
        System.out.println(integers);
    }

    private static void D21Three() {
        HashMap<String, String> jc = new HashMap<>();

        jc.put("01","tzz");
        jc.put("02","zyzy");
        jc.put("03","zzt");
        System.out.println(jc);
         HashMap<String, String> jy = new HashMap<>();
        jy.put("01","tzz");
        jy.put("02","zyzy");
        jy.put("03","zzt");
        HashMap<String, HashMap<String, String>> hashMap = new HashMap<>();
        hashMap.put("基础班",jc);
        hashMap.put("就业班",jy);
        Set<Map.Entry<String, HashMap<String, String>>> entries = hashMap.entrySet();
        for (Map.Entry<String, HashMap<String, String>> en :
                entries) {
            System.out.println(en.getKey()+"---"+en.getValue());
        }
        System.out.println("----------------------------------");
        Set<String> keySet = hashMap.keySet();
        for (String c :
                keySet) {
            HashMap<String, String> hashMap1 = hashMap.get(c);
            Set<String> keySet1 = hashMap1.keySet();
            for (String s1 :
                    keySet1) {
                String s = hashMap1.get(s1);
                System.out.println(s1+"----"+s);
            }
        }


    }

    private static void D21two() {
        //"aababcabcdabcde"   ------------  a(5)b(4)c(3)d(2)e(1)
        //1.字母与数字之间有关系   用map
        //2.有序  用Treemap<caharacter,Integer>
        TreeMap<Character, Integer> map = new TreeMap<>();

        //3.建立字符串
        String  s="aababcabcdabcde";
        //4.遍历字符串的到每一个字母
        for (int i = 0; i < s.length(); i++) {
            //5.将字符存储到map，重复后数字加一\
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
             int num=map.get(ch);
             num++;
                map.put(s.charAt(i),num);

            }
            else {
                map.put(s.charAt(i), 1);
            }

        }
//        Set<Character> keySet = map.keySet();
//        for (Character c :
//                keySet) {
//            System.out.print(c+"("+map.get(c)+")");
//        }
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> en:entries
             ) {
            System.out.print(en.getKey()+"("+en.getValue()+")");
        }
    }

    private static void D21one() {
        TreeMap<Student, String> map = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o1.getName().compareTo(o2.getName());
                int num1 = (num==0)?o1.getAge()-o2.getAge():num;
                return  num1;
            }
        });
        Student s1 = new Student("太宰治", 18);
        Student s2 = new Student("金木研", 19);
        Student s3 = new Student("中原中也", 15);
        map.put(s1,"001");
        map.put(s2,"002");
        map.put(s3,"003");
        map.put(null,"004");
        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for (Map.Entry<Student, String> en :
                entries) {
            System.out.println(en.getKey()+"      "+en.getValue());
        }
        System.out.println("===============================");
        Set<Student> keySet = map.keySet();
        for (Student key :
                keySet) {
            //System.out.println(key+"     "+map.get(key));
            String ss =map.get(key);
            System.out.println(ss+"     "+key.getName()+"---"+key.getAge());

        }
    }
}

package test;

import java.util.*;

public class Day22 {
    public static void main(String[] args) {
        one();
    }

    private static void one() {
        HashSet<Integer> set = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int a=random.nextInt(100);
            System.out.println(a);

            set.add(a);
        }
        System.out.println("-----------");
//        set.add(5);
//        set.add(15);
//        set.add(8);
//        set.add(9);
//        set.add(19);
//        set.add(21);
//        set.add(4);
//        set.add(3);
//        set.add(7);
//        set.add(1);
//        set.add(11);
//        set.add(21);
//        set.add(2);
//        set.add(0);
//        set.add(10);
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        set.add(4);
//        set.add(5);
//        set.add(6);
//        set.add(7);
//        set.add(8);
//        set.add(9);set.add(31);
//        set.add(32);
//        set.add(33);
//        set.add(34);
//        set.add(35);
//        set.add(36);
//        set.add(37);
//        set.add(38);
//        set.add(0);
//        set.add(4194304);
//        set.add(4194305);
//        set.add(4194303);
//        set.add(4194302);
//        set.add(39);
//        set.add(1000);
//
//        set.add(16);
//        set.add(17);
//        set.add(18);
//        set.add(19);
//        set.add(21);
//        set.add(22);
//        set.add(23);
//        set.add(24);
//        set.add(25);
//        set.add(26);
//        set.add(27);
//        set.add(28);
//        set.add(29);
//        set.add(10);
//        set.add(11);
//        set.add(12);
//        set.add(13);
//        set.add(14);
//        set.add(15);


      //  set.add(null);
        HashSet<String> set1 = new HashSet<>();
        set1.add("zzt");
        set1.add("lcl");
        set1.add("lth");
        set1.add("ztb");
        set1.add("gq");
        for (String str:set1
             ) {
            System.out.println(str);
        }
        System.out.println("===========================");
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("--------------------------------");
        HashMap<Integer, String> map = new HashMap<>();
        map.put(12,"001");
        map.put(13,"002");
        map.put(11,"003");
        map.put(10,"004");
        map.put(null,"005");
//        Set<Integer> keySet = map.keySet();
//        for (Integer i :
//                keySet) {
//            System.out.println(i+"-----"+map.get(i));
//        }
        new TreeSet<>();
        HashMap<String, String> map1 = new HashMap<>();

        map1.put("zzt","001");
        map1.put("lcl","002");
        map1.put("lth","003");
        map1.put("ztb","004");
        map1.put("gq","005");
        Set<String> set2 = map1.keySet();
        for (String s :
               set2 ) {
            System.out.println(s+"--"+map1.get(s));
        }
        HashMap<Student, Integer> map2 = new HashMap<>();
        Student s1 = new Student("太宰治", 18);
        Student s2 = new Student("金木研", 19);
        Student s3 = new Student("中原中也", 15);
        map2.put(s1,001);
        map2.put(s2,002);
        map2.put(s3,003);
        map2.put(null,004);



    }
}

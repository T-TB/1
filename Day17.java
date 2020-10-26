package test;
//创建对象快捷键 ctrl alt v
import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Day17 {
    public static void main(String[] args) {
      // one();
       // two();
       // three();
        //arrayList();
        //quchong();
        //quchong1();
       // quchong2();
//       String []a={"12","13","1313"};
//        List<String> list  = Arrays.asList(a);
//        int [] a1={12,13,14};
//        List<int[]> ints = Arrays.asList(a1);

       // four();
//        ArrayList<String> strings = new ArrayList<>();
//        strings.add(null);
//        strings.add("张子天");
//
//        String s = null;
//        System.out.println(s);
//        strings.add(s);
//
//        System.out.println(strings);
    }
//数组嵌套
    private static void four() {
        //创建传智播客总部
        ArrayList<Object> czbk = new ArrayList<Object>();
        //创建校区
        ArrayList<String> strings = new ArrayList<String>();
        //向校区中添加学科
        strings.add("JAVA");
        strings.add("UI");
        strings.add("Android");
        ArrayList<String> strings1 = new ArrayList<>();
        strings1.add("JAVA");
        strings1.add("UI");
        czbk.add(strings);
        czbk.add(strings1);
        System.out.println(czbk);
    }


    private static void quchong2() {
        ArrayList<Student> arrayList = new ArrayList<>();
        Student s1 =new Student("太宰治",18);
        Student s2 =new Student("中也",15);
        Student s3 =new Student("镜花",10);
        Student s4 =new Student("太宰治",18);
        Student s5 =new Student("中也",15);
        Student s6 =new Student("镜花",10);
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);
        arrayList.add(s5);
        arrayList.add(s6);
        ArrayList<Student> arrayList1 = new ArrayList<>();
        for (int i =0;i<arrayList.size();i++){
            Student s =(Student)arrayList.get(i);
            if (!arrayList1.contains(s)){
                arrayList1.add(s);
            }
        }
        System.out.println("---------------------");
        for (Student s: arrayList1){
            System.out.println(s);

        }

    }

    private static void quchong1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("魏无羡");
        arrayList.add("蓝忘机");
        arrayList.add("魏无羡");
        arrayList.add("蓝忘机");

        for (int i =0;i<arrayList.size()-1;i++){
            for (int j = 0; j<arrayList.size(); j++){
                if (arrayList.get(i).equals(arrayList.get(j))) {
                    arrayList.remove(j);
                    j--;
                }
            }
        }
        System.out.println(arrayList);
    }

    private static void quchong() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("魏无羡");
        arrayList.add("蓝忘机");
        arrayList.add("魏无羡");
        arrayList.add("蓝忘机");
        ArrayList arrayList1 = new ArrayList();
        for (int i=0;i<arrayList.size();i++){
            Object o = arrayList.get(i);
            if (arrayList1.contains(o)){

            }else{
                arrayList1.add(o);
            }

        }
        System.out.println(arrayList1);
    }

    private static void arrayList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("魏无羡");
        arrayList.add("蓝忘机");
        for (int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
        Student s1 =new Student("太宰治",18);
        Student s2 =new Student("中也",15);
        Student s3 =new Student("镜花",10);
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);

        for (ListIterator listIterator = arrayList.listIterator();listIterator.hasNext();){
            System.out.println(listIterator.next());
        }

    }

    //判断当前集合是否有太宰治，如果有就i添加中也
    private static void three() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("镜花");
        arrayList.add("太宰治");
        arrayList.add("太宰治");
        arrayList.add("中岛敦");
        for(int i=0;i<arrayList.size();i++){
            String s =(String)arrayList.get(i);
            if (s.equals("太宰治")){
                arrayList.add("中也");
            }
            System.out.println(arrayList.get(i));
        }
        System.out.println("-------------");
        //在使用迭代器的过程中集合的元素个数不能改变
//        Iterator iterator = arrayList.iterator();
//        while(iterator.hasNext()){
//            if (iterator.next()=="太宰治"){
//                arrayList.add("中也");
//            }
//            System.out.println(iterator.next());
//        }
        System.out.println("===============");
        ListIterator listIterator1 = arrayList.listIterator();
        while(listIterator1.hasNext()){
            String s = (String)listIterator1.next();
            if (s.equals("太宰治")){
                listIterator1.add("中也");
            }

        }
        System.out.println(arrayList);
    }

    public static void one() {
        List l1 = new ArrayList();
        l1.add("太宰治");
        l1.add("镜花");
        //指定位置添加元素
        l1.add(1, "中原中也");
        //返回集合中给定位置的元素
        Object o = l1.get(0);
        System.out.println(o);
        //查找元素第一次出现的位置
        int 中原中也 = l1.indexOf("中原中也");
        System.out.println(中原中也);
        //移除指定位置的元素 返回的是指定位置的元素
        //移除指定元素返回的是布尔值
        Object remove = l1.remove(1);
        System.out.println(remove);
        //用指定元素替换集合中指定位置的元素
        Object old = l1.set(1, "太宰治的中原中也");
        System.out.println(old);
        System.out.println(l1);
        //遍历
        ListIterator listIterator = l1.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println("=========");
        for (ListIterator listIterator1 = l1.listIterator(); listIterator1.hasNext(); ) {
            System.out.println(listIterator1.next());
        }
        System.out.println("===========for===========");
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
    }
        public static void two(){
            Student s1 =new Student("太宰治",18);
            Student s2 =new Student("中也",15);
            Student s3 =new Student("镜花",10);
            ArrayList l1 = new ArrayList();
            l1.add(s1);
            l1.add(s2);
            l1.add(s3);
            for (int i=0;i<l1.size();i++){
                Student s =(Student)l1.get(i);
                System.out.println(s);
            }

            for (Iterator iterator = l1.iterator();iterator.hasNext();){

                System.out.println(iterator.next());
            }
            System.out.println("----------------------");
            ListIterator listIterator = l1.listIterator();
            while(listIterator.hasNext()){
                System.out.println(listIterator.next());
            }
            System.out.println("反向输出-------------------");
            for (int i= l1.size()-1;i>=0;i--){
                System.out.println(l1.get(i));
            }
            System.out.println("反向输出-------------------");
            while(listIterator.hasPrevious()){
                System.out.println(listIterator.previous());
            }
            System.out.println("=================");

        }

}

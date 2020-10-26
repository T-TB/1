package test;

import javafx.scene.chart.BubbleChart;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class PaiXu {
    // static int  r= 10;
    public static void main(String[] args) {
        int[] a = {11, 3, 4, 23, 56, 2, 22};

        System.out.println(a[a.length - 1]);
        System.out.println("数组元素长度个数" + a.length);
        System.out.println("排序前：");
        System.out.println(Arrays.toString(a));
        BubbleSort(a);
        System.out.println("冒泡排序后：");
        System.out.println(Arrays.toString(a));
        int[] a2 = {11, 3, 4, 23, 56, 2, 22};
        ChoseSort(a2);
        System.out.println("选择排序后：");
        System.out.println(Arrays.toString(a));
        int[] b = {11, 2, 34, 62, 43, 13, 3};
        ChoseSort(b);
        System.out.println("查找数组");
        System.out.println(Arrays.toString(b));
        int[]a1={1,2,3,4,5,6};
        System.out.println("二分查找");
        System.out.println("a1数组中3的位置" + erfen(a1, 3));
        System.out.println("b数组中11的位置" + erfen(b, 11));


    }

    //冒泡排序
    public static void BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j <arr.length-i-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
            }
        }
        }
//        for (int i=0;i<arr.length-1;i++){
//            for (int j=0;j<arr.length-1-i;j++){
//                if(arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
    }

    //选择排序
    public static void ChoseSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }

    }


    //        for (int i=0;i<arr.length-1;i++){
//            for (int j=i+1;j<arr.length;j++){
//                if (arr[i]>arr[j]){
//                    int temp = arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//    }
    //二分查找
    public static int erfen(int[] arr, int key) {
//        int min = 0;
//        int max = arr.length - 1;
//        int mid = (min + max) / 2;
//        while (key != arr[mid]) {
//            if (key > arr[mid]) {
//                min = mid + 1;
//
//            } else {
//                max = mid - 1;
//
//            }
//
//            if (min > max) {
//                return -1;
//            }
//            mid = (min + max) / 2;
//
//        }int index = mid;
//        return index;
        int min =0;
        int max=arr.length-1;
        int mid=(min+max)/2;
        while (key!=arr[mid]){
            if ( key>arr[mid]) {
                min = mid + 1;
            }
                else{
                    max=mid-1;
                }
            if (min>max){
                System.out.println("数组中没有"+key);
            }

            mid=(min+max)/2;
        }
        if(key==arr[mid])
        {
            int index=mid;
            return index;
        }

        int index=mid;
        return index;
    }

}
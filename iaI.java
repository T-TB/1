package test;

import java.util.Scanner;

public class iaI {

   /*
	打印杨辉三角形(行数可以键盘录入)

	1
	11
	121
	1331
	14641
	.......

	规律：

		两边赋值规律：
			1
			11
			1*1
			1**1
			1***1

			arr[i][0] = 1;
			arr[i][i] = 1;

		中间赋值规律：
			arr[i][j] = arr[i-1][j-1] + arr[i-1][j]

		打印规律：
		*
		**
		***
		****

		for (int i=0; i<=n; i++) {
			for (int j=0; j<=i; j++) {
				SOP("*");
			}
			System.out.println();
		}
*/



        public static void main(String[] args) {
            //创建对象
            Scanner sc = new Scanner(System.in);

            System.out.println("请输入杨辉三角形的行数：");
            int row = sc.nextInt();

            //创建二维数组，用来存储图形
            int[][] arr = new int[row][row];


            //两边赋值规律：
            for (int i=0; i<row; i++) {
                arr[i][0] = 1;
                arr[i][i] = 1;
            }

            //中间赋值规律:
            for (int i=2; i<arr.length; i++) {
                //arr[0],arr[1] 一维数组
                for (int j=1; j<i; j++) {
                    //arr[i][j] 具体一维数组的元素
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
            }


            //打印图形
            printArray( arr );
        }

        //打印图形
        public static void printArray(int[][] arr){
            for (int i=0; i<arr.length; i++) {
                //arr[0]...
                //for (int j=0; j<arr[i].length; j++) {
                for (int j=0; j<=i; j++) {
                    //arr[i][j] 元素值
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();//换行
            }
        }


}



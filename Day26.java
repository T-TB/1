package test;

import java.io.File;

public class Day26 {
    public static void main(String[] args) {
        one();
    }

    private static void one() {
        //删除目录或文件夹时必须为空
        File file = new File("G:\\JAVA黑马\\张天宝\\aaa\\bbb");
        System.out.println(file.delete());
    }
}

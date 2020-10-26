package test;

import java.security.PrivateKey;

public class Stu {
    private String name;
    private int  yuwen;
    private  int shuxue;
    private int yingyu;


    public Stu(String name, int yuwen, int shuxue, int yingyu) {
        this.name = name;
        this.yuwen = yuwen;
        this.shuxue = shuxue;
        this.yingyu = yingyu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYuwen() {
        return yuwen;
    }

    public void setYuwen(int yuwen) {
        this.yuwen = yuwen;
    }

    public int getShuxue() {
        return shuxue;
    }

    public void setShuxue(int shuxue) {
        this.shuxue = shuxue;
    }

    public int getYingyu() {
        return yingyu;
    }

    public void setYingyu(int yingyu) {
        this.yingyu = yingyu;
    }

    public  int zongfrn(){
        return  yuwen+yingyu+shuxue;
    }
}

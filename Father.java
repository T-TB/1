package test;
//父类
public class Father {
    String s;
    private String f1 ="这是父类中私有的字符串";
    protected String f2 ="这是父类中被保护的字符串";
    protected String f3 ="这是父类中公开的字符串";
   public Father(){ }
    public Father(String s){
        this.s= s;
    }
    private void F1(){
        System.out.println("这是父类中私有的方法");
    }
    protected void F2(){
        System.out.println("这是父类中被保护的方法");
    }
    public void F3(){
        System.out.println("这是父类中公开的方法");
    }
    public static void main(String[] args) {
        System.out.println("父类调用");
        Father f =new Father("aaaaa");
        System.out.println(f.s);
        System.out.println(f.f1);
        System.out.println(f.f2);
        System.out.println(f.f3);
        System.out.println();
    }
}

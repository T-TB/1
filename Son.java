package test;
//同包下子类
public class Son extends Father{
    public Son(){};
    public Son(String s){
        super(s);
    }
    @Override
    protected void F2() {
        System.out.println("同包下子类");
        super.F2();
        System.out.println("这是子类重写父类中被保护的方法");
    }

    @Override
    public void F3() {
        System.out.println("同包下子类");
        super.F3();
        System.out.println("这是子类重写父类中公开的方法");
    }

    public static void main(String[] args) {
        System.out.println("同包下子类调用父类");
        Son s= new Son();
        System.out.println(s.f2);
        System.out.println(s.f3);
        s.F2();
        s.F3();

    }
}

package day48_Abstraction;

public interface Interface3 {

    public void method1();
    public abstract void method2();

    static final int num=100; //by default public
    int num2=300; //by default: public static final

    public static void main(String[] args) {
       Interface3.method3();
        System.out.println(num2);
    }

    static void method3(){} //static method abstract olamaz. o yuzden body olmasi lazim
}

package day48_Abstraction;

public interface Interface2 {


    //public Interface2(){} //Compile error Constructors class lardan olusturulur. Interface de class degildir.

    //public void method1(){} //instance method

    //{} //instance block


    //int a; //error cunku variable static ve finaldir. final oldugu icin hemen initialize yapmamiz lazim
    //public static final int a=100; //public, static, final are given by default.
    int a=100; //by default final

    public static void main(String[] args) {
        System.out.println(a); //by default static
        // a=200; //by default it is final
        // Cannot assign a value to final variable 'a'

        System.out.println(Interface2.a);
        Interface2.method4();
    }
    public static void method4(){}

void method5();

    default void method6() { //to have lambda expression.// WE CAN CREATE DEFAULT METHOD!!! IT IS NEW METHOD! IT CAN ONLY BE CREATED INTERFACE!
        System.out.println("Default method");
    }
}

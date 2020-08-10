package day48_Abstraction;

abstract class T {
    //default void method2(){}
}

public interface defaultMethod {

    default void method() { //default method. //ONLY for interface Sadece interface class ta bulunur.
        System.out.println("Default method");
    }

    public static void main(String[] args) {
        //method(); //method() static degil o yuzden error
        //defaultMethod obj=new defaultMethod(); //obj olusturamayiz.cunku class degil,interface.

    }

    class N implements defaultMethod { //class ta obj olusturabiliriz
        public static void main(String[] args) {
            N obj = new N();
            obj.method();
        }
    }

}

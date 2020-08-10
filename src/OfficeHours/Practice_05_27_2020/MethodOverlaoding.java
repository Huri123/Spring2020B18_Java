package OfficeHours.Practice_05_27_2020;

//Same method name,different parameter.The only thing that matters is parameter.
/*
Reem'in notlari:
OverLoading:
        * happens in SAME class
    * SAME method name
            * DIFFERENT parameter
            * Return type does NOT matter
            * Access modifier does NOT matter
            * Instance method CAN be overloaded
            * STATIC methods CAN be overloaded
            * Constructor CAN be overloaded
            * ALL METHODS CAN BE OVERLOADED
 */
public class MethodOverlaoding {

    public void method1() {//instance method

    }

    public String method1(int a) { //return type String olmasina ragmen method overloading yaptik
        return "123";               //instance method
    }

    public static void method2() {//static method

    }

    public static int method2(int a) {//static method
        return 123;
    }

    public MethodOverlaoding() { //constructor

    }

    public MethodOverlaoding(int a) { //constructor overloading, parameter must be different

    }
    public MethodOverlaoding(int a,int b){ //constructor overloading, parameter must be different

    }

    public static void main(String[] args) {
        System.out.println("String");
    }
    public static void main(int a) { //main methodu overload yaptik. but the original main method runs.
                                    // Because compiler only recognizes the original main method
        System.out.println("String");
    }

}

package day38_Constructors;

public class ConstructorCalls {

    public ConstructorCalls() {
        method1();
        method2();
    }

    public ConstructorCalls(int a) {
        // ConstructorCalls(); you cannot call the constructor by its name
        this(); //ConstructorCalls i call yapmaya yarar
    }

    public static void method1() {
        //method2();//method2 static olmadigi icin burda error verir
        //ConstructorCalls(); you cannot call the constructor by its name

    }

    public  void method2(){
        method1();
    }
}
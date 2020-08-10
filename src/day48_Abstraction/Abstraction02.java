package day48_Abstraction;

interface A1 {
    void method1();  //public
}

interface B1 {
    abstract int method2();
}

interface C2 {
    public abstract void method3();
}

public class Abstraction02 implements A1, B1, C2 { //We can implement as many interfaces as we want

    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 10;
    }

    @Override
    public void method3() {

    }
}
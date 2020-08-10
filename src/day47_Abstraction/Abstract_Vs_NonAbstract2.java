package day47_Abstraction;

abstract class A{
    public abstract void method1();
    public void method2(){}
}
public class Abstract_Vs_NonAbstract2 extends A {
    //2 methods
    @Override
    public void method1() {

    } //MANDATORY to override the abstract method of A

}
abstract class B extends A {  //optional override the abstract method of A
//we have here one abstract & one instance methods
}


class C extends B {

    @Override
    public void method1() {

    }
}
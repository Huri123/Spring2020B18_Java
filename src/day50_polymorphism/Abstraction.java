package day50_polymorphism;

interface I{
    //protected void method2();      //error cunku you can only use public in interface
    void method2();                 //access modifier is public. this methos is public and abstract by default.
    abstract int method3();         //abstract keyword e gerek yok. o zaten by default abstract. o yuzden gri yazilmis.intelliJ de gereksizler gri yazilir.

    //public I(){}                  //You cannot have constructor in interface

    //public void m(){}             //interface methodlarin body{} si olamaz

    //{ }                           //You cannot have default block in interface
    //static { }                    //You cannot have static block in interface

    int a = 1000;                   //public static final by default

    public static void main(String[] args) {
        System.out.println(a);      //a, deafult olarak static oldugu icin directly call yapabildik.
    }
}

abstract class A{

    { }
    static { }
    public A(){ }
    protected abstract void method1();
    //abstract void method4();        //private olmaz cunku private is not be override
    public void method4(){ }

}
interface I2{}

//public abstract class Abstraction extends A implements I,I2{} //boyle abstract olsaydi override yapmak zorunda degildik

public class Abstraction extends A implements I,I2{

    @Override
    protected void method1(){ }//burasi overriding. o yuzden return type(void) ayni olmali.Ama overload olsaydi return type ayni olmak zorunda degildi

    /*
    @Override
    void method4(){}          //abstract class A{} bu class ta "abstract void method4();" boyle olsaydi burda bu sekilde override yapmak  cunku method abstract olurdu
     */

    @Override
    public void method2() {

    }

    @Override
    public int method3() {
        return 0;
    }

    // public abstract void method1(); //method un abstract olmasi icin class in ya abstract ya da interface olmasi lazim

}

/*
Muhtar'in kodlari:
interface I{
    void method2(); // public abstract
    abstract int method3();

  //  public I(){}
  //  public void m(){ }
 // {  }
  //  static { }

    int a = 1000;  // public static final

    public static void main(String[] args) {
        System.out.println(a);
       // a = 2000;

    }

}

abstract class A{
    {

    }

    static{

    }

    public A(){

    }

    protected abstract void method1();
    public void method4(){ }

}

interface I2{

}

public class Abstraction extends A  implements I, I2{

    @Override
    public  void method1(){

    }


    @Override
    public void method2() {

    }

    @Override
    public int method3() {
        return 0;
    }


} */

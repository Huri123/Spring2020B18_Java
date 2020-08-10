package day46_final_abstract;
//parent class cannot be final

 public class final_Practices {
    final int a = 10;
    final static int b = 20;

    {
        System.out.println(a);
        //a=20;  //final cannot be reassigned
    }

    static {
        System.out.println(b);
        // b=30;  //final cannot be reassigned static olsa bile
    }

    public final_Practices() {
    }

    /*
        static final public void method2(){//the position of final and access modifier doesn't matter as long as they are before return-type

        }
        final public void method1(){ }//the position of final and access modifier doesn't matter as long as they are before return-type
     */
    final void method1() {
    } //the position of final and access modifier doesn't matter as long as they are before return-type

    public final static void method2() {
    }

    private final int method1(int a) { //method overloading
        return 12;
    }

    public final static void method2(int a) {
    } //we can use final at method overloading
}


final class test extends final_Practices { //final class inherit edilemez.yani final_Practices classi final olmamali
    /*
    @Override
    protected void method1(){
    }
     */
}

final class test2 extends final_Practices {//ama test i extend yapsaydi final yuzunden hata verecekti

}

/*
Muhtar'in kodlari:
public class final_Practices {
    final int a = 10;
    final static int b= 20;

    {
        System.out.println(a);
      //  a = 20; // cannot be reassigned
    }

    static{
        System.out.println(b);
      //  b = 30;
    }

    public final_Practices(){

    }

      final void method1(){

    }

    public final static void method2(){

    }

    private final int method1(int a){
        return 12;
    }

    public final static void method2(int a){

    }

}

final class test extends final_Practices{
    /*
    @Override
    protected void method1(){ }

}
final class test2 extends final_Practices{

}
 */


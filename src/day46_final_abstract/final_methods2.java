package day46_final_abstract;
//final and override are like fire and water

class Test {
    public final void method1() {//private olamaz cunku o zaman inherit edilemez
        System.out.println("A");
    }
}

public class final_methods2 extends Test {
    //final methods cannot be overridden
    /*
    @Override //to check if the method is overridden
    public void method1() {  //protected olamaz cunku method access modifier same or more visible olmali
        System.out.println("B");
    }
     */
}

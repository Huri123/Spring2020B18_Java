package OfficeHours.Practice_05_20_2020;

class test{
    /*
    public test(){
        System.out.println("default");
    }
     */
    public test(String str){
        System.out.println("String");
    }
    public test(int a){
        System.out.println("int");
    }
    public test(double b){
        System.out.println("double");
    }
}
public class Constructor2 extends test{

    public Constructor2(){
        super("Hello");//String
        System.out.println("deafult");//default
    }
    /*
    public void method(){//regular, static methods cannot call another constructor
      super("Hello") ;
    }
     */

    public static void main(String[] args) {

        Constructor2 obj = new Constructor2();

    }
}

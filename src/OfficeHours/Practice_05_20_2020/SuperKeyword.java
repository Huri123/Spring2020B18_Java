package OfficeHours.Practice_05_20_2020;

class Data{
    int a=100;
    public void method(){
        System.out.println("Hello World");
    }
}
public class SuperKeyword extends Data{
    int a=200;
    public void method(){
        System.out.println("Hello Cybertek");
    }
   /*
    public SuperKeyword(){
        //method();//boyle de cagrilabilir
        this.method();//ustteki methodu cagirir "hello cybertek"
    }
    */
    /*
    public SuperKeyword(){
        super.method();//en ustteki methodu cagirir "hello world"
    }
     */
    public SuperKeyword(){
        method();
        System.out.println(a);
    }

    public static void main(String[] args) {
        SuperKeyword obj=new SuperKeyword();
    }
}

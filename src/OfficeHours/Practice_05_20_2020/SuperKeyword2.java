package OfficeHours.Practice_05_20_2020;

//super keyword super class takileri cagirmaya yarar

class TestData{
    int num=1000;
    String name="Cybertek;";

    public void method(){
        System.out.println("Cybertek School");
    }
}

public class SuperKeyword2 extends TestData{

    int num=200;
    String name="MIT";

    public void method(){
        System.out.println("MIT School");
    }
    public SuperKeyword2(){
       // method();//calling the method the one in the current class//prints MIT School
        super.method();//prints Cybertek School
        System.out.println(num);//prints 200
        System.out.println(super.num);// prints 1000 that is in the parent/super class
        System.out.println(super.name);//prints the name that in the super class==>Cybertek
    }

    public static void main(String[] args) {
        SuperKeyword2 obj=new SuperKeyword2();
    }




}

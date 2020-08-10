package OfficeHours.Practice_05_27_2020;

public class methodOverriding2 {
    protected void method1(){

    }
}
class TestClass extends methodOverriding2{
    @Override
    protected void method1(){

    }
    //@Override
   // public static void method2(){ }

    //public methodOverriding2(){} //only the instance(visible yani not private) method can be overridden
}

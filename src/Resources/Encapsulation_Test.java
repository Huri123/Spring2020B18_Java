package Resources;

import day40_Encapsulation.Encapsulation;

public class Encapsulation_Test {

    public static void main(String[] args) {

        Encapsulation obj=new Encapsulation();//import

       // Encapsulation_Test obj2=new Encapsulation_Test();
        // obj2.SSN=1000; //Error because getter setter still belongs to Encapsulation class.

        //System.out.println(obj.SSN);//NOT accessible outside the package

        System.out.println(obj.getSSN());
        obj.setSSN(123);
        System.out.println(obj.getSSN());
    }
}

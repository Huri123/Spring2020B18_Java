package day40_Encapsulation;

public class Test {
    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation();
        //System.out.println(obj.SSN);//it's private hidden its class.//Access modifier is private it is not visible outside the class. so we cannot call it directly

        System.out.println(obj.getSSN()); //0   //getSSN instance method oldugu icin obj name ile cagirabiliyoruz

        //obj.SSN=12345; //to do this we need setter method

        obj.setSSN(123456); //setSSN instance method can be called through obj
        // System.out.println(obj.SSN);

        System.out.println(obj.getSSN());//123456 verecek. set yaptik cunku


    }
}

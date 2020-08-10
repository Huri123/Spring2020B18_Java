package day40_Encapsulation;

public class Person_Objects {

    public static void main(String[] args) {

        Person Zarina = new Person("Zarina");
        System.out.println(Zarina.name);
        //System.out.println(Zarina.SSN); //Error because it's private

        System.out.println("Zarina's SSN: "+Zarina.getSSN());//0 set yapmadigimiz icin default olarak 0 verir

        Zarina.setSSN(12345);
        System.out.println("Zarina's SSN: "+Zarina.getSSN());//0 set yapmadigimiz icin default olarak 0 verir

        //System.out.println(Zarina.ID);// Access modifier is private it is not visible outside the class. so we cannot call it directly

        System.out.println("Zarina's ID: "+Zarina.getID());

        Zarina.setID(567);
        System.out.println("Zarina's ID: "+Zarina.getID());
    }

}

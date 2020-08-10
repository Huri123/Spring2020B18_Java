package day41_Inheritance.Task01;

public class EmployeeObjects {
    public static void main(String[] args) {

        Developer dev1 = new Developer("Namik", 120000, 123, "Software Developer", 'F');

       //dev1.reporting();//error
        dev1.fixingBug();

        System.out.println(dev1);

        System.out.println("==============================================");

        Tester tester1=new Tester("Huri",120005,12345,"SDET",'F');

        //tester1.coding(); // compiler error because coding method is only unique for developer class
        tester1.testing();
        tester1.reportingBug();

        System.out.println(tester1);

        System.out.println("===============================================");

        BusinessAnalyst BA1=new BusinessAnalyst("Sarah",100000,1236,'F');
        //BA1.coding();//error it is in Tester class.
        //BA1.fixingBug();//error it is in Tester class.
        BA1.gathering();
        BA1.writingRequirements();
        System.out.println(BA1);


    }
}
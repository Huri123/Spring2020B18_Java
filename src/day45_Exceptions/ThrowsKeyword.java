package day45_Exceptions;

//The disadvantage of the throws keyword is the caller(cagiran method) is responsible to deal with it. Yani exception
//caller(cagiran method) da da cikacak.O yuzden caller da throws yapmali.

//Reem'in notlari:
// THROWS keyword:
//          we use it to HANDLE an exception temporarily
//          we use throws keyword in the method signature
//          if the method is called somewhere else ==> caller method needs to throw exception again in its signature
//          after throws keyword: order of exceptions is child to parent class ( if we wanted to use multiple classes)
//          if I use two exception classes, it is ok if the child class is not the class that handles exception,
//          ==> as long as parent class handles it
//          'throws' keyword MUST BE USED IN THE METHOD'S SIGNATURE not in the body
//          Disadvantage of throws key word ==> the CALLER of the method MUST handle exception by throwing exception
//          if we use the 'throws' keyword in the method's sig ==> it will handle MULTIPLE of EXCEPTIONS all at once
public class ThrowsKeyword {

    public static void sleep1(){
       // This is one way to handle the exception
        try {
            Thread.sleep(3000);
        } catch(Exception e){ }
   }

    //2nd solution.This means throw exception in this method. But exception is not completely gone
    //Because the method threw it not the code fragment.
    public static void sleep2() throws InterruptedException {

        Thread.sleep(3000);

    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Cybertek");
        //sleep1();
        sleep2();                        //main method un da throws yapmasi lazim. eger yapmazsa bu sleep2 gives exception
                                        // because bu exception sadece sleep2 methodunda handle yapildi. o yuzden main
                                       // methodun da bu methodu da throw yapmasi lazim
        System.out.println("Java");
    }

    public static void method1() throws Exception{

        String[] arr={"A"};
        main(arr); //method1 de de throws yapmazsak burda da exception verir.

    }

    public static void method2() {
        try {
            method1(); //try catch yapmasaydik burda da exception verecekti
        } catch (Exception e) { }


    }

    public static void method3() {

        method2(); //exception vermez. Cunku try catch de caller exceptiondan sorumlu degil
    }
}

package day44_Exceptions;

public class ExceptionPractice {

    public static void main(String[] args) {


        try {
            System.out.println("Hello");
            System.out.println("Hola");
            System.out.println(9/0);//unchecked oldugunda direkt catch block a atlar
            System.out.println("Cybertek");//ustte unchecked exception oldugu icin bunlar calismaz
            System.out.println("Java");//ustte unchecked exception oldugu icin bunlar calismaz
        }catch (Exception e){

        }
        //System.out.println("Cybertek"); //buraya yazarsan run eder
        //System.out.println("Java");
    }
}

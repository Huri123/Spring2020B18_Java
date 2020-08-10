package day45_Exceptions;

import java.io.IOException;
import java.util.NoSuchElementException;

public class summary {
    public static void main(String[] args) {

        // Thread.sleep(3000); //hata veriyor.cunku kendi methodunda throws var
        //sleep in ustune gel ctrl ye bas click yap o methodu gorursun

        try {
            throw new IOException();  // checked
        } catch (IOException e) { }

        System.out.println("Hello");

        try {

            throw new ArrayIndexOutOfBoundsException();

        //} catch (NoSuchElementException e) { } //BU DA OLUR
        } catch (RuntimeException e) { }

        System.out.println("Completed"); //ArrayIndex... in parent i.

        try {
            throw new ClassNotFoundException();
        } catch (Exception e) { }

        System.out.println("Completed");

        try {
            throw new NullPointerException();
        }catch(ArithmeticException a ){
            System.out.println("Arithmetic");
        }catch(ClassCastException a){
            System.out.println("Class Cast");
        }




        //  System.out.println("Completed");


    }
}
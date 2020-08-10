package day45_Exceptions;

//Reem'in notlari:
// THROW keyword:
//          we use it manually to throw the exception.
//          It CREATES an exception.
//          it DOES NOT HANDLE exception
//          We needed when we need to throw an exception manually
//          We create an object from an exception class but using new keyword and constructor of that class
//          easily used to throw UNCHECKED exceptions
//          you MUST have an object of the exception class to throw an exception manually
//          throw keyword can throw ONE EXCEPTION at a time :
//          because once an exception is thrown NOTHING is executed after
//          When you manually throw exception ==> you do not handle it ==> because the purpose was to CREATE it

import java.io.IOException;
import java.util.NoSuchElementException;

public class ThrowKeyWord {
// chrome, firefox, opera ...

    // whenever we have to throw exception manually we have to use throw keyword
    // each exception in java is a class
    // if it's a class, can I create an object from it? yes I can

    public static void main(String[] args)  {

        // I will create an object from exception class: NoSuchElementException like the following"

        NoSuchElementException  obj = new NoSuchElementException();

        // we can throw manually like this:
        // throw obj;

        // but because in Java, we will not need to use obj so ==> we can use throw and then the object immediatlely
        // (we create object by new keyword and calling default constructor of that class)
        //  In our case : new NoSuchElementException(); creates an object from this class
        //   To manually throw exception by using object from exception class:
        //   throw new NoSuchElementException();

        //  System.out.println();
        // BUT AFTER THIS THROW LINE: NOTHING WILL GET EXECUTED

        boolean breakTime = true;

        if(breakTime){
            throw new RuntimeException("It's break time, we should take break");
        }



        //    throw new IOException();

        int[] arr = {5,6,7};

        //    System.out.println(arr[100]);
        //   System.out.println( 9 / 0 );

        //  throw new RuntimeException();
        // System.out.println();

        try {
            throw new RuntimeException();
        }catch (Exception e){

        }


    }
}

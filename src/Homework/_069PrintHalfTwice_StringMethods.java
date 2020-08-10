package Homework;

import java.util.Scanner;

/*
Instructions from your teacher:
Write a program that will print out first half of the word twice.

Example:

input: java
output: jaja
 */
public class _069PrintHalfTwice_StringMethods {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    //WRITE YOUR CODE HERE
        int a=word.length()/2;

   String b=word.substring(0,a);
   for(int i=0;i<2;i++){
       System.out.print(b);
    }
}
}

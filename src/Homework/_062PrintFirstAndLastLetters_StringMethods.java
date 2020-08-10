package Homework;

import java.util.Scanner;

/*
Instructions from your teacher:
Write a program that will print out first and last letters together.

adobe
ae
 */
public class _062PrintFirstAndLastLetters_StringMethods {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        int last= word.length()-1;
        char l=word.charAt(last);
        System.out.print(word.charAt(0));
        System.out.print(l);
    }
}


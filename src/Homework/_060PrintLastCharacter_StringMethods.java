package Homework;

import java.util.Scanner;

/*
Write a program that will print out last letter of the word (string).
 */
public class _060PrintLastCharacter_StringMethods {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        int num=word.length()-1;
        char a =word.charAt(num);
        System.out.println(a);
    }
}

package Homework;

import java.util.Arrays;
import java.util.Scanner;

/*
Instructions from your teacher:
Given a String array words, iterate through each word and print first and last letter of each element in separate lines.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print:
       ho
       wy
       by
       ae
       ne
 */
public class _ArraysPrintFirstLastCharI {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};


        //TODO: Write your code below
        String str = "";

        for (int i = 0; i < words.length; i++) {
            str = "" + words[i].charAt(0) + words[i].charAt(words[i].length() - 1);
            System.out.println(str);
        }


    }
}

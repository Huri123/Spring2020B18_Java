package Homework;

import java.util.Scanner;

/*
Write a program that will print out the longest word between two words.
 */
public class _061PrintTheLongestWord_StringMethods {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //WIRTE YOUR CODE HERE
        String max="";
        if(word2.length()>word1.length()){
            max=word2;

        }else{
            max=word1;

        }
        System.out.println(max);
    }
}


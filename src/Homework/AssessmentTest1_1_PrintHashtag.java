package Homework;

import java.util.Scanner;

/*
Instructions from your teacher:
Given an int variable k that has already been declared, use a for loop to print a single line consisting of 49 hashtags.
Use no variables other than k.
 */
public class AssessmentTest1_1_PrintHashtag {
    public static void main(String[] args) {
        //DO NOT CHANGE
        int k = 1;
        //WRITE YOUR CODE HERE
        for (k = 0; k <= 49; k++) {
            System.out.print("#");
        }

        /*
        Assessment test #1. 2 - Print largest number among three numbers

        Instructions from your teacher:
        In this problem you need to write a program that checks for the bigger of 3 numbers.

        You are given 3 int variables: num1 , num3 and num3.

        if num1 is biggest - output: "n1 is bigger"
        if num2 is biggest - output: "n2 is bigger"
        if num3 is biggest - output: "n3 is bigger"
         */
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("n1 is bigger");
        } else if (num3 > num2 && num3 > num1) {
            System.out.println("n3 is bigger");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("n2 is bigger");
        }
    }
}

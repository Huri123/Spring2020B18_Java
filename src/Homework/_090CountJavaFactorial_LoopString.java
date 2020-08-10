package Homework;

import java.util.Scanner;

/*
Instructions from your teacher:
Return the number of times that the string "java" appears anywhere in the given string word.

Example:
input: javaxjava
output: 2

Example:
input: javaxjavaapplepearjavaegg
output: 3
 */
public class _090CountJavaFactorial_LoopString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      /*  String word = scan.next();
        int count = 0;
        while (word.contains("java")) {
            count++;
            word = word.replaceFirst("java", "");
        }
        System.out.println(count);

       */


        /*
        092. Factorial_Loop

        Instructions from your teacher:
        In mathematics, the factorial of a positive integer n, denoted by n!, is the product of all positive integers
         less than or equal to n.  Calculate factorial and output result to the console.
        Example:
        input: 5
        output: 120
         */
            int n = scan.nextInt();
            long i = 1l;
            while (n>=1){
                i = i*n;
                n--;
            }
        System.out.println(i);


        }
    }


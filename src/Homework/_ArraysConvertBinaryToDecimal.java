package Homework;

import java.util.Scanner;

/*
Instructions from your teacher:
Binary number is a number expressed in the base-2 numeral system or binary numeral system, which uses only two symbols:
 typically 0 (zero) and 1 (one). Each digit is referred to as a bit.

Given an array binary with 8 integers (0s or 1s), write java program to calculate decimal value and print out to console.
 Feel free to use additional arrays or formulas.

Example:
binary -> [0, 0, 0, 0, 0, 0, 1, 1]
print 3

binary -> [0, 0, 1, 0, 0, 0, 1, 1]
print 35

 */
public class _ArraysConvertBinaryToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] binary = new int[8];
        for (int i = 0; i < binary.length; i++) {
            binary[i] = input.nextInt();
        }

        //TODO: Write your code below.
        int decimal=0;
        int exponential=128;// for 8 digit. ===> (2*2*2*2*2*2*2*2=128)
        for(int each:binary){
            decimal+=each*exponential;
            exponential/=2;
        }
        System.out.println(decimal);
    }
}

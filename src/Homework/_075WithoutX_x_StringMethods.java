package Homework;

import java.util.Scanner;

/*
Instructions from your teacher:
Given a string word, if the first or last chars are 'x' or 'X',
print the string without those 'x' or 'X' chars,  otherwise print the string unchanged.

Example:
input: xHiX
output: Hi

Example:
input: apple
output: apple

input: xUxL
output: UxL

input: JavaX
output: Java
 */
public class _075WithoutX_x_StringMethods {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.contains("x")) {
            word = word.replace("x", "");
        } if(word.contains("X")){
                word = word.replace("X","");

            }
            System.out.println(word);

        }

    }


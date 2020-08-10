package Homework;

import java.util.Scanner;

/*
Instructions from your teacher:
Inputs:
String word;

Write a for loop that will loop through every letter of the input and print out just the vowels. Sample input/outputs
HINT:  vowel is a letter representing a vowel sound, such as a, e, i, o, u.

In: howdyho
oo

In: huehuehuehue
ueueueue


In: poopoo what idk what im doing
ooooaiaioi
 */

//anlamadim
public class AssessmentTest_5_1_PrintVowels {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        String vowels = "";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'u' || ch == 'o' || ch == 'i') {
                vowels += "" + ch;
            }
        }
        System.out.println(vowels);


    }
}

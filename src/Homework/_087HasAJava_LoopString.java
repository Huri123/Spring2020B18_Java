package Homework;

import java.util.Scanner;

/*
Instructions from your teacher:
Given a string word, print true if "java" appears starting at index 0 or 1 in the string,
 such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0word = .
Example:
input: javapython
output: true

Example:
input: cjavac++
output: true


Example:
input: c#javaruby
output: false
 */
public class _087HasAJava_LoopString {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if (word.length() >= 4) {
            if (word.startsWith("java") || word.substring(1, 5).equalsIgnoreCase("java")) {
                exists = true;

            } else {
                exists = false;
            }

        } else {
            exists = false;
        }
        System.out.println(exists);
    }
}
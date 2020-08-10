package Homework;

import java.util.Scanner;

/*
Instructions from your teacher:
Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to
the number of appearances of "python" anywhere in the string (case sensitive).
Example:
input: We study java not python
output: true

Example:
input: What's the difference between java, javascript and python?
output: false
 */
public class _097EqualsJavaPython_LoopString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sentence = scan.nextLine();
        int countj = 0;
        int countp = 0;
        while (sentence.contains("java")) {
            countj++;
            sentence = sentence.replaceFirst("java", "");
        }
        while (sentence.contains("python")) {
            countp++;
            sentence = sentence.replaceFirst("python", "");
        }
        boolean a = countj == countp;
        System.out.println(a);


    }
}

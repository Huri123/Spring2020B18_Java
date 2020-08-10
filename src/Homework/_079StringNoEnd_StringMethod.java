package Homework;

import java.util.Scanner;

/*
Instructions from your teacher:
In this exercise you get a string called txt .

output txt without its last letter.

for example:

txt = "foo"

output will be:
fo

 */
public class _079StringNoEnd_StringMethod {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here
        int last=txt.length()-1;
        String result=txt.substring(0,last);
        System.out.println(result);
  }
}
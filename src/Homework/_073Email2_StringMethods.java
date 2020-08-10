package Homework;

import java.util.Scanner;

/*
Instructions from your teacher:
Write a program that will print out information about the user based on email.
 Print first and last name from the email with the upper case. (Assume that first and last names
 were separated by an underscore)

Example:
Input: craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
Top-Level Domain: com
 */
public class _073Email2_StringMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String first = email.substring(0, email.indexOf("_"));
        first=first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();
        String last = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
        last=last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();
        String domain = email.substring(email.indexOf("@") + 1, email.indexOf("."));
        String ldomain = email.substring(email.indexOf(".") + 1);


        System.out.println("First name: " + first);
        System.out.println("Last name: " + last);
        System.out.println("Domain: " + domain);
        System.out.println("Top-Level Domain: " + ldomain);


    }
}

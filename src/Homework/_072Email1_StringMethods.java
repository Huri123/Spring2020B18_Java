package Homework;

import java.util.Scanner;

public class _072Email1_StringMethods {
    /*
    Instructions from your teacher:
In this task, you need to swap the first name with the last name in the email.
 If the email doesn't contain underscore - do not do anything.

Example:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com

Example:
input: barakobama@gmail.com
output: barakobama@gmail.com

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.nextLine();
        if (email.contains("_")) {
            int a=email.indexOf("_");
            int b=email.indexOf("@");

            String first = email.substring(0,a);
            String last = "" + email.substring(a+1,b);

            System.out.println(last + "_" + first + "@gmail.com");
        } else {
            System.out.println(email);
        }


    }
}

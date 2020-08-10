package Homework;

/*
Instructions from your teacher:
extractNum

description:
a method that cleans any non number string from a string it gets
and returns the clean string
input:
-s (string)- a string the method gets
return: string: a string of numbers only

example use:

extractNum("aa2aa3") ==> 23

extractNum("aa2") ==> 2

extractNum("aa10aa") ==> 10

extractNum("aa!!%$#.10aa") ==> 10


hint:
you can use:
 Character.isDigit(ch)
 or conditions

 */
public class _186MethodsWithString_12_ExtractNumberFromString {
    public static String extractNum(String s) {
        String str = "";
        char[] ch = s.toCharArray();
        for (char each : ch) {
            if (Character.isDigit(each)) {
                str += each;

            }
        }
        return str;
    }

    public static void main(String[] args) {
        String a = "aa!!%$#.10aa";
        System.out.println(extractNum(a));
    }
}

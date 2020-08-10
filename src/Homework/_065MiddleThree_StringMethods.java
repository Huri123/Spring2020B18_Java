package Homework;
/*
Instructions from your teacher:
You have a word, do the following:

If the word has odd number of characters
and has 5 or more characters, print the middle three
characters of the word.

Otherwise print "invalid".

fifteen ==> fte
apple ==> ppl
hey ==> invalid
java ==> invalid
whatsup ==> ats
$ ==> invalid
 */
import java.util.Scanner;

public class _065MiddleThree_StringMethods {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    //YOUR CODE HERE
    boolean odd = word.length() % 2 != 0;
    boolean even = word.length() % 2 == 0;
    int mid = word.length() / 2;
    String ch = "";
    if(odd && word.length() >= 5){
        System.out.println("" + word.charAt(mid - 1) + word.charAt(mid) + word.charAt(mid + 1));
    }else{
        System.out.println("invalid");
    }
}
}


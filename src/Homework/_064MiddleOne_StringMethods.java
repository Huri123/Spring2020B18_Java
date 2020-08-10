package Homework;

import java.util.Scanner;

/*
Instructions from your teacher:
You have a word, do the following:

1. When word has odd number of characters and:
            - 3 or more characters, print middle letter
      oak ==> a
      javav ==> v
             - Single character, print that character 3 times
      # ==> ###
      q ==> qqq

2. When word has even number of characters and:
           - 4 or more characters, print middle 2
     java ==> av
     apples ==> pl
     #$%^&* ==> %^
           - 2 characters, print those 2 characters twice
      @@ ==>@@@@
      $$ ==>$$$$
      hi ==> hihi
 */
public class _064MiddleOne_StringMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        String middleChar = "";
        boolean odd= (word.length() % 2) != 0;
        boolean even=(word.length() % 2) == 0;
        int mid=word.length()/2;
        if(odd&&word.length()>=3) {
            System.out.println(""+word.charAt(mid));
        }else if(odd&&word.length()==1){
            System.out.println(""+word+word+word);
        }else if(even&word.length()>=4){
            System.out.println(""+word.charAt(mid-1)+word.charAt(mid));
        }else if(even&word.length()==2){
            System.out.println(""+word+word);
        }
        

    }
}

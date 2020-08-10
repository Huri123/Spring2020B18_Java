package MyLibrary;

import java.util.Scanner;

public class For_Loop {
    public static void main(String[] args) {

        // Tasks 1.  Odd & Even Numbers

        /*
        even number between 1~100 in a single line separated by space
        odd number between 1~100 in a single line separated by space
         */

//("=================================================================================================================");

        //   TASK 2.   Reverse String & Palindrome

/*
        write a program that can reverse the following string:
        String str = "Azerbaijan";
        output: najiabrezA
        Use For loop.
        Check the word is palindrome or not?
 */

//("=================================================================================================================");

        //   TASK 3.   Alphabets
  /*
        Print the Upper Case Letters
        Print the Lower Case Letters
        Use For Loop
        Next Step  do this // Aa Bb Cc Dd ....

   */

//("=================================================================================================================");

        //   TASK 4.   Calculate Sum

  /*
7. write a program that can calculate the sum of all numbers between 1 to any given number
		ex:
			input: 100
			output: 5050
			input: 50
			output: 1275
			input : 200
			output : 20100
 */

//("=================================================================================================================");

        //  TASK 5    Sum of The Even & Odd Numbers between 1~100

  /*
 write a program that can calculate the sum of all the even numbers between 1 ~ 100
 write a program that can calculate the sum of all the odd numbers between 1 ~ 100;
 */

//("=================================================================================================================");

        //TASK 6.    Skip Printing Numbers Divisible 3 and 5.
        // Skip printing the chars

/*     Between 1 to 100
       Skip Printing 1,2,4,7,8....100
       Use continue statement to print the numbers exclude  followings i%3==0 || i%5==0
 */

//("=================================================================================================================");

        // Task 7   Divisible 3 & 5

        /*
1. write a program that can print all the ODD numbers between 1 ~ 100 that can be divisible by 3 & 5
2. write a program that can print all the EVEN numbers between 1 ~ 100 that can be divisible by 3 & 5
 */


//("=================================================================================================================");

        // Task 8. English Alphabet Ascending and descending order

        /*
5. Write a program that will print out all letters in English alphabet in ascending order
	6. Write a program that will print out all letters in English alphabet in descedning order
 */

//("=================================================================================================================");

        // TASK 9   Break Statement with chars and ints

        /*
       If number equal 3 break the statement
       if char equal 'e' break the loop

         */

//("=================================================================================================================");

        //TASK 10  Remove Duplicate Chars
    /*
          write a program that can remove duplicated characters from a string
     */

    }
}

class print_OddEven {
    public static void main(String[] args) {

        // Task 1.   Odd & Even Numbers

        // this loop will print fos us even numbers from  1 to 100; It has to be started from 0 to get even numbers.
        //We use String to hold numbers with order. String result ==> 1 2 3 4 ...
        // int numbers=0; // when we use int to hold numbers we automatically will get sum of numbers. int numbers ==> 2550

        String Evens=" ";
        //even number between 1~100 in a single line separated by space
        for(int i=0; i<=100; i+=2){  // we increment it by 2
            Evens+=i+" ";
        }
        System.out.println(Evens);


        String Odds=" ";
        //odd number between 1~100 in a single line separated by space
        for(int i=1; i<=100; i+=2){  // we increment it by 2
            Odds+=i+" ";
        }
        System.out.println(Odds);

//System.out.println("===============================================================================================");

    }

}

class Revers_Palindrome_String {
    public static void main(String[] args) {

        //  TASK 2.   Reverse String & Palindrome

        String str="Azerbaijan";
        int lastIndex=str.length()-1;

        String reverse="";// reverse will hold all single chars in a reverse order.
        for(int i=lastIndex; i>=0; i--){
            reverse+=str.charAt(i); // charAt();  each single characters
        }
        System.out.println(reverse);

        boolean palindrome=str.equals(reverse);// check its palindrome or not
        System.out.println(palindrome);



//System.out.println("===============================================================================================");
    }
}

class Alphabets {
    public static void main(String[] args) {

        //   TASK 3.   Alphabets

        String upperCase=""; // A~Z
        String lowerCase=""; // a~z

        for(char i='A'; i<='Z'; i++){  // Ascii Table order numbers of Uppercase Chars ==> A=65,  Z=90
            upperCase+=i+" "; // A B C ...
        }
        System.out.println(upperCase);

        for(char a='a'; a<='z'; a++){ //Ascii Table order numbers of Lowercase Chars ==> a=97,  z=122
            lowerCase+=a+" "; // a b c ...
        }
        System.out.println(lowerCase);


        // Aa Bb Cc Dd ....

        String result="";

        for(int i=0; i<upperCase.length(); i++){
            result+=""+upperCase.charAt(i)+lowerCase.charAt(i); //Evey time loop runs it will add each upper and lower case chars
        }
        System.out.println(result);

        System.out.println('a'+""+'b'); // ab

//System.out.println("===============================================================================================");
    }
}

class Calculate_Sum{
    public static void main(String[] args) {

        //   TASK 4.   Calculate Sum

        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your Number");
        int num=input.nextInt();
        int result=0;

        // Each time loop run till given number and it will count till that number
        // for exp: if i<=num(4)==> 1+2+3+4 = 10 ,  i<=num(6) ==> 1+2+3+4+5+6 = 21
        for (int i=0; i<=num; i++){
            result+=i; // i ==> 1,2,3,4,5.... till given number. It is the numbers that how many times loop will run.
            // Depends on condition
            // Result+=i ==> means it will add each number(i) to each other
        }
        System.out.println(result);

//System.out.println("===============================================================================================");

    }
}

class SumOf_EvenAndOdd{
    public static void main(String[] args) {

        //  TASK 5   Sum of The Even & Odd Numbers between 1~100

        int sum1=0;
        int sum2=0;

        for(int i=0; i<=100; i++){
            if(i%2==0){// Even Numbers ==> 0+2+4+6+8...
                sum1+=i;
            }else{// Odd Numbers ==> 1+3+5+7+9...
                sum2+=i;
            }
        }

        System.out.println();

        System.out.println("Sum of All Even Numbers: "+ sum1);
        System.out.println("Sum of All Odd Numbers: "+sum2);

//System.out.println("===============================================================================================");
    }
}

class SkipPrinting_Followings {
    public static void main(String[] args) {

        //TASK 6. Skip Printing some Numbers between 1 - 100

        //  Skip Printing 1,2,4,7,8....100
        for (int i=0; i<=100; i++){
            if(i%3==0 || i%5==0){ // 3%3=0, 5%5=0, 6%3=0, 9%3=0, 10%5=0, 12%3=0... etc
                continue; // means skip the given condition
            }
            System.out.print(i+" "); // 1,2,4,7,8....
        }

        System.out.println();


        // skip printing Y, H, J, D
        for(char ch='A'; ch<='Z'; ch ++){ // Ascii Table order numbers of Uppercase Chars ==> A=65,  Z=90
            // for(char ch='Z'; ch>='Z'; ch --){ // we can Also use from Z to A. And in this case we will decrement the ch--
            if(ch=='Y' || ch=='H' ||ch=='J' ||ch=='D')
                continue; // skip the chars inside the if condition
            System.out.print(ch+" ");
        }


        // More examples with for loop and continue statement
/*
        for(int i=1; i<=5; i++){// i: 1 2 3 4 5
            if(i==3){
                continue;// skip the number
            }
            System.out.println(i);

        }

        for(int i=0; i<=20; i++){
            if(i%2!=0){
                continue; // skip all the odd numbers
            }
          //  if(i%2==0){ // skips all the even numbers
               // continue;
            //}
            System.out.print(i+" ");



            for(int i=1; i<=5; i++){// i: 1 2 3 4 5
            if(i==3){
                continue;// skip the number
            }
            System.out.println(i);
        }

        for(int i=0; i<=20; i++){
            if(i%2!=0){
                continue; // skip all the odd numbers
            }
           // if(i%2==0){ // skips all the even numbers
               // continue;
           // }
            System.out.print(i+" ");
        }

 */

//System.out.println("===============================================================================================");
    }
}

class Divisible_ThreeAndFive{
    public static void main(String[] args) {

        // Task 7   Divisible 3 & 5

        for (int i=1; i<=100; i++){
            //if(i%2!=0){
            if(i%2==0){ //
                if(i%3==0 && i%5==0)
                    System.out.print(i+" ");
            }
        }
//System.out.println("===============================================================================================");
    }
}
class Alphabet_AscenAndDescen {
    public static void main(String[] args) {

        // Task 8. English Alphabet Ascending and descending order

        for(char ch='A'; ch<='Z';ch++){
            System.out.print(ch+" ");
        }
        System.out.println();

        for (char ch='Z'; ch>='A'; ch--){
            System.out.print(ch+" ");
        }
        System.out.println();

        for(char ch='a'; ch<='z';ch++){ //Ascii Table order numbers of Lowercase Chars ==> a=97,  z=122
            System.out.print(ch+" ");
        }
        System.out.println();

        for (char ch='z'; ch>='a'; ch--){
            System.out.print(ch+" ");
        }
//System.out.println("===============================================================================================");
    }
}
class breakStatement_IntsAndChars{
    public static void main(String[] args) {

        // TASK 9   Break Statement with chars and ints

        for(int i=1; i<=5;i++){ // 1,2,3,4,5
//            if(i==3){ // if first condition is true ==> it will check condition and print the statement
//                break;
//            }
            System.out.println("Hello World");
            //break;
            if(i==3){// if first condition is true ==> and skip the loop based on the if statement
                break;
            }
        }

        for(char i='a'; i<='z'; i++){
            if(i=='e'){// execute a, b, d when we use if before the print statement
                break;//Ascii Table order numbers of Lowercase Chars ==> a=97,  z=122
            }
            System.out.println(i);
//            if(i=='e'){// execute a, b, d, e when we use print statement before the if statement
//                break;
//            }
        }
//System.out.println("===============================================================================================");
    }
}
class RemoveDuplicates_Chars{
    public static void main(String[] args) {

        //TASK 10  Remove Duplicate Chars

        String str= "ABAB";
        //index number:123

        String result="";

        for(int i=0; i<str.length();i++) { // 0,1,2,3
            if(result.contains(""+str.charAt(i))){
                continue; //if the result contains same chars then skip. If it does contain the same char
                // it will not concat it to the result
            }
            result+=str.charAt(i);
        }
        System.out.println(result);


         /*
         // Without continue statement

         for(int i=0; i<str.length();i++) {
          if( !result.contains( ""+str.charAt(i)) ) { // in this case we don't need to use continue statement
                      result += str.charAt(i);
            }
          }
           System.out.println(result);
          */

//System.out.println("===============================================================================================");
    }
}






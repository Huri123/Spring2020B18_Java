package day5_Unary_ShorthandOperators;

public class LeapYear {
   /* Warm Up tasks:
            1. create a class called LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
    Ex:
    year = 2020
    LearYear=True
    output:
            2020 is leap year: true
    */
   public static void main(String[] args) {
       short year =2025;
       // LeapYear=year%4==0;
       //if returns true==>leapYear,if it returns false==>not LeapYear

       boolean leapYear=year%4==0;//if the year can be divided by 4 without any reminder,then it is leapYear
       String result=year+" is leap year: "+leapYear;
       System.out.println(result);


   }
}

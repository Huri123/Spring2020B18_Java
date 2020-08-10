package Homework;

import java.util.Scanner;

/*
Instructions from your teacher:
One way to measure the amount of energy that is expended during exercise is to use metabolic equivalents (MET).
Here are some METS for various activities:
- Running 6 MPH: 10 METS
- Basketball: 8 METS
- Sleeping: 1 MET
METS are given per minute.

The number of calories burned per minute may be estimated using the following formula:
cal = 0.0175 * MET * Weight in kilograms

Write a program that asks user to enter his weight in pounds, and then calculates and outputs the total number of calories
 burned for a  person who runs 6 MPH for 30 minutes, plays basketball for 30 minutes, and then sleeps for 6 hours.
 One kilogram is equal to 2.2 pounds.
use (int)cal to round a double value.
Example:

output: Enter weight in pounds:
input: 150
output: Calories Burned: 1073
 */
public class _AssessmentTest14CalorieBurnedCalculator {
    public static void main(String[] args) {
        double weight = 0;
        double cal = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter weight in pounds:");
        weight=scan.nextDouble();
        double run=30*10;
        double basket=30*8;
        double sleep=360;
        double weight2=weight/2.2;
        double MET=run+basket+sleep;
        double burnedCal = 0.0175 * MET * weight2;
        System.out.println("Calories Burned: "+(int)burnedCal);

        /*
        Assessment test #2. 1- Print odd numbers

        Instructions from your teacher:
        Write a  for loop that prints the odd integers 11 through 121 inclusive, separated by spaces.
         */
        for (int i=11;i<=121;i++){
            if(i%2!=0){
                System.out.println(i+" ");
            }
        }
        }
    }

package Homework;

import java.util.Scanner;

/*
Write your code inside the method.
Use the values given as method parameters.
Assign final values.
Then user should select service quality that will correspond to tip percent.
Poor = 5%
Fair = 10%
Good = 15%
Great = 20%
Excellent = 25%
The program should display the following information based on the user input:
Split or No split
Number of people entered: &&&&
Service Quality:
Total to pay:
Total tip:
Total per person:
Tip per person:
https://itunes.apple.com/us/app/ihandy-tip-calculator/id324501526?mt=8

Input:
Split:Yes
Number of people:4
Check amount:476.0
Service Quality:Excellent

Output:

Number of people entered: &&&&
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75

 */
public class _051TipCalculator_StringMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Split:");
        String split = scan.next();

        System.out.println("Number of people:");
        int numPeople = scan.nextInt();

        System.out.println("Check amount:");
        double checkA = scan.nextDouble();

        System.out.println("Service Quality:");
        String quality = scan.next();

        boolean Poor = quality.equalsIgnoreCase("poor");
        boolean Fair = quality.equalsIgnoreCase("fair");
        boolean Good = quality.equalsIgnoreCase("good");
        boolean Great = quality.equalsIgnoreCase("great");
        boolean Excellent = quality.equalsIgnoreCase("excellent");
        double totalTip = 0;
        double totalToPay = 0;
        double totalPerPerson = 0;
        double tipPerPerson = 0;

        if (Poor) {
            totalTip = (checkA * 5) / 100;

        } else if (Fair) {
            totalTip = (checkA * 10) / 100;
        } else if (Good) {
            totalTip = (checkA * 15) / 100;
        } else if (Great) {
            totalTip = (checkA * 20) / 100;
        } else if (Excellent) {
            totalTip = (checkA * 25) / 100;
        }
        String num ="";

        if (numPeople == 2) {
            num ="&&";
        } else if (numPeople == 3) {
            num ="&&&";
        } else if (numPeople == 4) {
            num ="&&&&";
        } else if (numPeople == 5) {
            num ="&&&&&";
        } else {
            num ="";
        }


        if (split.equalsIgnoreCase("yes")) {
            totalToPay = checkA + totalTip / numPeople;

            totalToPay = checkA + totalTip;

            totalPerPerson = totalToPay / numPeople;
            tipPerPerson = totalTip / numPeople;
        }

        System.out.println("Number of people entered: " + num);
        System.out.println("Total to pay: " + totalToPay);
        System.out.println("Total tip: " + totalTip);
        System.out.println("Total per person: " + totalPerPerson);
        System.out.println("Tip per person: "+tipPerPerson);


    }
}

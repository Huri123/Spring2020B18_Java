package Homework;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        //ENTER CODE HERE


        Scanner input= new Scanner(System.in);
        System.out.println("Enter price in cents:");
        int itemPrice= input.nextInt();
        int change= 100-itemPrice;
        int quarters=change/25;
        int dimes= change%25/10;
        int nickels=(change%25)%10/5;
        String result=(itemPrice<25 || itemPrice>100 || itemPrice%5!=0) ? "Invalid price!" : "Your change is "+quarters+" quarters, "+
                dimes+" dimes, "+"and "+nickels+" nickels.";
        System.out.println(result);
    }
}


package Homework;

import java.util.Scanner;

/*
Instructions from your teacher:
Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
Ask for the first guest name.
Then ask does user want to enter one more guest.
 If yes - take input from.
If not - finish the program and print list of the guests.

Example of the program:

Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no

Guest's list: Nick, Linda
 */
public class _083Party_LoopScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter guest name:");
        String name=input.nextLine();
        String list=name+", ";

        System.out.println("Do you want to enter new guest name:");
        String yn=input.nextLine();

       while (yn.equalsIgnoreCase("yes")) {
           System.out.println("Please enter guest name:");
           name = input.nextLine();
           System.out.println("Do you want to enter new guest name:");
           yn = input.nextLine();
           list = list + name + ", ";

           while (yn.equalsIgnoreCase("no")) {
               list = list.substring(0, list.length() - 2);
break;
           }
       }
        System.out.println("Guest's list: " + list);
    }
       }



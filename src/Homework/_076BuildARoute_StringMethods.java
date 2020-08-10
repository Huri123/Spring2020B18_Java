package Homework;

import java.util.Scanner;

/*
Instructions from your teacher:
Write a program that will print out route instructions. Your program should take 2 parameters: start point and end point.
 Use left, right, up and down for navigation. Insert ">" between commands. If start point equals to end point - display:
 "start/end(start or end variable!) found".
Note: you may move only clock wise.

Example:
Input: A
Input: D
Output: right > down > left: D found

Input: C
Input: C
Output: C found
 */
public class _076BuildARoute_StringMethods {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();
        String result = "";
        if (start.equalsIgnoreCase("A")) {
            result += end.equalsIgnoreCase("B") ? "right: " :
                    end.equalsIgnoreCase("C") ? "right > down: " :
                            end.equalsIgnoreCase("D") ? "right > down > left: " :
                                    end.equalsIgnoreCase("A") ? "" : "";
        }else if (start.equalsIgnoreCase("B")) {
            result += end.equalsIgnoreCase("A") ? "down > left > up: " :
                    end.equalsIgnoreCase("C") ? "down: " :
                            end.equalsIgnoreCase("D") ? "down > left > up: " :
                                    end.equalsIgnoreCase("B") ? "" : "";
        }else if (start.equalsIgnoreCase("C")) {
            result += end.equalsIgnoreCase("B") ? "left > up > right: " :
                    end.equalsIgnoreCase("A") ? "left > up: " :
                            end.equalsIgnoreCase("D") ? "left: " :
                                    end.equalsIgnoreCase("C") ? "" : "";
        }else if (start.equalsIgnoreCase("D")) {
            result += end.equalsIgnoreCase("B") ? "up > right: " :
                    end.equalsIgnoreCase("C") ? "up > right > down: " :
                            end.equalsIgnoreCase("A") ? "up: " :
                                    end.equalsIgnoreCase("D") ? "" : "";
        }
        System.out.println(result+end+" found");
        }

    }



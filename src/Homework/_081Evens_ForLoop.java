package Homework;
/*
Instructions from your teacher:
Write a program that will print out even numbers from 2 to 100 through the comma.
 */
public class _081Evens_ForLoop {
    public static void main(String[] args) {
        for (int a = 1;a<=100;a++) {
            if (a % 2 == 0) {
                System.out.print(a + ", ");
            }
        }
    }
}

package Homework;

import java.util.Scanner;

/*
Instructions from your teacher:
calculate the sum of all the numbers up to the n variable.

for example:

n=3

sum = 1+2+3 = 6

n = 5
 sum = 1+2+3+4+5 = 15

hint: use a loop
 */
public class _loopCalculateSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        for (int a = 0; a <= n; a++) {
            sum += a;

        }
        System.out.println(sum);

        /*
        nstructions from your teacher:
calculate the multiplied sum of all the numbers up to the n variable.

for example:

n=2

sum = 1*2 = 2

n=3

sum = 1*2*3 = 6

n = 5
 sum = 1*2*3*4*5 = 120

hint: use a loop, and set sum and i (loop iterator) to one at the start
         */
        int n2 = s.nextInt();
        int sum2=0;

        for (int i = 1; i <= n; i++) {

            sum *=i;

        }
        System.out.println(sum);
    }
}

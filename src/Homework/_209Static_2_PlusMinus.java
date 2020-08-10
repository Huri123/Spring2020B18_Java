package Homework;

/*
Instructions from your teacher:
A static method can be called through its class name

in the calculator class, please create plus and minus methods. so that it enables the codes in main class to compile

plus: gets two ints and returns the addition of the to numbers as an int

calc.plus(1,1)
returns:2

calc.plus(10,1)
returns:11

minus:  the same as plus its also static, but it returns the substructed value of the two ints it gets

calc.minus(1,1)
returns:0

calc.plus(10,1)
returns:9
 */
public class _209Static_2_PlusMinus {
    public static void main(String[] args) {

        System.out.println("1+1 = " + plus(1, 1));
        System.out.println("1-1 = " + minus(1, 1));

    }

    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int c, int d) {
        return c - d;
    }
}

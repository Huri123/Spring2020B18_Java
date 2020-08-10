package day09_NestedIf_Ternary;

public class IfStatement_WitHoutCurlyBraces {
    public static void main(String[] args) {
        int number =100;

        if(number %2 ==0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");

        if(9 > 8) { // if the block containing more than one statement we MUST give the body
            System.out.println("Hello");
            System.out.println("Condition is true");
            System.out.println("Test executed");
        }


    }
}

package day03_VariablesContinue;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println(5 + 3);
        System.out.println(10-2);
        System.out.println(10 * 3);
        System.out.println(10 / 2);
        //System.out.println(30/0);
        // in math the nominator cannot be zero
        System.out.println(10 / 4);
        System.out.println(10 % 4);


        int result1 = 10 % 3;
        int result2 = 11 % 3;
        System.out.println(result1);
        System.out.println(result2);

        double d1 = 10 / 4;
        d1 = 2;
        //d1=2.0
        System.out.println(d1);//2.0

        double d2=10/4.0f;
        System.out.println(d2);//2.5
    }


}

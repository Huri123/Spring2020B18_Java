package day04_JavaRecap;

public class ArithmeticOperators {
    public static void main(String[] args) {
        //10/3=3.33333
        int a = 10 / 3; //3
        System.out.println(a);

        //10/4=2.5
        System.out.println(10 / 4); //2

        double d = 10 / 4;//2.0
        System.out.println(d);

        System.out.println(10.0 / 4);

        // 10 / 4 = 2.5; olmaliydi
        float f1 = 10 / 4;
        //  float f1 = 2;
        System.out.println(f1); // 2.0 oldu

        boolean evenNumber = 25 % 2 == 0;
        // 1==0==>false
        //if 25/2 has a remainder of zero, then it is even number
        System.out.println(evenNumber);
        System.out.println(25 % 2);
        //System.out.println(hour+":"+minute+":"+second+" "+amOrPm);

        boolean oddNumber = 22 % 2 != 0; //odd num
        //  0!=0==>false
        System.out.println(oddNumber);

        System.out.println(10 % 2 == 0); //10 is even number
        System.out.println(11 % 2 != 0); //11 is odd number

        System.out.println("10 is even number: " + (10 % 2 == 0));
        System.out.println("11 is even number: " + (11 % 2 == 0));
        System.out.println("25 is odd number: " + (25 % 2 != 0));
        System.out.println("25 is even number: " + !(25 % 2 != 0));
        System.out.println("25 is even number: " + (25 % 2 == 0));



    }
}

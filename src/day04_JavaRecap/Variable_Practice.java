package day04_JavaRecap;

public class Variable_Practice {
    public static void main(String[] args) {
        //DataType variableName=Data;
        byte num1=123;
        short num2 =num1;
        //byte num3= num2;
        int num4= num2; //int in prefered by compiler
        long num5=999999999999l;
        float num6 =100l;
        System.out.println(num6);//100.0

        float num7=0.5f;
        System.out.println(num7);//0.5

        double num8=0.5f;
        double num9=9999999L;
        double num10=100.5;

        System.out.println(num10);

        char ch1='$';
        System.out.println(ch1);

        char ch2=4500;//0~65565
        System.out.println(ch2);

        int a1='8';
        System.out.println(a1);

        int a2='z';
        System.out.println(a2);

        double d1='z'+'8';
        System.out.println(d1);

        char ch3=178;
        System.out.println(ch3);

        char ch4='z'+'8';
        System.out.println(ch4);

        boolean bool1=true;
        boolean bool2=false;

        System.out.println(9>10);//false
        System.out.println(9>=9);//true
        System.out.println(9!=10);//true
        System.out.println('a'=='b');//false
       // System.out.println('a'=="a");//'' does not match""

        System.out.println('a'=='b'-1);
                         // 97==98-1
                         //97==97==>true

        System.out.println("Huri"=="Good Guy");//false text ayni olmali

        System.out.println("Huri"!="Good Guy");//true
        System.out.println("Huri"=="huri");//false
        //System.out.println("Huri"==10000);




    }

}

package day40_Encapsulation;

public class NestedClass {

    //static int a;

    static class data{
        /*static {
            a=300;
        }
         */
        static int a=100;
        static int b=300;
    }

    public static void main(String[] args) {

        //NestedClass.data

        System.out.println(NestedClass.data.a);
    }
}

package day42_Inheritance;



class Test {//super class

    public Test(int a) {
        this(2.5); // C
        System.out.println("A"); // A
    }
    public Test(double a){
        System.out.println("C");
    }
}

public class Constructor2 extends Test{//parent constructor not default,it has argument so it gives error

    public Constructor2(){
        super(10); //C A // This is calling the constructor inside the super class
        System.out.println("B"); // B
    }

    public static void main(String[] args) {

        Test obj = new Test(10);  //C A

        //  Constructor2 obj2 = new Constructor2(); //C A B

    }


}
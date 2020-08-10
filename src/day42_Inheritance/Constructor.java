package day42_Inheritance;


class test {//super class

    public test() {//default constructor
        //  System.out.println("Super class's default constructor");
        System.out.println("A");
    }
}

public class Constructor extends test {

    public Constructor() {
        //we have here constructor call
        //System.out.println("Sub class's default constructor");
        System.out.println("B");
    }

    public static void main(String[] args) {
        // Constructor obj=new Constructor();//constructor is default
        //it first executes super class's constructor then sub class's constructor

        test obj = new test(); // A  // test is super class
        //sub class constructor has to call super class constructor
        Constructor obj2 = new Constructor(); //A B
    }


}

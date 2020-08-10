package day36_StaticBlock;

public class StaticBlock {


    public static void main(String[] args) {
        System.out.println("Main method executed");
        method1();

    }


    public static void method1(){
        System.out.println("Custom method executed");

    }

    static{
        System.out.println("static block executed");
    }
/*
What i put in my notes is that whenever we have a static variable, its better to use it inside of static { block, that way you can use it outside the class.

Madina Ruzimat(opens in new tab)  11 minutes ago
2. even tho java runs top to bottom, if we have a main method after we have static block, the static will execute first

Madina Ruzimat(opens in new tab)  10 minutes ago
3. To call the static variable, we need to call it through the class name.
 */


}

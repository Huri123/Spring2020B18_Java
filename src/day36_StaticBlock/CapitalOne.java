package day36_StaticBlock;

public class CapitalOne {

    public static void main(String[] args) {
        System.out.println(HumanResources.dev1);
        HumanResources.dev1.setInfo("Saia","Developer",130_000,19931);//burada dev1 i
        //reinitialize yaptik
        System.out.println( HumanResources.dev1 );


    }
}

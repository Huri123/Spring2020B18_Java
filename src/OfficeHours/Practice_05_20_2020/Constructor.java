package OfficeHours.Practice_05_20_2020;

import javax.swing.plaf.synth.SynthOptionPaneUI;

class Test{
    public Test(){
        System.out.println("A");
    }
    public Test(int a){
        System.out.println("B");
    }
}
public class Constructor extends Test{
    public Constructor(){
      //super(); // A C                  //default constructor of super class is called automatically
                                        //super() yazmasan da otomatik olarak default constructor i cagirir.
        super(10);
        System.out.println("C");}

    public static void main(String[] args) {
        Constructor obj=new Constructor();
    }
}

/*
class Test{
    public Test(){

    }
}
public class Constructor {
    public Constructor(){
      // super(10);//error because there is no extends bu yuzden this kullanmaliyiz
       this(10);
    }
    public Constructor(int a){

    }
}
 */


/*
Muhtar'in kodlari:
class Test{
    public Test(int a){
        System.out.println("A");
    }

}

public class Constructor extends Test {

    public Constructor(){
        super(10); // A
        System.out.println("B");

    }

    public static void main(String[] args) {
        Constructor obj = new Constructor();

    }


}
 */

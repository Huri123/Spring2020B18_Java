package OfficeHours.Practice_05_27_2020;

//calistirdiginda nerde object olusturdugunda orda bu kod calisir.
//Access modifiers' visibility: public > protected > default > private
//Access modifiers need to be same or more visible
//return type must be same
//only the instance(visible) method can be overridden

/*
Reem'in notlari:
OverRiding:
    * ONLY happens in SUB class (INHERITANCE relationship MUST exist)
    * SAME method name
    * SAME parameter
    * SAME return-type
    * DIFFERENT implementation
    * SAME, or more visible, access modifier :PUBLIC > PROTECTED > DEFAULT > PRIVATE
    * Instance method CAN always be overridden (except private ones)
    * STATIC methods can NOT be overridden
    * Constructor CAN NOT be overridden
    * ONLY INSTANCE METHODS (NOT WITH PRIVATE ACCESS MODIFIER) CAN BE OVERRIDDEN
 */

public class methodOverriding {
     void method1() { //default method
        System.out.println("Super class");
    }
    /*@Override // bunu method override mi degil mi check etmek icin yazdik
    public void method1(int a){//bu overriding degil method overloading.cunku overriding in baska class ta olmasi lazim
    }
     */
}

class Test extends methodOverriding {
    //sub               super

    @Override// bunu method override mi degil mi check etmek icin yazdik
    //ama yanda mavi yuvarlak icinde O yaziyor.O means override ve kirmizi ok zaten override oldugunu gosterir

    public void method1() { //public de olur protected da.cunku public > protected > default > private //Access modifiers need to be same or more visible
       //super class ta method return type void oldugu icin bu da void olmak zorunda
        System.out.println("Sub class");
    }

    public static void main(String[] args) {

        methodOverriding obj1 = new methodOverriding();
        obj1.method1();  //will print Super class. because we call super class's object.

        Test obj2 = new Test();
        obj2.method1();  //will print sub class. because we call sub class's object.

    }


}



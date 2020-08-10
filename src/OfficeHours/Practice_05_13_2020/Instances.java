package OfficeHours.Practice_05_13_2020;
/*
/*
instance method:
    Do not use static when creating method: public void methodName(){}
    can call ALL static variables and methods
    can call ALL instance variables and other methods
static method:
    must use STATIC word when creating method: public static void methodName(){}
    can call ONLY static variables and methods
    can NOT call instance variables or methods
    main method = static : can call statics - variables and methods
                            can NOT call instance variables and methods directly
                            must create objects to call instance variables/methods through objects
 */

public class Instances {
    String name; //instance variable

    {
        name="Zuura";  //instance block
        // instance black olursa diger classlarda da kullanabiliriz
    }


    public static void main(String[] args) {
        Instances obj =new Instances();
        obj.name="Zuura";
        System.out.println(obj.name);//burda initialize yaparsak sadece bu classta calisir
        //ama yukardaki gibi instance black olursa diger classlarda da kullanabiliriz
    }
    public void printName(){ //instance method
       int name=100;
        System.out.println("Name is :"+this.name); //name int olarak da kullanildigi icin this yazarak String name variable a atadigimizi kastettik
    }




}

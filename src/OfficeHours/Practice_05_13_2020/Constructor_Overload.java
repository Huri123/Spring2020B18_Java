package OfficeHours.Practice_05_13_2020;

public class Constructor_Overload {

    public Constructor_Overload(){
        System.out.println("default constructor");
    }

   /*
   public Constructor2(){//error constructor name must be same with classname
    }
    */

    public Constructor_Overload(int a){
        System.out.println("Constructor with int");
    }
    public Constructor_Overload(int a,double b){//either you should change datatype of parameter or add one more parameter
        System.out.println("Constructor with int and double");
    }

    public static void main(String[] args) {
        Constructor_Overload obj1=new Constructor_Overload(123,10.5);
        Constructor_Overload obj2=new Constructor_Overload(1232);
        Constructor_Overload obj3=new Constructor_Overload();
    }
}

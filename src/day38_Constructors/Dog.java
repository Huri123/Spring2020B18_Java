package day38_Constructors;

public class Dog {
    String name;
    String breed;
    int age;

    public Dog(){ //methodName (Dog) must be same with th className (Dog)
                //this method sets default value for all instances
      //constructor with no arguments//default constructor
       name="unknown";      //default olarak unknown yazdirdik.
                           // bunu yazdirmasaydik String oldugu icin default olarak "null" yazacakti
        breed="unknown";   //default olarak unknown yazdirdik.
                            // bunu yazdirmasaydik String oldugu icin default olarak "null" yazacakti
        age=0;              //default olarak unknown yazdirdik.
                            // bunu yazdirmasaydik String oldugu icin default olarak "0" yazacakti
    }
    public Dog(String breed){ //constructor with argument
        this.breed=breed;
        name="unknown";
        age=0;
    }
    public Dog(String breed,int age){ //constructor with argument
        this.breed=breed;
        this.age=age;
        name="unknown";//default olarak unknown yazdirdik.
        // bunu yazdirmasaydik String oldugu icin default olarak "null" yazacakti

    }
    public String toString(){
        return "Name: "+name+", breed: "+breed+", age: "+age;
    }
/*
    public void method1(){

    }
    public void method1(int a){

    }

 */



}

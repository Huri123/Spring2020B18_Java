package day37_Constructors;

public class Car {

    String brand;
    String model;
    int year;
    double price;

    public Car(String brand,String model,int year,double price){//they will be initialized to instance variables//constructor helps to initialize instance variables
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.price=price;
    }

    public String toString(){
        return year+" "+brand+" "+model+" $"+price;
    }


}

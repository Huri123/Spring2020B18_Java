package day39_AccessModifiers;

/*
1. create a class called Car:
				instance variable:
						brand, model, year, price
				add a constructor that can initialize brand of car
				add a constructor that can initialize brand and model of the car
								(apply constructor call to initalize the brand)
				add a constructor that can initialize the brand, model, year of the car
								(apply constructor call to initialize brand, model)
				add a constructor that can initialize brand, model, year and price of the car
								(apply constructor call to initialize brand, model, year)
				add toString method
 */
public class Car {
    String brand;
    String model;
    int year;
    double price;

    public Car(String brand) {
        this.brand = brand;//calling the instance
        //we assigned the argument
    }

    public Car(String brand, String model) {
        this(brand);//calling the first constructor. brand initialized because it calls the first contructor tha initialized the brand.
        // this.brand = brand;
        this.model = model;
    }

    public Car(String brand, String model, int year) {

        this(brand, model); //to initialize brand and model we called the previous constructor
        //this(brand, model);means this.brand = brand && this.model = model
        // this.brand = brand;
        //this.model = model;
        this.year = year;
    }

    public Car(String brand, String model, int year, double price) {
//this(brand, model, year); This is called "chain rule"
        this(brand, model, year); //this.brand = brand; && this.model = model; && this.year = year
        //this(brand, model,2018);//we can initialize year as 2018 in parenthesis. fakar user ne istyorsa onu yazsin istiyorsan sadece year yaz
        //this.brand = brand;
        //this.model = model;
        //this.year = year;
        this.price = price;
    }

/*
    public void method() {
        //this("Toyota"); //compiler error because only constructor can call the constructor.this is not constructor. this is method
    }
 */

    public String toString() {

        return "year: " + year + ", brand: " + brand + ", model: " + model + ", price: $" + price;
    }


}

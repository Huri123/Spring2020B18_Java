package day42_Inheritance.Task2;
/*
create a class called TV:
				attributes: brand, model, price, country, Type
				methods: watch, toString
 */
public class TV extends Device{
    /*
    brand (inherited)
    model (inherited)
    price (inherited)
    country (inherited)
    Type (inherited)
    size (inherited)

    setDevice()(inherited)
    watch
    toString (inherited)
     */
    public TV(String brand, String model, double price, String size){
        setDevice(brand, model, price, "TV", size);//Type was always set to TV when we did like that
    //this. yapmak yerine boyle yaptik
    }
    public void watch(){
        System.out.println("I am watching "+brand+" "+model+" "+type+" that cost me $"+price+" from "+country );
    }






}

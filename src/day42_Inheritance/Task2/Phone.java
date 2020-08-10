package day42_Inheritance.Task2;
/*
create ba class called phone:
				attributes: brand, model, price, country
				methods: call, text,  toString
 */
public class Phone extends Device{
    /*
    brand (inherited)
    model (inherited)
    price (inherited)
    country (inherited)
    Type="Phone" (inherited)
    size (inherited)

    setDevice()(inherited)

    call()
    text()
    toString(inherited)
     */
    public Phone(String brand, String model, double price, String size){
        setDevice(brand, model, price, "Phone", size);//Type was always set to TV when we did like that
                                                          //this. yapmak yerine boyle yaptik,paranteze de type
                                                         // yazmadik cunku type belli user in type girmesine
                                                        //gerek yok
    }
    public void call(long number){
        System.out.println("Calling the number: "+number);
    }
    public void text(long number){
        System.out.println("Texting to: "+number);
    }





}

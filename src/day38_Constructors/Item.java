package day38_Constructors;
/*
create a class called Item
			instance variables:
				name, unitPrice, quantity
			add a constructor that can initialize the fields
			instance methods:
				calcCost(): returns the total cost as double
							hint: quantity * unitPrice
				toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
 */
public class Item {

    String name;
    double unitPrice;
    int quantity;

    public Item(String name,double unitPrice,int quantity){//bu bir custom class burda sedece objectler bulunur main olmaz running icin

        this.name=name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost(){//bu bir instance method. static olamaz cunku variables instance.
                            // ustelik each object have their own copy,price quantity
        return quantity*unitPrice;
    }
     public String toString(){
         return "Item: "+name+", Unit price: $"+unitPrice+", Quantity: "+quantity+
                 "\nTotal Cost of Item: $"+calcCost();
     }





}

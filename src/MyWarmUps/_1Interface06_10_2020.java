package MyWarmUps;

/*
Task01:
    1. create an interface named Edible
            abstract method: eat();
    2. create an interface named Drinkable that can inherit from Edible
            abstract method: drink();
    3. create an class named Burger that can inherit from Edible
            variables: name, size
            method: toString();
            create a constructor that can initialize instance variables
    4. create another class called IceCoffee  that can inherit from Drinkable
                variable: size
                method: toString()
            create constructor that can set the size
    fix any error might come up
*/
 class Interface {
}

interface Edible {
    public abstract void eat();
}
interface Drinkible extends Edible{
    public abstract void drink();

}class Burger implements Edible{
   public void eat(){}
   String name;
   String size;

   public String toString(){
       return "Name: "+name+", Size: "+size;
   }
   public Burger(String name,String size){
       this.name=name;
       this.size=size;
   }

}
class IceCoffee implements Drinkible{
    public void drink(){ }
    public void eat(){}
    String size;
    public String toString(){
        return "Size: "+size;
    }
    public IceCoffee(String size){
        this.size=size;
    }
}



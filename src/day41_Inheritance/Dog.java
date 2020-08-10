package day41_Inheritance;

public class Dog extends Animal {//all variables and methods in the Animal class is inherited

    /*
public String name;
    public String size;
    public double weight;

    public void eat(){
        System.out.println(name+" is eating");
    }
    public void move(){
        System.out.println(name+" is moving");
    }
 */
    public void bark(){
        System.out.println(name+" is barking");
    }

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Lucy";

        System.out.println(dog1.name);

        dog1.move();//bu methodlarda zaten print statement var
        dog1.eat();//bu methodlarda zaten print statement var

        //dog1.swim();//error Animal classi extend inherit ettik onda da swim method yok
                        //swim method is only unique for Fish class
        dog1.bark();//this method only belongs to Dog class.cannot inherited by the other class



    }
}

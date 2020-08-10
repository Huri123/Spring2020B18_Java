package day41_Inheritance;

public class Fish extends Animal {

    public void swim(){//this is fish's own action
        System.out.println(name+" is swimming");
    }

    public static void main(String[] args) {

        Fish obj1 = new Fish();
        obj1.name = "Nemo";// assigning name: name is public instance variable from Animal parent class
        obj1.weight = 5;
        obj1.size = "Small";

        obj1.eat();
        obj1.move();
        obj1.swim();
        //obj1.bark();//error Animal classi extend inherit ettik onda da bark method yok


    }
}

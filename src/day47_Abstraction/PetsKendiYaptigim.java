package day47_Abstraction;

/*
Task01:
		1. create an abstract class called Pets
				attributes: name, age, color, breed, gender
				methods:
					abstract methods: sleep, eat, speak
					instance method: toString
		2. create three sub classes (non-abstract) of pet:
								1. Dog
								2. Cat
								3. Tiger
				each class MUST have constructors to initialize the attributes

 */
public abstract class PetsKendiYaptigim {

    String name;
    int age;
    String color;
    String breed;
    char gender;


    public abstract void sleep();

    public abstract void eat();

    public abstract void speak();

    public String toString(){
        return "Name: "+name+",age: "+age+", color: "+color+", breed: "+breed+", gender: "+gender;
    }

}

class Dog extends PetsKendiYaptigim {

    public void Dog(String name, int age, String color, String breed, char gender) {

        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.gender = gender;

    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping right now.");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating right now.");
    }

    @Override
    public void speak() {
        System.out.println(name + " is speaking!");
    }
}

class Cat extends PetsKendiYaptigim {

    public void Cat(String name, int age, String color, String breed, char gender) {

        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.gender = gender;

    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping right now.");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating right now.");
    }

    @Override
    public void speak() {
        System.out.println(name + " is speaking!");
    }

    class Tiger extends PetsKendiYaptigim {

        public void Tiger(String name, int age, String color, String breed, char gender) {

            this.name = name;
            this.age = age;
            this.color = color;
            this.breed = breed;
            this.gender = gender;

        }

        @Override
        public void sleep() {
            System.out.println(name + " is sleeping right now.");
        }

        @Override
        public void eat() {
            System.out.println(name + " is eating right now.");
        }

        @Override
        public void speak() {
            System.out.println(name + " is speaking!");
        }
    }
}
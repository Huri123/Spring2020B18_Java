package day50_polymorphism;
/*
  3. create subclass of Animal named Dog
            variable: dogName
            methods: bark
 */

//Between Animal and Dog class there is "is a relation".
//But there is no relation between Cat and Dog classes.
public final class Dog extends Animal { //final yapti cunku inherit edilmesini istemiyoruz
    // There are 3 variables,
    public String dogName;

    public Dog(String dogName, int age, String gender) {
        this.dogName = dogName;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public void eat() {
        System.out.println("Dog " + dogName + " is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog " + dogName + " is sleeping");
    }

    public void bark() {
        System.out.println("Dog " + dogName + " is barking");
    }

    public static void methodA(int a) {
        System.out.println("Dog Class A");
    }
}


/*
Muhtar'in kodlari:
/*
  3. create subclass of Animal named Dog
            variable: dogName
            methods: bark


public final class Dog extends Animal{ // 3 var, 3 methods
    public String dogName;

    public Dog(String dogName, int age, String gender){
        this.dogName=dogName;
        this.age=age;
        this.gender=gender;
    }

    public void eat(){
        System.out.println("Dog "+ dogName+ " is eating");
    }

    public void sleep(){
        System.out.println("Dog "+ dogName+ " is sleeping");
    }

    public void bark(){
        System.out.println("Dog "+ dogName+ " is barking");
    }


    public static void methodA(int a){
        System.out.println("Dog Class A");
    }
}

 */

package day50_polymorphism;
/*
2. create subclass of Animal named Cat
            variable: catName
            methods: scratch
 */

//Between Animal and Cat class there is "is a relation".
//But there is no relation between Cat and Dog classes.

public final class Cat extends Animal { //We do not have any abstract method in Animal method.So we do not have error
                                        //abstract method olsaydi override yapmak zorundaydik
                                        //We made it final.final means it cannot be overridden.
                                        //There are 3 variables,3 instance methods in Cat class right now.

    public String catName;

    public Cat(String catName, String gender, int age) {
        this.catName = catName;
        this.gender = gender;
        this.age = age;
    }

    //in order to override we need to give same or more more visible access modifier
    @Override
    public void eat() { //instance method
        System.out.println("Cat " + catName + " is eating");
    }

    @Override
    public void sleep() { //instance method
        System.out.println("Cat " + catName + " is sleeping");
    }

    public void sctrach() { //instance method //bunu static yapsaydik print yaparken instance variable (catName) kullanamazdik.
        System.out.println("Cat " + catName + " is scratching");
    }
}
/*
Muhtar'in kodlari:

//2. create subclass of Animal named Cat
//          variable: catName
//        methods: scratch

public final class Cat extends Animal{ // 3 var, 3 ins method
    public String catName;

    public Cat(String catName, String gender, int age){
        this.catName =catName;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public void eat(){
        System.out.println("Cat "+catName+" is eating");
    }

    @Override
    public void sleep(){
        System.out.println("Cat "+catName+" is sleeping");
    }

    public void scratch(){
        System.out.println("Cat "+catName+" is scratching");
    }

}
 */
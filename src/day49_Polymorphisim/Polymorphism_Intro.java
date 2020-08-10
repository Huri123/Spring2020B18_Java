package day49_Polymorphisim;
 /*
    Polymorphism:
        * means the ability of object to take many forms
        * it is when reference type is a parent class /interface and object type is child
        * ex1:
            class Dog extends Animal
            Dog dog1 = new Dog(); // new object created
            Applying polymorphism ==> I can give the super class name Animal to create the object from Dog
            Animal dog2 = new Dog();
        * ex2:
            ChromeDriver is a class that inherited from interface WebDriver
            WebDriver is parent interface of ChromeDriver ==>
            when we create an object from ChromeDriver we can use the super type interface name as the reference
            WebDriver driver = new ChromeDriver();
        * ex3:
            class Cat extends Animal
            class Bird extends Animal
            class Dog extends Animal
            Dog dog1 = new Dog();
            Cat cat1 = new Cat();
            Bird bird1 = new Bird();
            Now if I want to create an array and store all these different objects in that array, what can I have as reference type?
            I can't have my reference type as Dog, or Cat or Bird
            ==> But because of polymorphism I can make reference type Animal and create Animal[] array to contain them all
             POLYMORPHISM   :   SUPER CLASS CAN BE REFERENCE TYPE OF SUB CLASSES' OBJECTS (SUB CLASS CAN NOT BE ABSTRACT
                                IF SUPER CLASS IS ABSTRACT IT WILL NOT BE ABLE TO CREATE ITS OWN OBJECTS
                                BUT IT CAN STILL BE REFERENCE TYPE FOR ITS SUB (NON-ABSTRACT) CLASSES' OBJECTS
                                SUPER TYPE INTERFACE CAN BE REFERENCE TYPE FOR SUB CLASSES OBJECTS
                                ABSTRACT CLASS AND INTERFACE:
                                                ARE MEANT TO BE REFERENCE TYPE
                                                CAN NEVER BE IN OBJECT TYPE (CAN NOT CREATE THEIR OWN OBJECT)
                                SUB CLASS CAN NEVER BE REFERENCE TYPE OF SUPER CLASS OBJECTS
             Animal  dog1 = new Dog();       // super class can be reference type to the sub class object
             Animal cat1 = new Cat();        // super class can be reference type to the sub class object
             Animal bird1 = new Bird();      // super class can be reference type to the sub class object
             Animal[] arr = { }
        Benefit of POLYMORPHISM:
     */

//interface Animal{}
class Animal extends Robot{

}

//class Dog implements Animal{}
class Dog extends Animal{

}

//class Cat implements Animal{}
class Cat extends Animal{

}

class Robot{

}
public class Polymorphism_Intro {
    public static void main(String[] args) {

        // Animal obj = new Animal(); //once Animal class interface di o yuzden object olusturamadik.sonra abstract classa cevirdi
        Animal obj2 = new Dog();
        Animal obj3 = new Cat();
        // Dog obj4=new Cat(); //error cunku there is no relationship
        Dog obj5 = new Dog();
        Cat obj6 = new Cat();

        Robot obj7 = new Robot();

        //String[] animalShow={obj2,obj3,obj5,obj6}; ///only store Strings not objects
        Animal[] animalShow ={ obj5, obj6};


        Robot obj8 = new Animal();
        Robot obj9 = new Dog();
        Robot obj10 = new Cat();

    }
}
/*
Muhtar'in kodlari:
class Animal extends Robot{

}

class Dog extends Animal{

}

class Cat extends Animal{

}

class Robot{

}

public class Polymorphism_Intro {

    public static void main(String[] args) {

        // Animal obj = new Animal();
        Animal obj2 = new Dog();
        Animal obj3 = new Cat();

        // Dog obj4 = new Cat();
        Dog obj5 = new Dog();
        Cat obj6 = new Cat();

        Robot obj7 = new Robot();

        Animal[] animalShow ={ obj5, obj6};


        Robot obj8 = new Animal();
        Robot obj9 = new Dog();
        Robot obj10 = new Cat();

    }

}

 */

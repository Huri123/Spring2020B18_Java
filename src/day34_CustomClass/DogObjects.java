package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog(); //object
        // System.out.println(dog1.breed); null verir cunku daha assign yapmadik.

        dog1.setDogInfo("Husky", "Small", 4, "White", "Ghost");

       /* dog1.breed = "Husky"; bu uzun yol
        dog1.size="Small";
        dog1.color="White";
        dog1.name="Ghost";
        dog1.age=4;
        */

       /* System.out.println(dog1.breed);
        System.out.println(dog1.size);
        System.out.println(dog1.color);
        System.out.println(dog1.name);
        System.out.println(dog1.age);
        */
        Dog dog2 = new Dog();
        dog2.setDogInfo("Alabay", "Extra big", 5, "Brown", "Ajdar");

        Dog dog3 = new Dog();
        dog3.setDogInfo("Poodle", "Miniature", 2, "White", "Lucy");

        System.out.println(dog1);// yazarsak Dog classinda toString method yoksa hashcode(error) verir.Dog class a toString method yazmaliyiz
        System.out.println(dog2);
        System.out.println(dog3);

        System.out.println("==============================================================");
        Dog dog4 = new Dog();
        dog4.setDogInfo("Pomeranian", "Small", 3, "White", "Lil");

        Dog dog5 = new Dog();
        dog5.setDogInfo("pomeranian", "Small", 4, "White", "Ernie");

        //in order to store all dog objects, we are gonna create arraylist
        ArrayList<Dog> puppies = new ArrayList<>();
        puppies.addAll(Arrays.asList(dog1, dog2, dog3)); //Arrays.asList yazdik cunku bulk operations sadece collection type kabul eder.
        puppies.addAll(Arrays.asList(dog4, dog5));

        for (int i = 0; i < puppies.size(); i++) { //it will iterate every single element in the pupies arraylist
            Dog eachdog = puppies.get(i); //to retrieve we used get. Zaten Dog getirecegi icin onu Dog a assign yaptik.
            System.out.println(eachdog);
        }
        System.out.println("==============================================================");
        puppies.removeIf(p -> p.age > 2);

        for (int i = 0; i < puppies.size(); i++) {
            Dog eachdog = puppies.get(i);
            System.out.println(eachdog);
        }
    }
}

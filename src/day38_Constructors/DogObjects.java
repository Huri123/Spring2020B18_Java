package day38_Constructors;

public class DogObjects {
    public static void main(String[] args) {

        Dog dog1=new Dog(); //burda parameter kullanmadigimiz icin default constructor with no arguments i calistirdi

        System.out.println(dog1.name);
        System.out.println(dog1.breed);
        System.out.println(dog1.age);

        Dog dog2=new Dog("Husky");//execution depends on creation of object. burda parameter kullandigimiz icin o constructor with one parameter i calistirdi
        System.out.println(dog2.name);
        System.out.println(dog2.breed);
        System.out.println(dog2.age);

        Dog dog3=new Dog("Poodle",4);//execution depends on creation of object. burda 2 parameters kullandigimiz icin o constructor with two parameters i calistirdi
        System.out.println(dog3.name);
        System.out.println(dog3.breed);
        System.out.println(dog3.age);

        System.out.println("=================================================================");

        System.out.println(dog3);    //bunu yazdirmak icin custom class ta toSting method a ihtiyac var
                                    //yoksa hashcode verir
        System.out.println(dog2);
        System.out.println(dog1);

        System.out.println("=================================================================");

       // Dog dog4=new Dog(5,"Husky"); //error verir cunku boyle bir once age sonra breed isteyen
                                      //bir constructor yok


    }
}

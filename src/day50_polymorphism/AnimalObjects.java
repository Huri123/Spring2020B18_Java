package day50_polymorphism;

/*
Hi @Saim, ex:Animal dog1 = Animal(); Which class does this dog1 object belong to?Animal or Dog?

Saim  4 days ago
The object is an Animal object here. In this example the reference is also Animal

Saim  4 days ago
the name ‘dog1’ is just a reference name
 */
public class AnimalObjects {
    public static void main(String[] args) {

        Dog obj1 = new Dog("Lucy", 5, "Female");
        System.out.println(obj1.dogName);
        obj1.bark();//bu only unique in the Dog class

        Animal obj2 = new Dog("Kito", 6, "Female");//Animal is here referance type.
        //reference type:Animal     object type:Dog class object

        //System.out.println(obj2.dogName); //Reference type(here Animal) decides what is accessible
                                            //reference type Animal oldugu icin dogName i cagiramiyoruz.
                                            // Cunku Animal class ta sadece age ve gender varibles lari var.

        //obj2.bark();          //Reference type Animal oldugu icin hata verdi. Animal da bark method yok.Refernce type Dog olsaydi hata vermezdi

        obj2.eat();             //eger bu method overriden ise o overridden olan gets executed.
                                //burda eat method 2 tane var. 1 i Animal classta digeri Dog(dog objecti olusturdugu icin) class'ta.
                                //digeri Dog in extend ettigi Animal class'ta. Dog class ta eat override edildigi icin onu calistiracakti.
                                //eger dog class ta override yapilmasaydi Animal class taki eat methodu cagiracakti.

        obj2.methodA();     //Animal class ta static di. o yuzden override yapilmadi. o yuzden Animal class taki methodA calisti
                            //Dog class ta overload yapildi ama onemli olan override edilmesi.override edilmedigi icin reference type
                            // yani parent class(Animal) taki method calisir.

        Animal animal1 = new Cat("A", "F", 1);

        boolean isCat = animal1 instanceof Cat;
        System.out.println(isCat);

        boolean isDog = animal1 instanceof Dog;//false cunku Animal is reference of Cat for animal1.
        System.out.println(isDog);

        Dog d1 = new Dog("A", 1, "F");
        //boolean r1=d1 instanceof Cat; //there is no IS A relation between

        Animal animal2 = new Cat("Q", "f", 2);

        boolean r2 = animal2 instanceof Animal;
        System.out.println(r2); //true, Because animal2 IS A animal. is a relation var.

        boolean r3 = animal2 instanceof Dog; //false, There is no "IS A RELATION" between Cat and Dog classes.
        System.out.println(r3);
    }
}

/*
Muhtarin kodlari:
public class AnimalObjects {

    public static void main(String[] args) {
        Dog obj1= new Dog("Lucy", 5, "Female");
        System.out.println(obj1.dogName);
        obj1.bark();


        Animal obj2= new Dog("Kito", 6, "Female");
        //System.out.println( obj2.dogName);
        //obj2.bark();

        obj2.eat();
        obj2.methodA();

        Animal animal1 = new Cat("A","F", 1);

        boolean isCat = animal1 instanceof Cat;
        System.out.println(isCat);

       Dog d1 = new Dog("A",1,"f");

      // boolean r1 = d1 instanceof Cat; // there is no IS A relation between dog and cat

        Animal animal2 = new Cat("Q","f",2);

        boolean r2 = animal2 instanceof Dog;

        System.out.println(r2);

    }

}
 */

package day50_polymorphism;

public class ReferenceTypeCasting {
    public static void main(String[] args) {
        int a = 100;
        double b = (double)a; //implicitely done //(double) gray renkte yani; this is not required.
        //double b=a;

        Dog dog=new Dog("a",1,"f"); //Dog class in superior u Animal class.
        Animal animal1 = (Animal)dog;//upcasting, done implicitly
        //Animal animal1=dog; //upcasting, done implicitly

        Cat cat=new Cat("r","female",4);
        //Dog dog2=(Dog)cat; //error cunku there is no IS A relation between Dog and Cat classes..
        Animal animal2 =cat; //upcasting. is done implicitly

        System.out.println("============================================");

        double c=10;
        int d=(int)c; //explicitly done

        Animal animal3 = new Dog("A",12,"F");

        //Dog dog3=animal3; //error because reference type is Animal which is superior of Dog class.You cannot assign it directly.

        Dog dog3=(Dog)animal3;  //downcasting, MUST be done done manually
                                //not error through downcasting

        Animal animal4 = new Cat("C","female",7);

        //Cat cat2=animal4;  //error cunku Animal is superior.

        //Cat cat2=(Dog)animal4; //(Dog)animal4 olur ama cat2 ye assign yaparken error verir cunku Cat ile Dog arasinda IS A relation yok.

        Cat cat2 = (Cat)animal4;  //downcasting

        System.out.println("=============================================");

        //Dog animal5 = new Dog("Lucy",3,"");
        //animal5.bark(); //boyle olunca error yok

        Animal animal5 = new Dog("Lucy", 3, "Female");
        //animal5.bark(); //error cunku Animal class ta bark yok.Reference type decides what is accessible

        //first way:
        Dog dog2 = (Dog)animal5;
        dog2.bark();

        //second way: //bu daha kullanisli
        ((Dog) animal5).bark();
        //(Dog) animal5.bark(); //boyle hata verir. sadece animal5 ten call yapiyor burda.onun da reference type i Animal.completely casting olmasi yani hepsini kapsamasi lazim //extra paranthesis koymak lazim

       
    }
}
 /*
 Muhtar'in kodlari:
 public class ReferenceTypeCasting {

    public static void main(String[] args) {
        int a = 100;
        double b = (double)a;  // implicitly done

        Dog dog = new Dog("a", 1, "f");
        Animal animal1 = (Animal)dog; // upcasting, done implicitly

        Cat cat = new Cat("r", "female", 4);
       // Dog dog2 = (Dog)cat;
        Animal animal2 = cat; // upcasting, done implicitly

        System.out.println("===========================================");
        double c = 10;
        int d = (int)c; // explicitly done

        Animal animal3 = new Dog("A", 12, "F");

        Dog dog3 =  (Dog)animal3;  // down casting , MUST be done manually

        Animal animal4 = new Cat("C", "female", 7);

        Cat cat2 = (Cat)animal4;

        System.out.println("===============================================");
        Animal animal5 = new Dog("Lucy", 3, "Female");
      //  animal5.bark();

       Dog dog2 =  (Dog)animal5;
       dog2.bark();

       // second way:
        ( (Dog)animal5 ).bark();


    }

}
  */
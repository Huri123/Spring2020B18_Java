package day43_MethodOverriding;

class Test{


    public  void method(){  //void metheod(){ default method//private can never be overriden
        System.out.println("Onur");
    }

}


public class MethodOverriding extends Test {  // sub class //overriding same method name,same parameter

    @Override//bunun altinda kirmizi cizgi yoksa override yapilabilir demek. boyle check edebilirsin
    public void method(){ //overriding sub classta super class taki ayni isimde ayni parametreli,ayni return type method olacak fakat different fuction yapacak
        System.out.println("Zarina");
    }


    public static void main(String[] args) {
        Test obj1 = new Test();
        obj1.method();  // Onur

        MethodOverriding obj2 = new MethodOverriding();
        obj2.method(); // Zarina ///Zaina methodu olmasaydi bu da Onur yazdiracakti

    }

}
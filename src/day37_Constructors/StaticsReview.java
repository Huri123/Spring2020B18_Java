package day37_Constructors;
/*
Static methods can not access instance methods and instance variables directly
Instance methods can access instance methods and instance variables directly
In static methods we can not use the “this” keyword
Instance methods can also access static methods and static variables directly
 */
class dog{

    String name;//only belongs to dog class
    int age;    //only belongs to dog class

    public void setInfo(String name,int age){
        name=name;
        age=age;

    }
}

class Test{
    public static void main(String[] args) {
       // Test obj=new Test();
       // System.out.println(obj.name);//variable bu class a ait olmadigi icin error verdi
        //System.out.println(obj.age);

        dog obj=new dog();//dog class adiyla cagirirsan compile eder
        System.out.println(obj.name);
        System.out.println(obj.age);

        dog obj2=new dog();
        obj2.setInfo("Lucy",4);
        System.out.println(obj2.name); //setInfo ya this yazmazsak biresey assign yapmadigi icin default(String icin "null", int icin=0 value verir
        System.out.println(obj2.age);

    }
}

public class StaticsReview {
    static int a; //1 copy bunu hem obj1 hem de obj2 kullanacak 1 copy var
    int b; //2, each object has its own copy of instance variable

    static String name="John";
    String id="123";

    public static void main(String[] args) {
        StaticsReview obj1 = new StaticsReview();
        obj1.a = 20;
        obj1.b = 10;
        StaticsReview obj2 = new StaticsReview();
        obj2.a = 30;
        obj2.b = 40;
        System.out.println(obj1.a);//30
        System.out.println(obj2.a);//30
        System.out.println(obj1.b);//10
        System.out.println(obj2.a);//30

        System.out.println("===================================");

        System.out.println(name);
       // System.out.println(id); //static olmadigi icin direct cagiramayiz. compile error verir. static only accepts static
    }
}

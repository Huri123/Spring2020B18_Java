package day38_Constructors;

public class ConstructorCalls2 {
    public ConstructorCalls2(){
        System.out.println("Default constructor");
    }
    public ConstructorCalls2(int a){
this();//calling default constructor
        System.out.println("Constructor with arguments");
    }
    public ConstructorCalls2(String str){
       // System.out.println("Hello"); //bunu this()den once yazarsan this()hata verir. this() en basta olmali //this();body nin en basinda yazilmali yoksa compiler error verir
        this(10);//bu hem default i hem de string argument li constructor i cagirir
        //this();//error verir cunku 1 constructor can only calls 1 constructor
        System.out.println("Constructor with String argument");//sonra da bu yazilir.
    }

    public static void main(String[] args) {
       // ConstructorCalls2 obj=new ConstructorCalls2(); boyle yaparsan sadece default constructor i cagirir this() onu cagiriyor.
       // ConstructorCalls2 obj=new ConstructorCalls2(10);//bouyle yaparsan iki constructor i da calistirir.
                                                          //cunku this() once default constructor i cagirir
        ConstructorCalls2 obj=new ConstructorCalls2("Hello"); // boyle yaparsan hem default hem int hem string calisacak
    }

    public void method1(){
       // ConstructorCalls2(); //this() olmadigi icin hata verir. cannot be called by its name
    }
}

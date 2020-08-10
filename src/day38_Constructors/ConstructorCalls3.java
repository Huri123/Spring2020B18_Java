package day38_Constructors;

public class ConstructorCalls3 {
    public ConstructorCalls3(){
        this(9);
        System.out.println("default");
        //this(9); error cunku basa yazilmali
    }

    public ConstructorCalls3(int a){
       // this(10);//compiler error//cunku constructor cannot call itself
       // this(); //compiler error cunku default constructor already contains bu contructor.contructor kendini cagiramaz bu yuzden.
        System.out.println("int argument");
    }

    public ConstructorCalls3(String str){
        //this("Hello"); //error cunku constructor cannot call itself
    }

    public static void main(String[] args) {
        new ConstructorCalls3();
    }
   public void method(){
       // this(); //error cunku another constructor da cagirmaliydik. burasi bir method
   }






}

package day38_Constructors;

public class ConstructorPractice {

    public ConstructorPractice(){//C A
        this(10.0);//C
        System.out.println("A");
        //this(0.5)// error basta olmali
    }

    public ConstructorPractice(int a){//C A B
        this();//C A
       // this(10.5);//error 2 tane birden call yapamaz
        System.out.println("B");
    }
    public ConstructorPractice(double a){
        //this();//error cunku default constructor already contains bu constructor with double
        //this(5.5);//error cunku constructor cannot call itself and cannot contain itself

      // this(10);//compiler error cunku int li constructor default constructor i cagiriyor. default da zaten constructor with double i iceriyor

        System.out.println("C");

    }

    public static void main(String[] args) {
        new ConstructorPractice(10);//we created object //Bu print de yapiyor cunku zaten constructorlarin icinde sout print var,olmasaydi yapmazdi burda sout yazmaliydik
    }



}

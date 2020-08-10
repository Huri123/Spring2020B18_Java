package day42_Inheritance;

class B{
    public B(int a){
        System.out.println("int");
    }
    public B(double a){
        System.out.println("double");
    }
    public B(long a){
        //this(4.5); //double //1 constructor cannot call more than 1 constructor
        this(10);
        System.out.println("long");//long
        //this(4.5);//must be in the first line
    }
}

public class InheritanceReview extends B{//Hata veriyor cunku B classi constructorlardan olusuyor
//we have only 1 constructor in the class of InheritanceReview

    public InheritanceReview(String a){
        super(19l); //int long
        System.out.println("String"); //String
    }

    public static void main(String[] args) {
        InheritanceReview obj=new InheritanceReview("Hello");
    }


}


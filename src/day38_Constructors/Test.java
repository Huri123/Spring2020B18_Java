package day38_Constructors;
//where you created method does not matter
// System.err.println("Hello"); // this means error message

public class Test {

    public Test(){// runs after the instance block
        System.out.println("Constructor");
    }

    {//instance block depends on the object. it runs before the constructor
        System.out.println("Instance block");
    }

    public static void main(String[] args) {
       // System.out.println("Main method ");//bunu buraya yazarsak once bunu sonra instance ve constructori yazar
        new Test();// first print instance then constructor
       // new Test();// first print instance then constructor
        System.out.println("Main method ");//bunu buraya yazarsak once instance ve constructori sonra bu sout u yazar

    }

    static{//main bos olsa bile bu static block print yapar
        System.out.println("Static block");
    }



}

package day37_Constructors;

public class Question12 {
    static String name="Aaron";

    public static void main(String[] args) {
        System.out.println("Daniel");

    }
    public static void print(String str){
        System.out.println(str);
    }
    static {//executed first
        print(name);//Aaron print()methodunu cagirdik.str yerine name yazdik
    }
}

class Test1{
   int Inum=10;//2 copy, each object has its own copy.
    static int Inum2=30;

    public static void main(String[] args) {
        Test1 obj1=new Test1();
        obj1.Inum=20;
        obj1.Inum2=40;

        Test1 obj2=new Test1();

        System.out.println(obj2.Inum);//obj2 ya birsey atamadigimiz icin default value verecek.yukarda Inum a default value olarak 10 vermistik o yuzden default olarak 10 verdi
        System.out.println(obj2.Inum2);//static oldugu icin bunu atamasak da obj1 in value sunu alacak yani 40.
    }
}

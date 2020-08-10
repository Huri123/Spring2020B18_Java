package day46_final_abstract;

public class final_Variables {

    //int InstanceVariable=300;  //instance variable
    final int InstanceVariable=300;  //suan constant oldu
    //final int InstanceVariable2; error cunku final instance variables needs to be initialized immediately

    final static int staticVariables=1000;

    //final static int getStaticVariables2;  //final static variables needs to be initialized immediately


    public static void main(String[] args) {

        final double PI=3.14;  //final the variable will no longer be assigned once final keyword is given
       // PI=3.15;            //compile error

        final String gender="Male";
        //gender="Female";  //compile error

        final int score; //bu local variable .hemen initialize yapmadik. altta yaptik
        //System.out.println(score);  //initialize yapmazsak compile error verir.
                                      //final specifier i kullanmadan print yapmadan once initialize etmemiz gerekir

        score=100;
        //score=200; //final reassign yapilamaz
        System.out.println(score);
        System.out.println("========================================");

        //this.InstanceVariable=400;  //direk cagiramayiz.this. de kullanamayiz. instance block ve instance mettod ta this kullanilir. O yuzden object olusturmamiz lazim

        final_Variables obj=new final_Variables();
       //obj.InstanceVariable; //we can call the instance variable of the final_Variables class. But we cannot reassign it
       // obj.InstanceVariable=400; //it is giving compile error.We cannot reassign it because it was declared as final.
                                    //any variable that is declared as final we can never reassign it.
        //staticVariables=2000;
    }
}
/*
Muhtar'in kodlari:
public class final_Variables {

    final int InstanceVariable = 300;
    //   final  int InstanceVariable2 ;  // final instance variables need to be initialized immedietly

    final static int staticVariables = 1000;

  //  final static int getStaticVariables2; // final static variables need to be initialized immedietly

    public static void main(String[] args) {
         final double PI = 3.14;
      //   PI = 3.15;

        final String gender ="Male";
         //   gender = "Female";

       final int score;
        score = 100;
      // score = 200;
        System.out.println(score);

        System.out.println("==============================");
       // this.InstanceVariable = 400;
        final_Variables obj = new final_Variables();
       // obj.InstanceVariable = 400;

       // staticVariables = 2000;

    }

}
 */





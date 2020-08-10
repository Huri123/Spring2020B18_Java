package day52_Collection;

import java.util.ArrayList;

public class null_Keyword {

    static String str; //default "null"

    //static String str = "Cybertek"; //Boyle baslatirsak NullPointerException vermez
    //static String str = new String ("Cybertek");  //Boyle baslatirsak NullPointerException vermez
    public static void main(String[] args) {
        //System.out.println(str.charAt(0)); //charAt method is instance method

        //ArrayList<String>list1 = new ArrayList<>();
        //System.out.println(list1.get(1));


        String str2 = null;
        Integer i1 = null;
        //int num = null;  // we cannot assign null to the primitives

        ArrayList<String>list1 = new ArrayList<>();
        list1.add(null); //this means there is no objects. yani boyle yapinca object olusmadi.

        System.out.println(list1);

        System.out.println("========================================");

        /*
        String number = null;
        int num = Integer.parseInt(number);
        System.out.println(num);  //exception verir
         */

        String number = "123";
        int num1 = Integer.parseInt(number);
        System.out.println(num1);

        System.out.println("==========================================");

        String[] arr = {null,"Cybertek","ABC"};
        arr[2].toUpperCase();

        String name1 = "cybertek".toUpperCase();
        name1 = null;
        //name1 = name1.toLowerCase(); //gives exception

        System.out.println(name1);
    }
}

/*
Muhtar'in kodlari:
import java.util.ArrayList;

public class null_Keyword {

    static String str =new String("Cybertek");
    // == null
    //static ArrayList<Integer> list1 ;

    public static void main(String[] args) {

        System.out.println( str.charAt(0) );
     //   System.out.println(list1.get(1));

        // WebElement element = null;
        String str2 = null;
        Integer i1 = null;
      //  int num = null;

        ArrayList<String> list1 = new ArrayList<>();
        list1.add(null);

        System.out.println(list1);
        System.out.println("==============================");
        String number = "123";

        int num1 = Integer.parseInt(number);

        System.out.println(num1);

        System.out.println("===============================");
        String[] arr = {null, "Cybertek", "ABC"};
        arr[2].toUpperCase();

        String name1 = "cybertek".toUpperCase();
                name1 = null;
               // name1 =  name1.toLowerCase();

        System.out.println(name1);


    }

}
 */

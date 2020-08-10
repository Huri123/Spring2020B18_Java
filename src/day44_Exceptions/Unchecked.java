package day44_Exceptions;

public class Unchecked {

    public static void main(String[] args) {
        System.out.println("Test completed");//alttaki kodlarda unchecked exception olsa bile burayi calistirir.
                                             //ama O unchecked exception dan sonraki kodlari calistirmaz.
                                            // Ama checked exception da hic birini calistirmaz
        //System.out.println(9/0);    //ArithmeticException
                                    //exception verdigi icin burda durur. kalan kodlari calistirmaz
        // System.out.println("Test completed");//bir ustte exception verdigi icin burayi calistirmaz

        String str = "Cybertek";
        //System.out.println(str.charAt(-1)); //StringIndexOutOfBoundsException
                                            //index numbers only start with zero not negatif number.

        int[] arr={1,2,3};
        //System.out.println(arr[200]); //ArrayIndexOutOfBoundsException



        System.out.println("Test completed");


    }


}

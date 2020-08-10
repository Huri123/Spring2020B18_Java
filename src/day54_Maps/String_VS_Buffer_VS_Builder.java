package day54_Maps;

public class String_VS_Buffer_VS_Builder {

    public static void main(String[] args) {

        String str1 = "Cybertek";
               str1.concat(" School");  //"Cybertek School"

        System.out.println(str1);  //sadece Cybertek yazar. cunku String cannot be modified

        System.out.println("====================================================");

        //StringBuilder builder = "Cybertek";  // boyle yapilmaz. new keyword kullanman lazim

        StringBuilder builder = new StringBuilder("Cybertek"); //StringBuilder is mutable(changeable) version of char sequences
                      builder.append(" School");

        System.out.println(builder);  //"Cybertek School" yazar. Because StringBuilder can be modified(mutable)

        System.out.println("===================================================");

        StringBuffer buffer = new StringBuffer("Cybertek");  //StringBuffer is mutable(changeable) version of char sequences
                     buffer.append(" School");

        System.out.println(buffer);  //"Cybertek School" yazar. Because StringBuffer can be modified(mutable)

        System.out.println("===================================================");

        String word = "ABCD";

        StringBuilder sb = new StringBuilder("ABCD");
                    sb.reverse();

        System.out.println(sb);

        word = sb.toString();

        System.out.println(word);
    }

}
/*
Muhtar'in KODLARI:

public class String_VS_Buffer_VS_Builder {

    public static void main(String[] args) {

        String str1 = "Cybertek";
             str1.concat(" School");  // "Cybertek School"

        System.out.println(str1);   // Cybertek

        System.out.println("===============================================");

        StringBuilder builder = new StringBuilder("Cybertek");
                builder.append(" School");

        System.out.println(builder);

        System.out.println("================================================");
        StringBuffer buffer = new StringBuffer("Cybertek");
            buffer.append(" School");

        System.out.println(buffer);

        System.out.println("============================================");

        String word = "ABCD";


        StringBuilder sb = new StringBuilder(word);
                sb.reverse();

        System.out.println(sb);

        word = sb.toString();

        System.out.println(word);






    }


}
*/

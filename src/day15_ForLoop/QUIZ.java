package day15_ForLoop;

public class QUIZ {

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "abc";

        System.out.println("s1 == s2 is: " +  s1 == s2 );
        //  "s1 == s2 is abc" == "abc"  ==> false

        System.out.println("s1 == s2 is: " +  (s1 == s2) );


        String ta = "A";
        ta = ta.concat("B"); // ta = "AB"

        String tb = "C";

        ta = ta + tb;  // ta ="AB" +C = "ABC"

        ta.replace('C', 'D'); // "ABD" reassing yapmadigimiz icin ta=hala ABC.
        //EGER ta=ta.replace('C', 'D'); yapsaydik, o zaman ta=ABD olurdu. yani burdaki ta.replace
        //reassign yapmadigimiz icin hic bir etkisi olmadi.

        ta = ta+tb;  //ABC + C = "ABCC

        System.out.println(ta);



    }
}

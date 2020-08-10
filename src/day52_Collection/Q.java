package day52_Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class Q {

    public static void main(String[] args) {

        Queue<String> q = new PriorityQueue<>();
        q.add("A");
        q.add("C");
        q.add("B");
        q.add("D");

        System.out.println(q);

        String str = q.poll(); //.poll(); returns the first object(String) and removes it from the list(q)
        System.out.println(str);

        System.out.println(q);

        //System.out.println(q.get(0));  //We use get method to retrieve data but "Queue" does not have index number.So it gives compile error
                                        //Since it does not have index number,we cannot use get method





    }


}

/*
Muhtari'in Kodlari:
import java.util.PriorityQueue;
import java.util.Queue;

public class Q {

    public static void main(String[] args) {
        Queue<String> q = new PriorityQueue<>(); // FIFO
            q.add("D");
            q.add("A");
            q.add("B");
            q.add("C");

        System.out.println(q);

          String str =  q.poll(); //A
        System.out.println(str );

        System.out.println(q);

       //System.out.println(q.get(0));



    }
}
 */

package day52_Collection;
//Collection is an interface.
//Collections is a class.

import java.util.*;

public class Collections_Utility {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10, 9, 8, 7, 6, 5, 4));
        Collections.sort(list1);

        System.out.println(list1);

        System.out.println("===============================");

        //  1. write a program that can remove the duplicates for arraylist and print out in sorted asc order
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(5,5,5,6,6,6,7,7,7,7,4,3,2,2,1,1,1));
        /* bu ilk ve uzun yol
        TreeSet<Integer>sorted = new TreeSet<>(nums);
        nums= new ArrayList<>(sorted);

        System.out.println(sorted);
        System.out.println(nums);
         */

        //1,2,3,4,5,6,7
        nums=new ArrayList<>(new TreeSet<>(nums));
        System.out.println(nums);

        System.out.println("===========================================");

        // 2. write a program that can removed the duplicates from an arraylist. DO NOT change the order
        //   [6,6,6,6,5,5,5,4,4,4,4] ==> [6,5,4]

        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(6,6,6,6,5,5,5,4,4,4,4));
        list=new ArrayList<>(new LinkedHashSet<>(list));
        System.out.println(list);

        System.out.println("===========================================");

        ArrayList<String>letters = new ArrayList<>();
        letters.addAll(Arrays.asList("A","B","C","B","D"));

        boolean result = Collections.frequency(letters,"A")==1;
        System.out.println(result);











    }


}
/*
Muhtar'in kodlari:
import java.util.*;

public class Collections_Utility {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10,9,8,7,6,5,4) );
        Collections.sort(list1);
        System.out.println(list1);

        System.out.println("===================================");
   //     1. write a program that can remove the duplicates for arraylist and print out in sorted asc order

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll( Arrays.asList(100, 2000, 50, 50, 100, 200, 300, 50));
             //1,2,3,4,5,6,7
        nums = new ArrayList<>(  new TreeSet<>(nums) );

        System.out.println(nums);

        System.out.println("====================================");
        // 2. write a program that can removed the duplicates from an arraylist. DO NOT change the order
     //   [6,6,6,6,5,5,5,4,4,4,4] ==> [6,5,4]

        ArrayList<Integer>  list = new ArrayList<>(Arrays.asList(6,6,6,6,5,5,5,4,4,4,4));
        list = new ArrayList<>(  new LinkedHashSet<>(list)  );
        System.out.println(list);


        System.out.println("==================================================");

        ArrayList<String> letters = new ArrayList<>();
        letters.addAll( Arrays.asList("A", "B", "C", "B", "D") );

        boolean result = Collections.frequency(letters, "A") == 1;

        System.out.println(result);




    }

}
 */

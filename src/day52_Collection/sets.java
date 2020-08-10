package day52_Collection;

import java.util.*;

public class sets {

    public static void main(String[] args) {
        // Set<String> names = new HashSet<>(); //kafasina gore (isimleri) order yapar
        Set<String> names = new LinkedHashSet<>(); //oreder, isimleri nasil yazdiysan(top to bottom) yapar.
        names.add("Sha");
        names.add("Zuura");
        names.add("Saban");
        names.add("Ozgur");
        names.add("Ozgur");
        names.add("Ozgur");
        names.add("Ozgur");// 1 tane Ozgur yazdirir.

        System.out.println(names);

        String[] arr = {"A", "A", "C", "B", "A"}; //ABC

        LinkedHashSet<String> set1 = new LinkedHashSet<>(Arrays.asList(arr)); //[A, C, B]

        System.out.println(set1);

        //System.out.println(set1.get(1)); //We use get method to retrieve data but "Set" does not have index number.So it gives compile error
                                           //Since it does not have index number,we cannot use get method

        System.out.println("=========================================");

        Set<Integer> numbers = new TreeSet<>(); //tree set will remove duplicates and sort the objects out.
        numbers.addAll(Arrays.asList(10, 9, 10, 9, 8, 7, 8, 7, 6, 5, 6));

        System.out.println(numbers);

        System.out.println("=========================================");

        //TreeSet<String> treeSet = new TreeSet<>(); //TreeSet does not accepts "null"
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(null);

        System.out.println(hashSet);

        TreeSet<String> treeset = new TreeSet<>();
        treeset.add(null);

        System.out.println(treeset);


    }

}

/*
Muhtar'in Kodlari:
import java.util.*;

public class sets {

    public static void main(String[] args) {
        Set<String> names = new LinkedHashSet<>();
        names.add("Sha");
        names.add("Zuura");
        names.add("Saban");
        names.add("Ozgur");
        names.add("Ozgur");
        names.add("Ozgur");
        names.add("Ozgur");

        System.out.println(names);

        String[] arr = {"A", "A", "C", "B", "A"}; // ACB
        LinkedHashSet<String> set1 = new LinkedHashSet<>(Arrays.asList(arr)); // [A,C, B]

        System.out.println(set1);

      //  System.out.println( set1.get(1) );

        System.out.println("=========================================");
        Set<Integer> numbers = new TreeSet<>();
        numbers.addAll( Arrays.asList(10,9,10, 9, 8, 7, 8, 7, 6, 5, 6));

        System.out.println(numbers);

        System.out.println("==========================");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(null);

        System.out.println(hashSet);

        TreeSet<String> treeset = new TreeSet<>();
        treeset.add(null);

        System.out.println(treeset);



    }

}
 */

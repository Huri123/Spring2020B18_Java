package day53_Iterator_Maps;

import java.util.*;

public class Iterating_Collections2 {

    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList( "Mehmet", "Mohammed", "Yucel", "Sha",
                "Ozgur", "Ahmet", "Osmanj", "Ozgur", "Ozgur", "Ozgur", "Ozgur" , "Irina"   ) );
        System.out.println(names);

        Iterator<String> it = names.iterator();
        while( it.hasNext() ){
            String s = it.next();
            //if (it1.next().toLowerCase().contains("m")){  //boyle de olur
            if(s.contains("m") || s.contains("M")){
                it.remove();
            }
        }
        /*
        for( Iterator<String> it1 = names1.iterator(); it1.hasNext();){
            if (it1.next().toLowerCase().contains("m")){
        it1.remove();
            }
        }
        */

        System.out.println(names);

        System.out.println("==============================================");
        LinkedHashSet<String> students = new LinkedHashSet<>();
        students.addAll(Arrays.asList( "Mehmet", "Mohammed", "Yucel", "Sha",
                "Ozgur", "Ahmet", "Osmanj", "Ozgur", "Ozgur", "Ozgur", "Ozgur" , "Irina"  ) );

        for( Iterator<String> I = students.iterator(); I.hasNext() ;  ){
            String s = I.next();
            if(s.contains("m") || s.contains("M")){
                I.remove();
            }
        }

        System.out.println(students);

        System.out.println("=====================================================");
        //idk java en az 8 ise o zaman bu bilk operationlara basvurabiliriz.

        LinkedHashSet<String> n = new LinkedHashSet<>();
        n.addAll(Arrays.asList( "Mehmet", "Mohammed", "Yucel", "Sha",
                "Ozgur", "Ahmet", "Osmanj", "Ozgur", "Ozgur", "Ozgur", "Ozgur" , "Irina"  ) );

        n.removeIf( s -> s.contains("m") || s.contains("M") );

        System.out.println(n);

        System.out.println("==========================================");

        LinkedHashSet<String> T = new LinkedHashSet<>();
        T.addAll(Arrays.asList( "Mehmet", "Mohammed", "Yucel", "Sha",
                "Ozgur", "Ahmet", "Osman", "Ozgur", "Ozgur", "Ozgur", "Ozgur" , "Irina"  ) );

        T.removeAll( Arrays.asList( "Mehmet", "Ozgur", "Mohammed" ));

        System.out.println(T);

        System.out.println("=================================================");
        LinkedHashSet<String> R = new LinkedHashSet<>();
        R.addAll(Arrays.asList( "Mehmet", "Mohammed", "Yucel", "Sha",
                "Ozgur", "Ahmet", "Osman", "Ozgur", "Ozgur", "Ozgur", "Ozgur" , "Irina"  ) );

        R.retainAll( Arrays.asList( "Yucel", "Sha", "Ahmet" ) );

        System.out.println(R);

        System.out.println("========================================================");
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7));

        // verify 5, 6, 9, 8 are contained in the list
        boolean result = list.containsAll( Arrays.asList(5, 6, 9, 8, 11 ) ); // false

        System.out.println(     list.containsAll( Arrays.asList(5, 6, 9, 8, 11 ) )      );
        System.out.println( result );



    }

}

/*
Muhtar'in kodlari:
import java.util.*;

public class Iterating_Collections2 {

    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList( "Mehmet", "Mohammed", "Yucel", "Sha",
                "Ozgur", "Ahmet", "Osmanj", "Ozgur", "Ozgur", "Ozgur", "Ozgur" , "Irina"   ) );
        System.out.println(names);

       Iterator<String> it = names.iterator();
       while( it.hasNext() ){
           String s = it.next();
           if(s.contains("m") || s.contains("M")){
               it.remove();
           }
       }

        System.out.println(names);

        System.out.println("==============================================");
        LinkedHashSet<String> students = new LinkedHashSet<>();
        students.addAll(Arrays.asList( "Mehmet", "Mohammed", "Yucel", "Sha",
                "Ozgur", "Ahmet", "Osmanj", "Ozgur", "Ozgur", "Ozgur", "Ozgur" , "Irina"  ) );

        for( Iterator<String> I = students.iterator(); I.hasNext() ;  ){
            String s = I.next();
            if(s.contains("m") || s.contains("M")){
                I.remove();
            }
        }

        System.out.println(students);

        System.out.println("=====================================================");
        LinkedHashSet<String> n = new LinkedHashSet<>();
        n.addAll(Arrays.asList( "Mehmet", "Mohammed", "Yucel", "Sha",
                "Ozgur", "Ahmet", "Osmanj", "Ozgur", "Ozgur", "Ozgur", "Ozgur" , "Irina"  ) );

        n.removeIf( s -> s.contains("m") || s.contains("M") );

        System.out.println(n);

        System.out.println("==========================================");

        LinkedHashSet<String> T = new LinkedHashSet<>();
        T.addAll(Arrays.asList( "Mehmet", "Mohammed", "Yucel", "Sha",
                "Ozgur", "Ahmet", "Osman", "Ozgur", "Ozgur", "Ozgur", "Ozgur" , "Irina"  ) );

        T.removeAll( Arrays.asList( "Mehmet", "Ozgur", "Mohammed" ));

        System.out.println(T);

        System.out.println("=================================================");
        LinkedHashSet<String> R = new LinkedHashSet<>();
        R.addAll(Arrays.asList( "Mehmet", "Mohammed", "Yucel", "Sha",
                "Ozgur", "Ahmet", "Osman", "Ozgur", "Ozgur", "Ozgur", "Ozgur" , "Irina"  ) );

        R.retainAll( Arrays.asList( "Yucel", "Sha", "Ahmet" ) );

        System.out.println(R);

        System.out.println("========================================================");
        List<Integer>  list = new ArrayList<>();
          list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7));

          // verify 5, 6, 9, 8 are contained in the list
          boolean result = list.containsAll( Arrays.asList(5, 6, 9, 8, 11 ) ); // false

        System.out.println(     list.containsAll( Arrays.asList(5, 6, 9, 8, 11 ) )      );
        System.out.println( result );



    }

}
 */

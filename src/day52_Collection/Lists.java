package day52_Collection;

import java.util.*;

public class Lists {

    public static void main(String[] args) {
        //List<String> list0 = new List<>(); //List is not class it is interface. o yuzden object olusturamayiz.

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);

        List<Integer> list2 = new LinkedList<>();
        list2.add(10);
        list2.remove(0);

        System.out.println("===================================");
        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(10);

        Vector<Integer> vector = new Vector<>();
        vector.add(10); //the actions of vector is synchronized

        Stack<Integer> stack = new Stack<>();
        stack.add(10);

        System.out.println("==========================================");

        Stack<String> names = new Stack<>();
        names.add("Sarah");
        names.add("John");
        names.add("Mary");
        names.add("Holly");
        names.add("David");
        System.out.println(names); // we added "David" as the last object ==> whenever we need to remove last object --> we use pop() the unique method
        // pop() method will return us a String ==> we can assign the outcome to a String like this:


        String s1 = names.pop(); // David  //last object i getirir. ama ayni zamanda names den last object i de remove yapar
        System.out.println(s1);

        System.out.println(names);

        String s2 = names.pop(); // "Holly"
        System.out.println(s2);
        System.out.println(names);

        names.push("Phu");
        System.out.println(names);


    }

    //public synchronized void method1(){}

}
/*
Muhtar'in Kodlari:
import java.util.*;

public class Lists {
    public static void main(String[] args) {
       // List<String> list0 =  new List<>();

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);

        List<Integer> list2 = new LinkedList<>();
        list2.add(10);
        list2.remove(0);

        System.out.println("===================================");
        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(10);

        Vector<Integer>  vector = new Vector<>();
        vector.add(10);

        Stack<Integer> stack = new Stack<>();
        stack.add(10);

        System.out.println("===========================================");

        Stack<String> names = new Stack<>();
            names.add("Sha");
            names.add("Dovran");
            names.add("Rahman");
            names.add("Anna");
            names.add("Rustem");

        System.out.println(names);

           String s1 = names.pop(); //"Rustem"
        System.out.println(s1);

        System.out.println(names);

        String s2 =    names.pop(); // "Anna"
        System.out.println(s2);
        System.out.println(names);

        names.push("Phu");
        System.out.println(names);


    }
 }
 */

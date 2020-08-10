package Homework;
/*
Instructions from your teacher:
In this assignment you will swap a position in an array list with another.

swap gets 3 arguments, an arraylist, a position, and another position to swap with.

for example:

swap(["one","two","three"],0,2)
returns:["three","two","one"]


swap(["a","c","b","d","e"],0,3)
returns:["d","c","b","a","e"]

 */

import java.util.*;

public class MethodsWithArrayList_Swap {

    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2) {
       Collections.swap(list,pos1,pos2);
        return list;
    }

    public static void main(String[] args) {
        ArrayList<String> swapp = new ArrayList<>();
        swapp.addAll(Arrays.asList("a","c","b","d","e"));
        System.out.println(swap(swapp,0,3));
    }//end main
}


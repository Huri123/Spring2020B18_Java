package Homework;

import java.util.ArrayList;

/*
Instructions from your teacher:
The next two methods are .size() and .get().

If we have an ArrayList called someList and an Array called arr, these two pretty much do
the same thing:
someList.size()
arr.length

In other words, .size() returns the length (size) of the list.

The method .get(i) will return the element found at index i.  The following two expressions
also do the same thing:
someList.get(4)
arr[4]

On the left, given an ArrayList of Integers called ints, find and return the sum of all the
Integers in ints.
 */
public class _183MethodswithArrayList_5_sizeget {
    public static int sum(ArrayList<Integer> ints) {
        //write code here

        int sum2 = 0;
        for (Integer each : ints) {
            sum2 += each;

        }
        return sum2;
    }
//mainde calistiramadim
    public static void main(String[] args) {

                //sum(1, 2, 3, 5, 4, 6, 8, 9);
    }
}

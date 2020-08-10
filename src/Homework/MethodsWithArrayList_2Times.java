package Homework;
/*
Instructions from your teacher:
Create a method that:

is called twoTimes
returns a new ArrayList of Integers
takes in a single parameter - an ArrayList of Integers

This method should create a new ArrayList of Integers that contains every value of the ArrayList parameter repeated twice.

For example, if the parameter is
(1,5,3,7)
The method should return a new ArrayList of Integers with
(1,1,5,5,3,3,7,7)
 */
import java.util.ArrayList;
import java.util.Arrays;

public class MethodsWithArrayList_2Times {
    public static void main(String[] args)
    {ArrayList<Integer> twice = new ArrayList<>();
      twice.addAll(Arrays.asList(1,5,3,7));
        System.out.println(twoTimes(twice));
    }
    //create your method below
public static ArrayList<Integer>twoTimes(ArrayList<Integer>nums){
    ArrayList<Integer> twice = new ArrayList<>();

    for (int i=0;i<nums.size();i++){
      twice.add(nums.get(i));
      twice.add(nums.get(i));
    }

    return twice;
}
}

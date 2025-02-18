package Homework;

import java.util.ArrayList;
import java.util.Arrays;

/*
Instructions from your teacher:
Create a static method that:

is called appendPosSum
returns an ArrayList of Integers
takes one parameter: an ArrayList of Integers

This method should:
Create a new ArrayList of Integers
Add only the positive Integers to the new ArrayList
Sum the positive Integers in the new ArrayList and add the Sum as the last element

For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3),
the ArrayList that gets returned should be (4,3,4,3,14), with 14 being the sum of (4,3,4,3).
The original ArrayList should remain unchanged.
 */
public class _190MethodsWithArrayList_11_AppendPosSum {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(4, -6, 3, -8, 0, 4, 3));
        System.out.println(appendPosSum(nums));
    }

    //create your method below
    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> numbers) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (Integer each : numbers) {
            if (each > 0) {
                nums.add(each);
            }
        }

        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > 0) {
                sum += nums.get(i);
            }
        }
        nums.add(sum);
        return nums;


    }

}

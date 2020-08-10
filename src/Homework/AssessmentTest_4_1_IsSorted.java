package Homework;

import java.util.Arrays;

/*
Instructions from your teacher:
this is a sorted collection (in this case array):

7,8,9,10

this is an unsorted collection:

5,4,9,8,7,3

sorted in this case means smallest number to biggest.
isSort gets an array and returns true if its sorted.

for example:
isSort([2,3,5,4,9]);
returns: false

isSort([1,2,3]);
returns: true

isSort([7,8,9]);
returns: true.
 */
public class AssessmentTest_4_1_IsSorted {
    public static boolean isSort(int[] nums) {
        int arr[]=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr);
        boolean b=Arrays.equals(arr,nums);

        return b;
        }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8};
        System.out.println(isSort(nums));
    }
    }

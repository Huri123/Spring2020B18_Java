package Homework;

import java.util.Arrays;

/*
Instructions from your teacher:
Write the definition of a method reverse, whose parameter is an array of Strings.
The method reverses the elements of the array. The method returns an array of strings in the reversed order.
Example:
input: ["apple", "pear"]
output: ["pear", "apple"]
 */
public class AssessmentTest_3_3_ReverseAnArray {
    public static void main(String[] args) {
        String[] arr = {"apple", "orange"};
        String[] b = reverse(arr);
        System.out.println(Arrays.toString(b));
        //System.out.println(Arrays.toString(reverse(arr)));
    }

    /**
     * Reverses the order of the elements in the specified array
     *
     * @param arr
     * @return array of strings
     */
    public static String[] reverse(String[] arr) {
        String[] rev = new String[arr.length];
        int k = arr.length - 1; //4 // sondan baslattik reverse yapmak icin
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[k];
            k--;
        }
        return rev;
    }
}

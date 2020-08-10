package Homework;

import java.util.Arrays;

/*
Instructions from your teacher:
mergR merges two arrays into one.
it gets two int arrays and returns an int array

for example:

mergR([1,2,3],[4,5,6])
returns [1,2,3,4,5,6]

mergR([1,2],[6,8])
returns [1,2,6,8]

hint:
create a length int for the combined length of both arrays.
create an array with that length (thats the array we will return).
create an iterator for both arrays (int z=0).

loop first array and inside the loop insert current element to the return array (ret[z]=a[i];)
then increment the iterator for both arrays (z++).

do the same for the second array.
 */

//cozum dogru ama anlamadim
public class _178MethodsWithArrays_1_MergeArrays {
    public static int[] mergR(int[] a, int[] b) {
        int length = a.length + b.length;
        int[] ret = new int[length];
        for (int z = 0; z < a.length; z++) {
                ret[z] = a[z];
            }

            for (int i = 0; i < b.length; i++) {
               ret[a.length+i] = b[i];
            }


        return ret;
    }//end mergR

    public static void main(String[] args) {
        int a[]={1,2,3};
        int b[]={4,5,6};
        System.out.println(Arrays.toString(mergR(a,b)));
    }
}

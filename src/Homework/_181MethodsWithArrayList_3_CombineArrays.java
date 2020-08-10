package Homework;
/*
Instructions from your teacher:
combine two String arrays into one arraylist and return it as a string.

for example:

combineRs(["f","o","o"],[" b","a","r"])
returns "foo bar"


combineRs(["1","2","3"],[" 4"])
returns "1234"
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class _181MethodsWithArrayList_3_CombineArrays {
    public static String combineRs(String[] r1, String[] r2) {
        ArrayList<String> combine = new ArrayList<>();
        String str = "";
        for (String each : r1) {
            str +=each;
        }
        for (String each : r2) {
            str += each;
        }

        return str;
    }

    public static void main(String[] args) {
        String[] r1={"1","2","3"};
        String [] r2={" 4"};
        System.out.println(combineRs(r1,r2));
    }

}


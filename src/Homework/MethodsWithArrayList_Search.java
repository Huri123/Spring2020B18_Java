package Homework;
/*
Instructions from your teacher:
search method accepts ArrayList of Strings and String find.
and returns a String.
It will look for an element within ArrayList that contains value of find
if it finds it, methods needs to return whole Element value.
if  an instance of find doesn't exist return:"search failed"

for example:

search(["one apple","two orange","four banana"],"four")
returns:
"four banana"
("four banana" contains "four" so method returns "four banana")

search(["hello","world"],"goodbye")
returns:
"search failed"
(no "goodbye" in any element)

hint:
use contains string method to test if element has word value in it.
 */

import java.util.*;

public class MethodsWithArrayList_Search {

    public static String search(ArrayList<String> r, String find) {
        String result = "";
        for (int i = 0; i < r.size(); i++) {
            if (r.get(i).contains(find)) {
                result = r.get(i);
                break; /*
                The problem is probably because you are iterating through but with the if else, only the last iteration
                is being stored
                Saim  5 days ago
                Because every iteration the result is being changed, so you'll need to either break the loop when you
                find the element or return right away
               */

            } else {
                result = "search failed";
            }
        }
        return result;

        /*
        2.yol
        String result = "";
        for (int i = 0; i < r.size(); i++) {
            if (r.get(i).contains(find)) {
                result = r.get(i);
                return result;
                  }

        }
        return "search failed";
         */
    }//end wineSeller

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<String>();
        arr.add("2");
        arr.add("6");
        arr.add("foo bar");
        arr.add("abc");


        String find_tst = search(arr, "foo");
        System.out.print(find_tst);//foo bar


    }//end main
}


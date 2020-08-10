package Homework;
/*
Instructions from your teacher:
Create a static method that:
is called combineAL
returns an ArrayList
takes two parameters: an ArrayList of Strings called wordList1, and an ArrayList of Strings
called wordList2

This method should create a new ArrayList of Strings, add all the words (in order) from
wordList1, then add all the words (in order) from wordList2.  In other words, it is combining
all the elements from the two parameters.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class _187MethodsWithArrayList_8_CombineAll {

    //create your method below
    public static ArrayList<String> combineAL(ArrayList<String> wordlist1, ArrayList<String> wordlist2) {
        //wordlist1.addAll(Arrays.asList("aa", "bb", "cc"));
        //wordlist2.addAll(Arrays.asList("dd", "ee", "ff"));
        ArrayList<String> combine = new ArrayList<>();
        for (String each : wordlist1) {
            combine.add(each);
        }
        for (String each : wordlist2) {
            combine.add(each);
        }
        return combine;

       /*
        for (int i=0;i<wordlist1.size();i++){
            combine.add(wordlist1.get(i));
        }
        for (int i=0;i<wordlist2.size();i++){
            combine.add(wordlist2.get(i));
        }
        return combine;

         */
    }

    public static void main(String[] args) {
        ArrayList<String>wordlist1=new ArrayList<String>(Arrays.asList("aa", "bb", "cc"));
        ArrayList <String>wordlist2=new ArrayList<String>(Arrays.asList("dd", "ee", "ff"));
        System.out.println(combineAL(wordlist1,wordlist2));

    }
}


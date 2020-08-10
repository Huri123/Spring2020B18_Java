package Homework;

import java.util.Arrays;

/*
Instructions from your teacher:
Anagram is a word, phrase, or name formed by rearranging the letters of another, such as cinema, formed from iceman.

isAnagram method checks if word1 and word2 are anagram to each other then return a boolean.

each letter in word1 should appear in word2 exact number of times
ignore empty spaces
make your code case insensitive

Examples:

isAnagram("listen", "Silent") ==> true

isAnagram("earth", "heart") ==> true

isAnagram("star", "rats") ==> true

isAnagram("hi", "bye") ==> false

isAnagram("java", "cava") ==> false

 */
public class _195MethodsWithString_15_Anagram {
    public static boolean isAnagram(String word1, String word2) {
        word1.replace(" ", "");
        word2.replace(" ", "");
        char[] ch = word1.toLowerCase().toCharArray();
        char[] c = word2.toLowerCase().toCharArray();
        Arrays.sort(c);
        Arrays.sort(ch);

        if (Arrays.equals(c,ch)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("earth", "Heart"));



    }

}



package Homework;
/*
Instructions from your teacher:
using indexOf method output the position of b inside txt string.
then output the index of "foo"

use System.out.println() to output each index of requested.
 */
public class stringIndexOf {
    public static void main(String[] args) {

        String txt = "foo bar";
        //your code here
        int a=txt.indexOf("b");
        int b=txt.indexOf("foo");
        System.out.println(a);
        System.out.println(b);

    }
}

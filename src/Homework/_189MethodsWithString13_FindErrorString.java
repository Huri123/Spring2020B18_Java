package Homework;
/*
Instructions from your teacher:
isError method checks if the line of string it gets has the word error at the start of it.

it gets a string and returns a boolean.
true if it found the word 'error' an the start of the line string

example use:

isError("foo bar")
returns : false

isError("error foo bar")
returns : true

isError("error one two")
returns : true

isError("three four error")
returns : false

hint: check the string methods in the java doc. one of them is helpful for this.

https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
 */
public class _189MethodsWithString13_FindErrorString {
    public static boolean isError(String line) {
        boolean error=line.startsWith("error")?true:false;

        return error;

    }

    public static void main(String[] args) {
        String str="error foo bar";
        boolean str2=isError(str);
        System.out.println(str2);
    }
}

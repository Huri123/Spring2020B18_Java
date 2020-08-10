package Homework;

/*
Instructions from your teacher:
reverse method reverse a string.
it gets a string and returns it in reverse.

for example:

reverse("foo") ==> "oof"

reverse("student") ==> "tnedust"
 */
public class _179MethodsWithString_11_ReverseString {
    public static String reverse(String input) {
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse += input.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        String str = "student";
        String rev = reverse(str);
        System.out.println(rev);
    }
}

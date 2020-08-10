package Homework;

import java.util.Scanner;

/*
Instructions from your teacher:
alejandro have started learning java, he knows what you know about ifs and strings.

he has a large number of text emails, going trough all of them will take a lot of time.
to save time he will only read the emails that refer to him by name.

he wants to write a program that gets a string (the email) and determines if his name "alejandro"
appears in that string. if so it will output "read this mail" else it will output "dont read".

for example:

a = "dear alejandro.....alot of text"

outputs: "read this mail"

a = "thunder blaz is the best drink in the galaxy..."

outputs: "dont read"

a = "subject : important project, alejandro we refer to you  this ...."

outputs: "read this mail"

 */
public class _070AlejandroI_StringMethods {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        //your code here
if(a.contains("alejandro")){
    System.out.println("read this mail");
}else{
    System.out.println("dont read");
}

/*
071. alejandro II_String Methods

Instructions from your teacher:
as Alejandro is time is precious and even with his little knowledge of programming he managed to save some time. but still he had a lot of emails to read.

he wants to add more conditions to his program, he wants only job related mails so he will narrow it down by also checking if the word "project" also appears beside his name, that way he will be sure its a job email that refers to him.


for example:

a = "dear alejandro.....alot of text"

outputs: "dont read"

a = "thunder blaz is the best drink in the galaxy..."

outputs: "dont read"

a = "subject : important project, alejandro we refer to you  this ...."

outputs: "read this mail"
 */
        if(a.contains("alejandro")&&a.contains("project")) {

                System.out.println("read this mail");
            } else {
                System.out.println("dont read");
            }
        }

    }

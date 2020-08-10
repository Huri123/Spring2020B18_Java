package Homework;
/*
 Instructions from your teacher:
        A sandwich is two pieces of bread with something in between. Print the string that is between the first
        and last appearance of "bread" in the given string, or return string "nothing" if there are not two pieces of bread.

        Example:
        input: breadjambread
        output: jam

        Example:
        input: xxbreadjambreadyy
        output: jam

        Example:
        input: xxbreadapple
        output: nothing

        Example:
        input: breadbutterbread
        output: butter
         */

import java.util.Scanner;

public class _095GetSandwich_Loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//replitten gecti ama burda hata veriyor
        String str = scan.next();
        String word = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.contains("bread")) {
                count++;
            }
        }
        if (str.length()<=10||count<=1) {
            System.out.println("nothing");
        }else if (count >= 2) {
            System.out.println(str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread")));

        }
    }


}

      /*
                String str = scan.next();
                String update=str;
                int breadCounter=0;
                while(update.contains("bread")){
                    update=update.replaceFirst("bread","");
                    breadCounter++;
                }
                //System.out.println(breadCounter); //> 2
                //System.out.println(str); // > xxbreadjambreadyy
                if (breadCounter>=2){
                    System.out.println(str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread")));
                } else {
                    System.out.println("nothing");
                }

        */
/*
Naci bey'in cozumu

        String str = scan.next();
        int count = 0;
        String str2 = str;
        while(str2.contains("bread")){
            count++;
            str2=str2.replaceFirst("bread","");
        }
        if (str.length()<=10||count<=1){
            System.out.println("nothing");
        }else{
            System.out.println(str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread")));
        }

 */







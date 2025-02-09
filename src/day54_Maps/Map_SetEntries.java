package day54_Maps;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Map_SetEntries {

    public static void main(String[] args) {

        LinkedHashMap<String , String>facebook = new LinkedHashMap<>();

        facebook.put("Tester01","password1");
        facebook.put("Tester02","password1");
        facebook.put("Tester02","password2");
        facebook.put("Tester03","password3");
        facebook.put("Tester05","password4");
        facebook.put("Tester04","password5");

        System.out.println(facebook);

        System.out.println("===================================================");

        //facebook.keySet();//Key(burda String) Set olarak return yapar. cunku Set de does not accept duplicates

        for( String  eachKey   :  facebook.keySet() ){
            //  System.out.println(eachKey +"  " +fb.get(eachKey));
            System.out.println(eachKey);
        }
        List<String> usernames = new ArrayList<>(facebook.keySet());
        System.out.println(usernames);

        System.out.println("=======================================");

        for(String eachValue : facebook.values()){
            System.out.println(eachValue);
        }

        List<String> passwords = new ArrayList<>(facebook.values());
        System.out.println(passwords);

        System.out.println("=======================================");


    }
}
/*
Muhtar'in Kodlari:
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Map_SetEntries {

    public static void main(String[] args) {
        LinkedHashMap<String, String>  fb = new LinkedHashMap<>();
        fb.put("Tester01", "password1");
        fb.put("Tester02", "password1");
        fb.put("Tester02", "password2");
        fb.put("Tester03", "password3");
        fb.put("Tester04", "password4");
        fb.put("Tester05", "password5");

        System.out.println(fb);

        System.out.println("======================================");

        for( String  eachKey   :  fb.keySet() ){
          //  System.out.println(eachKey +"  " +fb.get(eachKey));
            System.out.println(eachKey);
        }
        List<String> usernames = new ArrayList<>(fb.keySet());
        System.out.println(usernames);

        System.out.println("=======================================");

        for(String eachValue : fb.values()){
            System.out.println(eachValue);
        }

        List<String> passwords = new ArrayList<>(fb.values());
        System.out.println(passwords);

        System.out.println("=======================================");


    }

}
 */
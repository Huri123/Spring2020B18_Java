package day54_Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

//employeeInfo.put("Huri",120000.0);  ==> bunlara pair deniyor
public class Map_Intro {

    public static void main(String[] args) {

        Map<String,Double>employeeInfo=new LinkedHashMap<>();
        employeeInfo.put("Huri",120000.0);  //Autoboxing,unboxing yapamiyoruz. O yuzden int degil Double kullanmamiz lazim parantez icine
        employeeInfo.put("Holy",110000.50);

        System.out.println(employeeInfo.get(0));  //null verir. cunku map does not have index number
        System.out.println(employeeInfo.get("Huri")); //get() methodu kullanmak icin paranteaz icine index number degil,key yazmamiz lazim. Because every single values must have a key in the map.
        System.out.println("Holy");

        System.out.println(employeeInfo);
        System.out.println(employeeInfo.size());



    }
}

/*
Muhtar'in Kodlari:
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Intro {

    public static void main(String[] args) {
        Map<String, Double> employeeInfo = new LinkedHashMap<>();
            employeeInfo.put( "Zarina", 120000.0 );
            employeeInfo.put("Bakhodir", 110000.50);

        System.out.println(employeeInfo);
        System.out.println( employeeInfo.size() );

        System.out.println( employeeInfo.get("Zarina") );
        System.out.println( employeeInfo.get("Bakhodir") );

    employeeInfo.remove("Bakhodir");

        System.out.println(employeeInfo);
        System.out.println(employeeInfo.size());

        employeeInfo.put("Zarina", 130000.0);

        System.out.println(employeeInfo);


 */
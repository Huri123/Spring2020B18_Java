package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects {
    public static void main(String[] args) {
        Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};
        carpets[0].customOrder(7, 8.5, 20, true);
        carpets[1].customOrder(10, 15, 30, false);
        carpets[2].customOrder(9, 20, 15, true);
        carpets[3].customOrder(20, 18, 25, false);
        carpets[4].customOrder(35, 45, 35, false);


        System.out.println(carpets[4]); //bunun hashcode vermemesi icin carpet class'a toString method yazmamiz lazim.
        //parantez icine toString yazmamiz gerekmiyor. Bu sadece ToString icin gecerli.

        ArrayList<Carpet> persianCarpets = new ArrayList<>(); //datatype Carpet

        for (Carpet eachCarpet : carpets) { //datatype Carpet cunku Carpet bir object
            if (eachCarpet.isPersian) {
                persianCarpets.add(eachCarpet);
            }

        }
        System.out.println("There are " + persianCarpets.size() + " persian carpets.");

        System.out.println(persianCarpets.get(0)); //returns object of the carpet in the arraylist
        System.out.println(persianCarpets.get(0).calcCost()); //returns the total cost of the first carpet in the arraylist
        System.out.println(persianCarpets.get(1).calcCost()); //returns the total cost of the second carpet in the arraylist

        ArrayList<Carpet> regularCarpets = new ArrayList<>(Arrays.asList(carpets));
        //regularCarpets.removeAll(persianCarpets);//will remove all persian carpets.parantez ici collection type istiyor
        regularCarpets.removeIf(p -> p.isPersian); //2.yol

        System.out.println("There are " + regularCarpets.size() + " regular carpets.");

        for (int i = 0; i < regularCarpets.size(); i++) {
            System.out.println(regularCarpets.get(i).calcCost());
        }
    }
}
/*
Muhtar in kodlari
import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects {

    public static void main(String[] args) {

         Carpet[] carpets =  {new Carpet(), new Carpet(),  new Carpet(),  new Carpet(),  new Carpet()};
                carpets[0].customOrder(7,8.5,20,true);
                carpets[1].customOrder(10, 15, 30, false);
                carpets[2].customOrder(9,20,15,true);
                carpets[3].customOrder(20,18,25,false);
                carpets[4].customOrder(35, 45, 35, false);


        ArrayList<Carpet> persianCarpets = new ArrayList<>();

        for(Carpet eachCarpet  : carpets){
            if(eachCarpet.isPersian){
                persianCarpets.add(eachCarpet);
            }
        }

        System.out.println("there are "+persianCarpets.size()+" persian carpets");

        System.out.println(    persianCarpets.get(0).calcCost()    );
        System.out.println(   persianCarpets.get(1).calcCost() );



        ArrayList<Carpet> regularCarpets = new ArrayList<>(Arrays.asList(carpets) );
        //regularCarpets.removeAll(persianCarpets);
        regularCarpets.removeIf( p -> p.isPersian );

        System.out.println("There are "+regularCarpets.size()+" regular carpets");

        for(int i = 0; i < regularCarpets.size(); i++){
            System.out.println( regularCarpets.get(i).calcCost()  );
        }



    }

}
 */

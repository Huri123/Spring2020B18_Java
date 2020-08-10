package day44_Exceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class try_catchBlocks {
    public static void main(String[] args) {

        System.out.println("Test started");

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        //System.out.println(list.get(10)); //index out of bound exception

        //System.out.println("Test completed");

        try {
            System.out.println(list.get(10));

            //} catch (IndexOutOfBoundsException e) { //e sadece variable name
            // System.out.println("Something went wrong"); //bunu yazmayabilirsin de

            //} catch (RuntimeException e) { //Runtime, indexOutOfBounds in parent i.
                                             //o yuzden bunu da yazabilirsin
            //  System.out.println("Something went wrong");

        } catch (Exception e) {     //Runtime, indexOutOfBounds in grandparent i.
                                   //o yuzden bunu da yazabilirsin
            System.out.println("Something went wrong");
        }
        System.out.println("Test completed");


    }
}
/*
Muhtar'in kodlari
public static void main(String[] args) {
        System.out.println("Test started");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        try{
            System.out.println(list.get(10) );  // index out of bound

        } catch(Exception e){
            System.out.println("Something went wrong");
        }



        System.out.println("Test completed");

        }

 */

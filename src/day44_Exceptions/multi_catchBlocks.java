package day44_Exceptions;

import java.util.NoSuchElementException;

public class multi_catchBlocks {

    public static void main(String[] args) {
        //only one of catch blocks is gonna get executed
        //parent exception cannot come before the child exception
        try {
            System.out.println(100 / 0);

        } catch (ClassCastException e) {
            System.out.println("Class Cast");

        } catch (NoSuchElementException e) {
            System.out.println("No such element");

            //}catch (RuntimeException e){ //parent exception cannot come before the child exception
            //  System.out.println("Runtime");
            //}

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");

        } catch (RuntimeException e) {
            System.out.println("Runtime");
        }
            /* catch (ArithmeticException e) {  //parent exception cannot come before the child exception
            System.out.println("Arithmetic");
        }
        */ catch (Exception e) { //Exception can handle any exception. yani tum exceptionlari cozer.ama childlardan sonra gelmeli
            System.out.println("Runtime");

        }/* catch (ArithmeticException e) {  //parent exception cannot come before the child exception
            System.out.println("Arithmetic");
        }
        */

    }

}

/*
Muhtar'in kodlari:
import java.util.NoSuchElementException;

public class multi_catchBlocks {

    public static void main(String[] args) {

        try {
            System.out.println(100 / 0);  // Arithmetic

        } catch(ClassCastException e){
            System.out.println("Class Cast");

        } catch (NoSuchElementException e){
            System.out.println("No such element");

        }  catch(ArithmeticException e){
            System.out.println("Arithmetic");

        } catch (RuntimeException e){
            System.out.println("Runtime");

        }catch(Exception e){
            System.out.println("Exception");

        }



    }


}
 */

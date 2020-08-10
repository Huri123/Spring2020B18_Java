package day44_Exceptions;

public class ExceptionHandling {

    public static void main(String[] args) {

        String str = "Cybertek";

        try {

            System.out.println(str.charAt(400));

        } catch (RuntimeException e) {

            String description = e.getMessage();

            System.out.println(description);

        }
        System.out.println("====================================================");
        String description ="";
        try {
            System.out.println(100 / 0); //unchecked exception because compiler is ok while writing code
            System.out.println("Try block");

        } catch (ArithmeticException e) { //e represents arithmetic exception.Bu b de c de yada herhangi bir variable ismi de olabilir.
            System.out.println("Catch block");
            //String description = e.getMessage();
            description=e.getMessage();//bu da 2.yol
            System.out.println(description);

        }
        System.out.println("Completed");
    }


}
/*
testCase:
    step1
    step2
    step3
    step4
    .....
    step10
 */

/*
Muhtar'in kodlari:
public class ExceptionHandling {

    public static void main(String[] args) {

        String str = "Cybertek";

        try{

            System.out.println(str.charAt(400));

        }catch(RuntimeException e){
            String discription  =    e.getMessage();
            System.out.println(discription);

        }

        System.out.println("==========================================");
        String result = "";

        try {
            System.out.println(100 / 0);
            System.out.println("Try block");

        }catch (ArithmeticException e){
            System.out.println("Catch block");
          result =  e.getMessage();

        }


        System.out.println( result );


        System.out.println("Completed");


    }


}

/*
testCase:
        step1
        step2
        step3
        step4
        ....
        step10
 */

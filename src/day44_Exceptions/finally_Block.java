package day44_Exceptions;

public class finally_Block {

    public static void main(String[] args) {
        try {
            System.out.println(9/0);
            System.out.println("Try block");

        }catch (Exception e){  //catch block is declared after try block. yani finally den sonra olamaz
            System.out.println("Catch block");

        }finally { //finally always gets executed regardless of exception
            System.out.println("Finally");
        }
    }


}

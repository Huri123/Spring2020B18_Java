package day44_Exceptions;

public class try_catchBlocks2 {
    public static void main(String[] args) {
        System.out.println("Hello");

        try {

            Thread.sleep(3000);

        }catch(Exception  e){//Exception can handle any exception.yani tum exceptionlari cozer.
                            //Because it is parent of all exceptions

        }


        System.out.println("World");

    }

}

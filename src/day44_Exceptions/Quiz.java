package day44_Exceptions;

import java.io.IOException;

public class Quiz {
    public static void main(String[] args) throws RuntimeException {

        //method(); //in order to handle this exception we could have done throws Same exception or super exception. yani ya IOException
        //olacakti ya da Exception olacakti

    }

    public static void method() throws IOException {
        throw new IOException();
    }
}

package day45_Exceptions;

import java.io.IOException;

public class ThrowsKeyword3 {

    public static void method1() throws IOException,Exception {//once child (IOException), sonra parent(Exception) yazilmali
    Thread.sleep(3000);
    }

    public static void main(String[] args){

        //method1();

        //Thread.sleep(1000);

    }
}

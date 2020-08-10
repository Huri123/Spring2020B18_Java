package day44_Exceptions;

public class Practice2 {

    public static void main(String[] args) {
        /*
        System.out.println("Java");
        waits(3.5);
        System.out.println("Cybertek");
         */

        System.out.println("Hello");
        waits(5);
        System.out.println("Cybertek"); //5 saniye bekleyip Cybertek yazdirir
    }
/*
    public static void waits() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
    }
 */
        public static void waits (double seconds) { //bu kodu selenyumda cok kullanacagiz
            try {
                Thread.sleep((long)seconds*1000);//millisecondu seconda cevirmek icin 1000 ile carptik
            } catch (Exception e) {
            }
        }


    }

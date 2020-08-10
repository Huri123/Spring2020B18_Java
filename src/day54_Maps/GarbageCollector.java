package day54_Maps;

public class GarbageCollector {

    public static void main(String[] args) {

        GarbageCollector obj = new GarbageCollector();  //This one will not be collected by garbage collector

                               new GarbageCollector();  //This one will be collected by the garbage collector

        System.out.println("Done");

        //unreference an object:

        String str = new String("Cybertek");
               str = new String("MIT");     //2 OBJECT OLUSTURMUS OLDUK

        System.out.println(str);  //MIT yazacak. cunku str ARTIK refernce MIT

        Integer num = new Integer(123); //Integer wrapper class
                num = new Integer(124);

                //123 will be collected by garbage collector

        Double n = new Double(0.5);
               n = null;

        System.out.println(n);

        GarbageCollector obj3 = new GarbageCollector();
        //obj3.finalize();  // it throws throwable that is parent of all exception. So we can not call it. Garbage clolletor already call finalize method internally.

    }

}
/*
Muhtar'in Kodlari:

public class GarbageCollector {

    public static void main(String[] args) {
        GarbageCollector obj =  new GarbageCollector(); // will not be collected by garbage collector
                            new GarbageCollector(); // will be collected by garbage collector


        System.out.println("Done");

        // unreference an object:

        String str = new String("Cybertek");
               str = new String("MIT");

        System.out.println(str);


        Integer num = new Integer(123);
                num =  new Integer(124);

                    //123 will be collected by garbage collector

        Double n = new Double(0.5);
               n = null;

        System.out.println(n);


        GarbageCollector obj3 = new GarbageCollector();
     //   obj3.finalize();



    }
}
 */

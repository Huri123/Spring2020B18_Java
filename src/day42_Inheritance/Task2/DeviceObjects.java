package day42_Inheritance.Task2;

public class DeviceObjects {
    public static void main(String[] args) {

        TV tv1 = new TV("Samsung","E250", 500, "40 inches" );
        tv1.country = "USA";//country static variable oldugu icin Phone'a country initialize etmezsek icin de country USA olacak
        System.out.println( tv1 );

        System.out.println("=====================================================");

        Phone phone1=new Phone("IPhone","11",1000,"large");
        phone1.country="China";//boyle initialize edersek TV=USA Phone=China yazar
        System.out.println(phone1);
        System.out.println(tv1);//burda da tv1 in country si degisti. cunku static son atanan value yu alir.



    }
}

package OfficeHours.Practice_05_13_2020;

public class staticBlock {

    // static String str="Cybertek"; //static variable ister initialize yapabilirsin isterse default birakabilirsin
    //str=str.toUpperCase; //ama burda error verir

    static String str;
    // static Excel excelsheet;
    int a = 100;

    static {

        str = "Cybertek";
        str = "Harvard";
        str = "MIT";//The last assigned one is used,valid

        // a = 300;
    }


    public static void main(String[] args) {
        str = "Cybertek";
        System.out.println(str);
    }
}

class StaticBlockTest {
    public static void main(String[] args) {

        System.out.println(staticBlock.str);//staticBlock taki main de initialize edersek diger class
        //larda kullanamayiz o yuzden burda null verir
    }


}







package day19_Arrarys;

public class Arrays_Practice1 {
    public static void main(String[] args) {
        String[] friends={"Mike","Adam","John","Anny","Zoe","Mya"};//herbir isim ayri string
        //index number      0      1       2     3      4     5

        /*
        System.out.println(friends[3]);
        String s1 = friends[1];
        System.out.println(s1);
         */

        for(int i =0;i<=5;i++){
            String name = friends[i];
            System.out.println(name);
        }
        String[] emails = {"hurioruc@yahoo.com", "hurioruc@gmail.com", "hurioruc@hotmail.com", "hurioruc@outlook.com"};

        // print out all the users who registered with their gmail

        //  max:  4

        for (int i = 0; i <= 3; i++) {
            String email = emails[i];
            if (email.endsWith("@gmail.com")) {
                System.out.println(email);
            }

        }


    }
}

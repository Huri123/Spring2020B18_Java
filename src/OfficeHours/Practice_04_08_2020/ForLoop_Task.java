package OfficeHours.Practice_04_08_2020;
public class ForLoop_Task {

    public static void main(String[] args) {

        /*
        print all the numbers between 0 ~ 100 that can be divisible by 3 or 5
         */

        for(int i = 0; i <= 100; i++ ){
            if(i%3 ==0 || i % 5 ==0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        System.out.println("=================================");
        //             1234
        String name = "Anna";
        //     0123
        String result = ""; // annA
        int lastIndex =  name.length()-1;// length aslinda 4 ama index 0 dan basladigi icin 1 cikardik

        for(int i = lastIndex; i >= 0; i-- ){
            // result = result + name.charAt(i);
            result = result + name.substring(i, i+1);// i ye 1 ekledigimizde excluded i buluyoruz. i en son kac ise ona 1 ekliyor
            //    3, 4 ==> a
            //    2, 3 ==> n
            //    1, 2 ==> n
            //    0, 1 ==> A
        }


        System.out.println(result);

        if (name.equalsIgnoreCase(result)) {
            System.out.println(name + " is palindrome name");
        } else {
            System.out.println(name + " is not palindrome name");
        }







    }

}

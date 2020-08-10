package day41_Inheritance;


import day41_Inheritance.Data;//IT JUST CALL NOT TAKE IT

public class TestData extends Data{

    public static void main(String[] args) {
        //System.out.println(Data.a);//we do not have a variable in TestData class
        //Data.method1();

        //System.out.println(TestData.a);//we do not have a variable in TestData class
        //TestData.method1();//error
        System.out.println(TestData.a);//inheritance makes another copy
                                      //import statement does not make another copy
        TestData.method1();//extend(inheritance) yaptigimiz icin it makes copy


    }

}

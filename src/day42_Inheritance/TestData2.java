package day42_Inheritance;

public class TestData2 extends AccessModifiers{
    /*
publicVariable
protectedVariable
defaultVariable
publicMethod()
protectedMethod()
defaultMethod()
 */


    public static void main(String[] args) {

        System.out.println( TestData2.publicVariable  );
        System.out.println( TestData2.protectedVariable );
        System.out.println( TestData2.defaultVariable );

        TestData2.publicMethod();
        TestData2.protectedMethod();
        TestData2.defaultMethod();

    }



}

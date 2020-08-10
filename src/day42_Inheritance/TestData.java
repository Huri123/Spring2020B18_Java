package day42_Inheritance;
/*
Subclass can inherit public, private and default in the same package.
Subclass can inherit public and private in different packages.
 */
public class TestData extends Data{
/*
    public: accessible at everywhere, visible to the world
    protected: visible in same package, visible in sub class outside package
                protected is always visible to any sub class
    default: only visible in same package
    private: only visible within the same class
 */

/*
public
default
protected
 */

    public static void main(String[] args) {

        System.out.println(TestData.publicData);//those variables are inherited from Data class
        System.out.println(TestData.protectedData);//protected can be inherited regardless of package or class
        System.out.println(TestData.defaultData);
        //System.out.println(TestData.privateData);//private can never be inherited. it is only visible within the same class


    }



}

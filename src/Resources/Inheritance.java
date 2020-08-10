package Resources;

import day42_Inheritance.Data;
/*
    public: accessible at everywhere, visibile to the world
    protected: visible in same package, visible in sub class outside package
                protected is always visible to any sub class
    default: only visible in same package
    private: only visible within the same class
 */

public class Inheritance extends Data {
    //          sub              super

    public static void main(String[] args) {

        System.out.println(Inheritance.publicData);
        System.out.println(Inheritance.protectedData);
        //System.out.println(Inheritance.defaultData);//it is not in the same package
        //System.out.println(Inheritance.privateData);//it is not in the same package and same class
    }

}

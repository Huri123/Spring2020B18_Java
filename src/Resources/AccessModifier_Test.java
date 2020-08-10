package Resources;

import day39_AccessModifiers.AccessModifiers;

public class AccessModifier_Test {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        // System.out.println(obj.defaultAccess); default is only accessible in the same package.this package is resources that is different

        System.out.println(obj.publicAccess); //open to the world

        //    System.out.println( obj.SSN ); // private: only accessible within the same class

    }
}


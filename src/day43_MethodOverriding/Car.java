package day43_MethodOverriding;
/*
to override method:
                     * can be done ONLY in SUB class (==> or it will get compile error)
                     * MUST BE SAME method name, SAME parameter, SAME returnType
                     * CAN NOT have private access modifier ( it will not be inherited)
                     * Access modifier MUST be same or more accessible than the original one
                         default ==> protected ==> public
                     * STATIC can NOT be overridden == only ONE copy for all objects
                     * CONSTRUCTORS can NOT be overridden == it can NOT be inherited
                     * Only INSTANCE methods can be overridden
@Override : identifies if method is overridden or not. Must be applicable.
Only ONE method is created in memory (The one created in Super class).
One method with different functions when we override.
 */
public class Car {

    public void start(){//one method can have multiple functions through override
        System.out.println("Insert the key");
        System.out.println("twist ignition key to start");
    }



}
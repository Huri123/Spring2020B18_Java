package day39_AccessModifiers;

public class CarObjects {
    public static void main(String[] args) {
        //to create object new keyword+Constructor(must be the same the classname)

        Car car1=new Car("Toyota");//this object is not String's object. it is Car's object.So the datatype(en bastaki Car)

        System.out.println(car1);//everytime we print the object, we need to have toString method in the custom method,otherwise it gives hashcode.

        Car car2=new Car("BMW","X6");
        System.out.println(car2);

        Car car3=new Car("Lexus","RX",2020);
        System.out.println(car3);

        Car car4=new Car("Tesla","Model 3",2020,40000);
        System.out.println(car4);
    }
}

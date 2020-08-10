package day37_Constructors;

public class CarObjects {
    public static void main(String[] args) {
        Car car1=new Car("Toyota","Corolla",2020,32000);//sadece 1 constructor oldugu icin onu kullanmaliyiz. o da with argumentli
        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.price);
        System.out.println(car1);

        Car car2=new Car("Mercedes","C300",2018,45000);
        System.out.println(car2);



    }
}

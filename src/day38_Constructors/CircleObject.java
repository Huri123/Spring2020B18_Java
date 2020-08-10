package day38_Constructors;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CircleObject {
    public static void main(String[] args) {
        /*double r=3;
        Circle circle1=new Circle(r);
        double areaOfCircle=circle1.area();
        System.out.println(areaOfCircle);
         */
        DecimalFormat df = new DecimalFormat("0.00");// . dan sonraki kisimlarin sadece 2 basamaklisini alir. yani yuvarlar ve kisaltir
        //yani 28.259999999999998 bunu  28.26 haline getirir
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        double r = scan.nextDouble();

        Circle circle1 = new Circle(r);

        double areaOfCircle = circle1.area();
        System.out.println("Diameter is: " + circle1.diameter);
        System.out.println("Perimeter is: " + circle1.perimeter());
        System.out.println("Area is: " + df.format(areaOfCircle));

    }
}

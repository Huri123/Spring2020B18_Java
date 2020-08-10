package day43_MethodOverriding;

public class Circle extends Shape{ //circle is sub class of shape

    public double radius; //bunu bilince area ve perimeteri hesaplayabiliriz
    public static double PI = 3.14;

    public Circle(double radius){ //object olusturur olusturmaz constructor calistigi icin constructor olusturduk
        this.radius = radius;
    }

    /*
    area , perimeter
    calculateArea & calculatePrimeter
     */


    public void calculateArea(){ //override yaptik
        area = radius * radius * PI;
        System.out.println("Area of the Circle: "+area);
    }

    public void calculatePerimeter(){ //override
        perimeter = radius * 2 * PI;
        System.out.println("Perimeter of the circle: "+perimeter);
    }

}
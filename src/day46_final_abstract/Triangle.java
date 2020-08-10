package day46_final_abstract;

public class Triangle extends Shape{


    public double height;
    public double base;
    public Triangle(double base, double height) {
        this.height=height;
        this.base=base;
    }
    @Override
    void Area() {
        double area= base*height* 1/2;
        System.out.println("Area of the triangle is: " + area);
    }
}

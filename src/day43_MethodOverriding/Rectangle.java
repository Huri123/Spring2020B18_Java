package day43_MethodOverriding;

public class Rectangle extends Shape {
    /*
    inherited:
            area, perimeter
            calculateArea(), calculatePerimeter()
     */

    public double length;
    public double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public void calculateArea(){  //override
        area = length * width;
        System.out.println("Area of the Rectangle: "+area);
    }


    public void calculatePerimeter(){  //override
        perimeter = (width + length)*2;
        System.out.println("Perimeter of the rectangle: "+perimeter);
    }




}
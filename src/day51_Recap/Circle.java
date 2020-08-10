package day51_Recap;

/*
 4. create a final class named circle that can inherit from Shape and PI
                variable: radius
                set a static block that initialize the name to "Circle"
                set a constructor that can initialize the radius

           Area of Circle = PI * radius * radius
            Perimeter of Circle = 2 * radius * PI
 */

public final class Circle extends Shape implements PI { //3 Var

    public double radius;


    public Circle(double radius){
        this.radius = radius;
        name = "Circle";
    }



    @Override
    public double calculateArea() {
        return radius*radius*PI;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * radius * PI;
    }

}
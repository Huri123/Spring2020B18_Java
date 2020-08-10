package day38_Constructors;
/*
Create a class called Circle
            instance variables:
                    radius, pi, diameter
            add a constructor that can initialize the radius of the circle
            instance methods:
                    area(): can return the area of the circle as double
                    perimeter(): cna return the perimeter of the circle as double
                    toString(): returns the info of the circle
            Note: global value of PI is 3.14
                  diameter of circle = 2 * radius
                  area of circle = PI * r * r
                  perimeter:diameter*PI
 */
public class Circle {
   // static double PI=3.14;//pi sayisi degismez o yuzden static
    static double PI; //burda initialize etmezsen asagida static block ta initialize edebilirsin
    double radius;//is the only needed information
    double diameter;

    static {
        PI=3.14;
    }

    public Circle(double radius){ //parantezde diameter no needed
        this.radius=radius;
        diameter=radius*2; //diameter depends on radius
    }
    public double area(){ //methodu static yapamayiz cunku radius instance variable
        return PI*radius*radius;
    }
    public double perimeter(){
        return diameter*PI;
    }
    public String toString(){
        return     "Circles radius: "+radius+
                ", Circles diameter: "+diameter+
                ", Circles area: "+area()+
                ", Circles perimeter: "+perimeter();
    }


}

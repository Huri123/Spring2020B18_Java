package day43_MethodOverriding;

/*
	1. create a class called Shape
						vairables: area, perimeter
						methods: calculateArea(), calculatePerimeter()
 */
public class Shape {

    public double area;
    public double perimeter;

    protected void calculateArea(){
        area = 0;//hic bir sey (hangi shape) gibi bilmedigimiz icin 0 verdik
        System.out.println("Area of the shape: "+area);
    }

    public void calculatePerimeter(){
        perimeter = 0;//we set 0. because we do not know any information yet
        System.out.println("Perimeter of the shape: "+perimeter);
    }


}


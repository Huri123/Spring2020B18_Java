package day46_final_abstract;
//bu abstract degil. abstract olan class tan obj olusturamayiz
public class Square extends Shape{

public double side;

public Square(double side){
    this.side=side;
}

public void Area(){ //we override the Area method. because Area is abstract in the Shape class
    double area=side*side;
    System.out.println("Area of square: "+area);
}



}

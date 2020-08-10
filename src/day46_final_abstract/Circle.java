package day46_final_abstract;
//bu abstract degil. abstract olan class tan obj olusturamayiz
public class Circle extends Shape {//Shape deki methodu override yapmazsak hata verir.abstract i kaldirmamiz lazim

    public double radius;
    public final static double PI = 3.14;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    //void Area(){ Access modifier default yada protected da olabilirdi
    public void Area() { //Shape deki Area methodunu override yaptik. abstract ini cikardik
        //boylece error vermiyor artik

        double area=radius*radius*PI;
        System.out.println("Area is: "+area);

    }
}



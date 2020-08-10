package day46_final_abstract;

public class Rectangle extends Shape{//burayi extends yapmazsak da ayni sonucu verir.
                                    // ama method ayni degil ayri bir method olusturmus olur.
                                    // extends yaparak tek bir methodu override yaparak kullanmis oluyoruz
                                    //Rectangle class i abstract yapmadik. cunku abstract yapinca Rectangle class tan
                                    //object olusturamayiz.
    public double width;
    public double length;

    public Rectangle(double width,double length){//Area yi hesaplamak icin width ve length ye ihtiyac var o yuzden constructor olusturduk
        this.width=width;
        this.length=length;
    }

    @Override
    public void Area() {
     double area= width*length;
        System.out.println("Area of rectangle: "+area);
    }
}

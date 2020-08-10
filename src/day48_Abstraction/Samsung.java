package day48_Abstraction;

public class Samsung extends Phone{

    static {
        brand = "Samsung"; //Boyle yapinca sadece bir kere calisacak.static oldugu icin birden fazla calismasina gerek yok
    }
    public Samsung(String model, double price, String size) { //model,price ve size degisebilir.O yuzden kullanicidan onlari girmesini istedik.
        //brand = "iPhone"; //Tum telefonlarin brandi Samsung olacak.//boyle yapmadik cunku contructor kac kere(ex:10 kere) calisirsa o kadar brand de calisacak. buna gerek yok.
        this.model = model;
        this.price = price;
        this.size = size;
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Samsung is calling "+phoneNumber);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Samsung is texting "+phoneNumber);
    }

    public void freezing(){
        System.out.println("Samsung is freezing  when using ");
    }


}



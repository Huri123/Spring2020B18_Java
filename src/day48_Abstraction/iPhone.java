package day48_Abstraction;

public class iPhone extends Phone {

    static {
        brand = "iPhone"; //Tum telefonlarin brandi iPhone olacak.
    }
    public iPhone(String model, double price, String size) { //model,price ve size degisebilir.O yuzden kullanicidan onlari girmesini istedik.
        //brand = "iPhone"; //Tum telefonlarin brandi iPhone olacak.
        this.model = model;
        this.price = price;
        this.size = size;
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("iPhone is calling " + phoneNumber);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("iPhone is texting " + phoneNumber);
    }

    public void faceTiming(long phoneNumber) {
        System.out.println("iPhone is facetiming with " + phoneNumber);
    }
}

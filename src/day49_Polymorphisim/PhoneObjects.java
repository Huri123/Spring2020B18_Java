package day49_Polymorphisim;

public class PhoneObjects {
    public static void main(String[] args) {
        iPhone phone1 = new iPhone("iPhone X Pro", 1000.50, "10 inches");
        System.out.println(phone1);
        phone1.calling(911);
        phone1.texting(911);
        phone1.faceTiming(911);
        phone1.download();


    }

}
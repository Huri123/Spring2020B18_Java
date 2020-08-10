package day48_Abstraction;

public class phoneObjects {
    public static void main(String[] args) {
        iPhone iphone1=new iPhone("X",1000,"10 inches");
        iPhone iphone2=new iPhone("8",900,"8 inches");

        System.out.println(iphone1);
        System.out.println(iphone2);

        iphone1.faceTiming(123456);
        iphone1.calling(911);
        iphone1.texting(987456);
        //iphone1.freezing();//error, cunku bu method Samsung classa ait

        Samsung samsung1=new Samsung("Note10 Plus",1200,"Large");

        System.out.println(samsung1);

        samsung1.freezing();
        samsung1.calling(123456);
        samsung1.texting(123456);
        //samsung1.facetiming(123456);//error, cunku bu method iPhone classa ait
    }
}

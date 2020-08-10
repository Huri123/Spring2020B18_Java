package MyWarmUps;

/*
Task02:
    1. create an interface named downloadable:
            variable: boolean downloadable
            abstract method: download();
    1. create an interface named AndroidApps that can inherit from downloadable interface
            variable: AppStoreName

    2. create an interface named AppleApps that can inherit from downloadable interface
            variable: AppStoreName
    3. create an abstract class named Phone
            variables: brand, model, price, size
            abstract methods: texting(), calling()
    4. create a class named iPhone that can inherit from AppleApps interface
            actions that every iphone can do: texting(), calling(), faceTiming(), selfie()
    5. create a class named Nokia that can inherit from AndroidApps interface
            actions that Nokia can do: texting(), calling(), freezing(), breakTheFloor()
    in each sub classes of phone, create a constructor to initialize the instances
 */
public class _2Interface06_10_2020 {
}
/*
1. create an interface named downloadable:
            variable: boolean downloadable
            abstract method: download();
 */
interface downloadable {
     boolean downloadable = true; //by default final,so we need to initialize right away.

     void download();
}
/*
1. create an interface named AndroidApps that can inherit from downloadable interface
            variable: AppStoreName
 */
interface AndroidApps extends downloadable { //sadece class implements yapar
    String AppStoreName = "Android store";
}
/*
2. create an interface named AppleApps that can inherit from downloadable interface
            variable: AppStoreName
 */
interface AppleApps extends downloadable { //sadece class implements yapar
    String AppStoreName = "Apple store";//by default it is public,static,final,so we need to initialize
}
//3. create an abstract class named Phone
//            variables: brand, model, price, size
//            abstract methods: texting(), calling()
abstract class Phone{
    static String brand; //static cunku tum ipone brandi ayni vs.
    String model;
    String size;
    double price;
    abstract void texting(long phoneNumber); //texting icin phone number lazim
    abstract void calling(long phoneNumber);

    public String toString(){
        return "brand='" + brand + ", model='" + model + ", price=" + price + ", size='" + size;
    }
}
// 4. create a class named iPhone that can inherit from AppleApps interface
// actions that every iphone can do: texting(), calling(), faceTiming(), selfie()
class iPhone implements  AppleApps{
    public String brand;
   public String model;
    public String size;
    double price;
   void texting(){}
     void calling(){}
    void faceTiming(){}
    void selfie(){}
    public void download(){}
}
// 5. create a class named Nokia that can inherit from AndroidApps interface
// actions that Nokia can do: texting(), calling(), freezing(), breakTheFloor()
// in each sub classes of phone, create a constructor to initialize the instances
class Nokia implements AndroidApps{
    public void download(){}
}

package day37_Constructors;

//every single class must have constructor
//when we don't create constructor, compiler will create default constructor(no arg constructor)
public class ConstructorIntro {
    //public method(){} //error verir. constructor name must be same with the className

    //constructor with argument
    public ConstructorIntro(int a){//Bu bir constructor.biz olusturduk. olusturmasaydik da compiler kendi olusturacakti
                                //ama biz goremeyecektik.
        System.out.println("Constructor with parameter of int");
    }

    public static void main(String[] args) {

        //ConstructorIntro obj = new ConstructorIntro();// error verir cunku object must be created with existing constructor
        ConstructorIntro obj2 = new ConstructorIntro(10);//a=10 da olur 20 de farketmez

        ConstructorIntro obj3 = new ConstructorIntro(10);

    }


}
/*
// every class must have a constructer !!!!!1
    //constructer must have every single classss!!!
    //special constructur methodunu takip etmemmiz lazim
    //when you declare constructer you can break this rule !! constructer name must be same with the class name
    // constructer kesinlikle sinif adiyla ayni olmali en onemli kural  bu!!!
    // her class da constructer olmak zorunda  eger olusturmazsan compiler senin icin olurturacaktir ama no-args olarak
    //no return types or specidiers
  //  public method() {} // class ismi ile ayni olmadigi icin hata verdi buda burda kalsin bakalim
    public Constructer_Intro(int a){  // constructer class bu sekilde olusuyor, class ismi ile acmamiz lazim aksi halede hata verecek
     // constructer icinde (int a ) gibi pramater kullanacaksak asagida icine sadece return degerini girebiliriz int ise rakam char ise karakter gibi
        System.out.println("constructer with argument of int");
    }
    public static void main(String[] args) {
    //    Constructer_Intro     obj=              new      Constructer_Intro(); //object must be created with existing constructer
    //   class name        object name       keyword      Constructer
        Constructer_Intro obj2= new Constructer_Intro(10);  // yukarida hata verdi ama deger atayinca compile oldu!
        Constructer_Intro obj3= new Constructer_Intro(10); // ne kadar atarsak o kadar print edecek / execute olacak
 */

// if we do not have parameters it is default constructor given by the class
    /*
    Constructor da bir method'dur ama Class ismiyle cagrilabilen ozel bir methoddur.
   Eger kendimiz Constructor olusturuyorsak objecti de ona gore olusturmamiz lazim.
   Constructorda Parameter varsa  Objecte de parameter olmali.
   Constructorun execution'u objectin olusumuna baglidir.
     */
// public method(){}  // Constructor Name MUST be same with class name


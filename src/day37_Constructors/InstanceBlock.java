package day37_Constructors;

/*
   Static Variable objectle cagrila biliyor ama en son ne initialize olduysa o kaliyor.
   Yani iki object varsa ve ilk 10 inialize olduysa sonra 20 olduysa, hep 20 kalacak.
  Iki kere 2 ayri objectle(obj1,obj2)  print de etsek 20 cikacak.
                      //   20,  20
   Instanse ise her objectin kendi kopyasi var. Yani once 10 sonra 2. objectle 20 initialize ettiysek
   iki kere 2 ayri objectle(obj1,obj2) print edince once 10 sonra 20 cikacak.
                        //   10,  20
    Instance variable eger sonradan bir objectle initialize etmesek default value olarak
     en basta verdigimiz value'yu alacaktir.
     static ise en son ne inialize olduysa o kalacak hepppp
    ****instance bloku execute edebilmek icin object olusturmak zorunlu. Ve eger 2 object olusturursak
    instance block 2 kere print olur. execution depends on object.
    *** Ama static block sadece 1 kere execute oluyor.
    // INSTANCE block will get executed as many times as many objects we create.
// every object we create will have it run one time. Times = number of objects
// but if we have a static block ==> it will get executed only ONCE
    */
public class InstanceBlock {

   {
        System.out.println("Instance block1");
    }

    public static void main(String[] args) {
        InstanceBlock obj = new InstanceBlock();
        InstanceBlock obj2 = new InstanceBlock();//2 tane obj olusturdugumuz icin 2 kere Instance block yazar.
    }

    static {
        System.out.println("static block");//1 kere calisir
    }

    {
        System.out.println("Instance block2");
    }


  /*
  Muhtar'in kodlari
   {

       System.out.println("Instance block1");
   }

    public static void main(String[] args) {
        InstanceBlock obj = new InstanceBlock();

        InstanceBlock obj2 = new InstanceBlock();

    }

    static{
        System.out.println("static block");
    }

   */




}

package day50_polymorphism;

public class Encapsulation {
    private String username = "MIT"; //burayi final yaparsan setter da hata verir. cunku final is not be reassigned.

    /*
    private String getUsername(){ //getter setter needs to be public. logical error. yani private yaparsan yine ulasamazsin
        return "123"; //bu gecersiz bu methodu cagirdiginda 123 gelecek
    }
     */
    public String getUsername() { //static olmaz. Cunku static only accepts static.
        return username; //return u username yaptik reusable olsun diye. MIT yapmadik.
    }

    public void setUsername(String username) { //datatype(String) ayni olmali. yani burayi long yapamazsin
        this.username = username; //in order to call the instance variable,you need to use this. keyword.
    }
}

class Test {
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        //System.out.println(obj.username); //getter olmazsa read yapamaz. error verir cunku variable private
        System.out.println(obj.getUsername());

        //obj.username = "Cybertek"; //error cunku setter olmazsa boyle modify yapamayiz //private oldugu icin directly ulasamayiz.obj.setUsername() olmali
        obj.setUsername("Cybertek"); //We changed username as "Cybertek"

        System.out.println(obj.getUsername());
    }
}

/*
Muhtar'in kodlari:
public class Encapsulation {

     private String username = "MIT";

     public String getUsername(){
         return username;
     }

     public void setUsername(String username){
         this.username = username;
     }

}


class Test{
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
      //  System.out.println( obj.username );
        System.out.println( obj.getUsername() );

       // obj.username ="Cybertek";
        obj.setUsername("Cybertek");

        System.out.println(  obj.getUsername()  );

    }
}
 */

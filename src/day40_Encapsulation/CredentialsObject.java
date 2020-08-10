package day40_Encapsulation;

public class CredentialsObject {
    public static void main(String[] args) {

        Credentials Annafacebook = new Credentials();

        //setter methodu void oldugu icin sout print yapamiyoruz
        System.out.println(Annafacebook.getUsername());
        System.out.println(Annafacebook.getPassword());

        Annafacebook.setUsername("A.paulura");
        Annafacebook.setPassword("123456");

        System.out.println(Annafacebook.getUsername());
        System.out.println(Annafacebook.getPassword());//pasword u saklamak istiyorsak get password return e ****** yazabilirsin yada 1*****5
    }
}

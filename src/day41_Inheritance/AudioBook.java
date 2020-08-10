package day41_Inheritance;
public class AudioBook extends Book{
    /*
    title (inherited)
    author (inherited)
    price (inherited)

    length
    listen()

    toString() (inherited)
     */

String length;//hour minutes character kullanacagimiz icin string yaptik

    public void listen(){
        System.out.println("Listening to "+title);
    }


}

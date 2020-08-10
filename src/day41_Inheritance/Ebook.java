package day41_Inheritance;

public class Ebook extends Book {
    /*
    title (inherited)
    author (inherited)
    price (inherited)
    toString() (inherited)

    size (declared)
    pages (declared)
    readBook() (declared)
    toString (inherited)
     */
    public String size;// character kullanacagimiz icin string yaptik
    public int pages;

    public void readBook() {
        System.out.println("reading " + title);
    }
}

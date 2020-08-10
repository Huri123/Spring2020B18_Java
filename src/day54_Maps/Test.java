package day54_Maps;

public class Test {

    public static void main(String[] args) {

        Color myFavoriteColor1 = Color.Blue;
        Color myFavoriteColor2 = Color.Red;
        Color myFavoriteColor3 = Color.Green;
        //Color myFavoriteColor = Color.Yellow; //error fixed set of constant. yani not changeable.fixed. 3 renk var orda not yellow
        //Color myFavoriteColor = Color.White; //error

        //We can not assign other than these 3 colors(Red,Green,Blue)

        System.out.println(myFavoriteColor1);

        Browsers browserName = Browsers.Chrome;

        System.out.println(browserName);


    }

}

/*
Muhtar'in Kodlari:

public class Test {

    public static void main(String[] args) {
        Color myFaveColor1 = Color.Blue;
      //  Color myFaveColor2 = Color.Yellow;
      //  Color myFaveColor3 = Color.White;

        System.out.println( myFaveColor1 );


        Browsers browseName = Browsers.Chrome;

        System.out.println(browseName);


    }
}
 */

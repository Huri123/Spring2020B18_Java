package day44_Exceptions;

/*
warmUp task:
	1. create a class called Browsers
			actions: openBrowser(): opens the default browser
					 closeBrowser(): closes the default browser
	2. create a class called ChromeBrowser
			actions: openBrowser(): opens the chrome browser
					 closeBrowser(): closes the chrome browser
	3. creata a class called FirefoxBrowser
			actions: openBrowser(): opens the Firefox browser
					 closeBrowser(): closes the Firefox browser
	4. create a class called Opera browser
			actions: openBrowser(): opens the Opera browser
					 closeBrowser(): closes the Opera browser
	5. create a class called Test:
			create an object of each browsers and call the openBrowser & closeBrowser actions
 */
public class Browsers {
    public void openBrowser() {
        System.out.println("Opening the default browser");
    }

    public void closeBrowser() {
        System.out.println("Closing the default browser");
    }
}

class ChromeBrowser extends Browsers {

    /*
   openBrowser()
   closeBrowser()
    */

    @Override
    public void openBrowser() {
        System.out.println("Opening the Chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Chrome browser");
    }

}

class FirefoxBrowser extends Browsers {
    //buraya hic method yada herhangi birsey yazmazsak browser i extend yaptigi
    //icin ordaki methodu calistirir.Yani "Opening the default browser"
    // ve "Closing the default browser"yazdirir.

    @Override
    public void openBrowser() {
        System.out.println("Opening the Firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Firefox browser");
    }
}

class Test {
    public static void main(String[] args) {
        ChromeBrowser obj = new ChromeBrowser();
        obj.openBrowser();
        obj.closeBrowser();

        System.out.println("=====================================");

        FirefoxBrowser obj2 = new FirefoxBrowser();
        obj2.openBrowser();
        obj2.closeBrowser();


    }
}


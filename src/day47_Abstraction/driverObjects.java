package day47_Abstraction;

public class driverObjects {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();

        System.out.println("================================");
        FirefoxDriver driver2 = new FirefoxDriver();
        driver2.get("https://www.google.com");
        driver2.quit();

        System.out.println("==================================");
        OperaDriver driver3 = new OperaDriver();
        driver3.get("https://www.google.com");
        driver3.quit();



    }

}
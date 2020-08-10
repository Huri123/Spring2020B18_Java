package day47_Abstraction;

    /*
    Task03:
        1. create an abstract class called Browser
                    attribues: browserName
                    methods:
                            abstract methods: get(URL), close(), maximize();
        2. creata three sub classes of Browser:
                                1. ChromeBrowser
                                2. FireFoxBrowser
                                3. OperaBrowser
                        each class MUST have constructors to initialize the attributes
                        each actions should ONLY be applicable to the object it's called from
                    Ex:
                        chrome.get("https://www.google.com")
                        output should be: chrome browse is opening https://www.google.com
                                    (it should not open the URL in different browser other than chrome)
 */
    public abstract class BrowserKendiYaptigim {

        public String browserName;
        public abstract void get(String url);
        public abstract void close();
        public abstract void maximize();

    }
    class ChromeBrowser extends BrowserKendiYaptigim {

        public ChromeBrowser(String browserName) {
            this.browserName = browserName;
        }
        public void get(String url) {
            System.out.println(browserName + " is opening " + url);
        }
        public void close() {
            System.out.println(browserName + " is closing!");
        }
        public void maximize() {
            System.out.println(browserName + " is maximized!");
        }
    }
    class FireFoxBrowser extends BrowserKendiYaptigim {

        public FireFoxBrowser(String browserName) {
            this.browserName = browserName;
        }
        public void get(String url) {
            System.out.println(browserName + " is opening " + url);
        }
        public void close() {
            System.out.println(browserName + " is closing!");
        }
        public void maximize() {
            System.out.println(browserName + " is maximized!");
        }
    }
    class OperaBrowser extends BrowserKendiYaptigim {

        public OperaBrowser(String browserName) {
            this.browserName = browserName;
        }
        public void get(String url) {
            System.out.println(browserName + " is opening " + url);
        }
        public void close() {
            System.out.println(browserName + " is closing!");
        }
        public void maximize() {
            System.out.println(browserName + " is maximized!");
        }
    }
    class BrowserObjects {

        public static void main(String[] args) {

            ChromeBrowser chrome = new ChromeBrowser("Chrome browser");
            chrome.get("https://www.google.com");
            chrome.maximize();
            chrome.close();
            FireFoxBrowser fireFox=new FireFoxBrowser("Firefox browser");
            fireFox.get("https://www.firefox.com");
            fireFox.maximize();
            fireFox.close();
            OperaBrowser opera=new OperaBrowser("Opera browser");
            opera.get("https://www.opera.com");
            opera.maximize();
            opera.close();
        }
    }


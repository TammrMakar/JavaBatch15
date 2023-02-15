package Class23;

public class WebDriverTester {
    public static void main(String[] args) {

        WebDriver webDriver=new Chrome();//up casting
        //FireFox firefox=new WebDriver();//down casting
        webDriver.startBrowser();
        webDriver.openURL();
        webDriver.testLoginPage();
        webDriver.closeBrowser();

        WebDriver webDriver1=new Safari();
        webDriver1.startBrowser();
        webDriver1.openURL();
        webDriver1.testLoginPage();
        webDriver1.closeBrowser();

        //an Array of type parent class can hold the objects of all the child classes

       /* Chrome chrome=new Chrome();
        FireFox fireFox=new FireFox();
        Safari safari=new Safari();

        WebDriver[]browsers={chrome,fireFox,safari};*/
        WebDriver[]browsers={new Chrome(),new Safari(),new FireFox()};

        for (WebDriver browser:browsers){
            browser.startBrowser();
            browser.openURL();
            browser.testLoginPage();
            browser.closeBrowser();

        }
    }
}

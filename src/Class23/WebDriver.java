package Class23;

public class WebDriver {

public void startBrowser(){System.out.println("starting the browser");}
public void openURL(){System.out.println("opening a url");}
public void testLoginPage(){System.out.println("checking if login page works");}
public void closeBrowser(){System.out.println("closing the browser");}
}
class Chrome extends WebDriver {

    @Override
    public void startBrowser() {
        System.out.println("Starting google chrome");
    }
    @Override
    public void openURL() {
        System.out.println("Opening the url in google chrome");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page in chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the google chrome");
    }
}
class Safari extends WebDriver{

    public void startBrowser() {
        System.out.println("Starting safari browser");
    }
    @Override
    public void openURL() {
        System.out.println("Opening the url in safari ");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page in safari");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the safari");
    }
}
class FireFox extends WebDriver{

    @Override
    public void startBrowser() {
        System.out.println("Starting firefox browser");
    }

    @Override
    public void openURL() {
        System.out.println("Opening the url in firefox");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page in firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the firefox");
    }
}




package Class24;

public class Task1 {

    //Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    //Define common behavior within and some fields in parent class and override some of the methods in child classes
    //Define some methods specific to child classes
    //Create objects of child classes and store them into array. Loop through each object and execute available methods.
    public static void main(String[] args) {
        //int a=(int)12.5;
        Computer[]computers={new Apple() ,new Computer()};

        for(Computer c:computers){
            c.playVideo();
            c.browserInternet();

            if(c instanceof Apple){//we are checking if the variable c contains the object of an apple class
                Apple apple=(Apple)c;//converting the variable c back to an apple object
                apple.installApp();
                apple.editVideos();
            }
        }
    }
}

class Computer{

    int Ram;
    int Storage;
    String os;

    void playVideo(){
        System.out.println("video is playing");
    }
void browserInternet(){
    System.out.println("Browse the internet");
}
}

class Apple extends Computer{

    @Override
    void playVideo() {
        System.out.println("playing the video on Quicktime player");
    }

    @Override
    void browserInternet() {
        System.out.println("Using the safari browser");
    }

    void editVideos(){
        System.out.println("Editing on iMovies");
    }
    void installApp(){
        System.out.println("installing the apps from app store");
    }
}
class HP extends Computer{

    @Override
    void browserInternet() {
        System.out.println("Using the google chrome");
    }
    @Override
    void playVideo() {
        System.out.println("playing the video using VLC player");
    }
    void installApps(){
        System.out.println("You can install any app");
    }
}


package Class24;

public abstract class Phone {

    /*create a phone class lets create abstract methods like displayPictures
   unlockPhone
   SendText
   2 child classes iphone Samsung Google and provide specific implementation
     */

   abstract void displayPictures();

   abstract void unlockPhone();

   abstract void SendText();
}

class Iphone extends Phone{

    @Override
    void displayPictures() {
        System.out.println("Iphotos to browse the pictures");
    }

    @Override
    void unlockPhone() {
        System.out.println("FaceId to unlock the iPhone");
    }

    @Override
    void SendText() {
        System.out.println("lets use Imessage to send messages");
    }
}
class Samsung extends Phone{

    @Override
    void displayPictures() {
        System.out.println("Using fingerprint sensor or camera");
    }

    @Override
    void unlockPhone() {
        System.out.println("unlocking Samsung");
    }

    @Override
    void SendText() {
        System.out.println("messages app to send the message");
    }
}
class Google extends Phone{

    @Override
    void displayPictures() {
        System.out.println("displaying pictures on Google");
    }

    @Override
    void unlockPhone() {
        System.out.println("unlocking Google");
    }

    @Override
    void SendText() {
        System.out.println("sending text from Google");
    }
}
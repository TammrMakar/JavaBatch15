package Class24;

public class PhoneTester {
    public static void main(String[] args) {

        Phone[]phones={new Iphone(),new Samsung(),new Google()};

        for(Phone po:phones){
            po.displayPictures();
            po.unlockPhone();
            po.SendText();
        }



    }


    }


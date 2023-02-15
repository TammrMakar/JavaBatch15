package Class25;

interface WashAble{

    void wash();

}
public class SmartWatch implements WashAble{
    @Override
    public void wash(){
        System.out.println("You can wash this smartwatch without any issues");
    }
}
class Phone implements WashAble {

   public void wash(){
       System.out.println("Press the power button to turn me on");
    }
}

class Inverter implements WashAble{

   public  void wash(){
        System.out.println("Press the power button to turn me on");
    }
}
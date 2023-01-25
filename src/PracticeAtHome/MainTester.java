package PracticeAtHome;

public class MainTester {
    public static void main(String[] args) {


        Main car=new Main();

        car.carmake="BMW";
        car.caryear=2019;
        car.carcolor="black";

     Main car1=new Main();
        car1.carmake="BMW";
        car1.caryear=2019;
        car1.carcolor="black";

        System.out.println("car color is"+car.carcolor+"and car year is "+car.caryear+" and car model is "+car.carmake);
        System.out.println("car color is"+car1.carcolor+"and car year is "+car1.caryear+" and car model is "+car1.carmake);
    }
}

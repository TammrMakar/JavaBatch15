package Class12;

public class CarTester {
    public static void main(String[] args) {
        //Create the object of the class

        Car bmw=new Car();
        bmw.make="BMW";
        bmw.model="I7";
        bmw.year=2023;
        bmw.color="Gray";
        bmw.moveForward();
        bmw.applyBrakes();

      //Create two classes of your choice and call the methods from those classes

   Car audi=new Car();
    audi.model="E-tron";
    audi.make="Audi";
    audi.year=2022;
    audi.color="black";
    audi.applyBrakes();
    audi.moveForward();

    }


    
    }


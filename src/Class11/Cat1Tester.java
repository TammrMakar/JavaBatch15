package Class11;

public class Cat1Tester {
    public static void main(String[] args) {

        Cat1 cat1=new Cat1();
        cat1.name="Lego";
        cat1.breed="Van cat";
        cat1.age=2;
        cat1.color="Gray";
        cat1.attitude=false;
        cat1.eat();



        Cat1 cat2=new Cat1();
        cat2.name="Loki";
        cat2.breed="Domestic";
        cat1.color="White";
        cat1.speak();

        System.out.println(cat2.breed);
        cat1.speak();
    }
}

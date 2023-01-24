package Class11;

public class CatTester {
    public static void main(String[] args) {

        Cat cat1=new Cat();
        cat1.name="Lego";
        cat1.breed="Van cat";
        cat1.age=2;
        cat1.color="Gray";
        cat1.attitude=false;
        cat1.eat();



        Cat cat2=new Cat();
        cat2.name="Loki";
        cat2.breed="Domestic";
        cat1.color="White";
        cat1.speak();

        System.out.println(cat2.breed);
    }
}

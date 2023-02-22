package Class25;

public class Tester {
    public static void main(String[] args) {
        OwnAble []ownAbles={new Dog(),new Car()};

        for (OwnAble ownAble: ownAbles){
            ownAble.own();
        }
    }
}

package Class12.PracticeAtHome;

public class MainTester88 {
    public static void main(String[] args) {

        Main88 husky=new Main88();
        husky.name1="Husky";

        Main88 Bulldog=new Main88();
        Bulldog.name2="Bulldog";

        Main88 Labrador=new Main88();
        Labrador.name3="Labrador";

        System.out.print(husky.name1+" ");
        husky.bark();
        System.out.print(husky.name1+" ");
        husky.run();
        System.out.print(husky.name1+" ");
        husky.play();
        System.out.print(Bulldog.name2+" ");
        Bulldog.bark();
        System.out.print(Bulldog.name2+" ");
        Bulldog.run();
        System.out.print(Bulldog.name2+" ");
        Bulldog.play();
        System.out.print(Labrador.name3+" ");
        Labrador.bark();
        System.out.print(Labrador.name3+" ");
        Labrador.run();
        System.out.print(Labrador.name3+" ");
        Labrador.play();
        System.out.println();
    }
}
package Class21;

public class Animal {

    String name;
    String color = "Black";
}
    class Cat extends Animal {

       // String color = "White";
        int age = 10;
        double weight;

        void printColor() {
           // String color = "blue";
            System.out.println(color);          //color in the same class
            System.out.println(this.color);     //color in child class
            System.out.println(super.color);    //color in parent class
        }
    }





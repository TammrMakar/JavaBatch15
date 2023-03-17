package class29;

import java.util.LinkedHashSet;

public class SetDemo2 {
    public static void main(String[] args) {


        //does not allow duplicates
        LinkedHashSet<String> fruit=new LinkedHashSet<>();
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Mango");
        fruit.add("Apple");
        System.out.println(fruit);

    }
}

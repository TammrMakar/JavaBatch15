package Class28;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo3 {
    public static void main(String[] args) {


        //linked => 160 ms
        //Arraylist =>67285

      long startTime=System.currentTimeMillis();
        ArrayList<String> numbers=new ArrayList<>();
        for (int i = 0; i <1000000 ; i++) {
            numbers.add(0,"Test Data");

        }

        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);


    }
}

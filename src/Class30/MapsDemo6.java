package Class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsDemo6 {
    public static void main(String[] args) {

        Map<Integer,String> studentsMap=new HashMap<>();
        studentsMap.put(1,"Nazir");
        studentsMap.put(2,"Peter");
        studentsMap.put(3,"Tamer");
        studentsMap.put(4,"Rania");
        studentsMap.put(5,"Rania");
        studentsMap.put(6,"Rania");
        studentsMap.put(7,"Rania");


        Collection<String> values=studentsMap.values();
        System.out.println(values);
    // remove all values which contain the letter i





    }
}

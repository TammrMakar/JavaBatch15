package Class30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsDemo5 {
    public static void main(String[] args) {


        Map<Integer,String> studentsMap=new HashMap<>();
        studentsMap.put(1,"Nazir");
        studentsMap.put(2,"Peter");
        studentsMap.put(3,"Tamer");
        studentsMap.put(4,"Rania");
        studentsMap.put(5,"Rania");
        studentsMap.put(6,"Rania");
        studentsMap.put(7,"Rania");

        //remove all the keys from above map if they are greater than 2
        Set< Integer> Keys=studentsMap.keySet();
        System.out.println(Keys);

        Keys.removeIf(x->x>2);
        System.out.println(Keys);
        System.out.println(studentsMap);
    }
    }


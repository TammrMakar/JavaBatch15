package Class30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapsDemo7 {
    public static void main(String[] args) {

        Map<Integer, String> studentsMap = new HashMap<>();
        studentsMap.put(1, "Nazir");
        studentsMap.put(2, "Peter");
        studentsMap.put(3, "Tamer");
        studentsMap.put(4, "Rania");
        studentsMap.put(5, "Timmy");
        studentsMap.put(6, "Tommy");
        studentsMap.put(7, "Diana");

        //remove the entries if key is greater than 2 and value contains the letter

        Set<Entry<Integer, String>> entrySet = studentsMap.entrySet();

        for (Entry<Integer, String> entry : entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }
       entrySet.removeIf(x->x.getKey()>2 &&x.getValue().contains("i"));
        System.out.println(studentsMap);

    }
}
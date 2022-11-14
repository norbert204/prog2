import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.List;

public class Szótár {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("a", "alfa");
        map.put("b", "beta");
        map.put("c", "gamma");
        
        System.out.println(map);

        System.out.println(map.get("a"));
        System.out.println(map.get("x"));

        //map.get("x").toCharArray();
        System.out.println(map.getOrDefault("x", "Nincs benne"));

        //map.put("x", "ALFA");
        map.replace("a", "ALFA");
        System.out.println(map);

        //Set<String> keys = map.keySet();

        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println(map.size());

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(2, "two");
        map1.put(1, "egy");
        map1.put(0, "zero");
        map1.put(3, "three");

        /*for (Entry e : map1.entrySet()) {
            System.out.printf("Kulcs=%d, Érték=%s\n", e.getKey(), e.getValue());
        }*/

        /*
        
        NEM KELL!!

        Set<Integer> keysSet = new HashSet<>(map1.keySet());
        List<Integer> keys = new ArrayList<>(keysSet);
        Collections.sort(keys);

        for (int i : keys) {
            System.out.printf("Key: %d, Value: %s\n", i, map1.get(i));
        }*/
    }
}

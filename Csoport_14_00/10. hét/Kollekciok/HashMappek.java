import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

public class HashMappek {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "alfa");
        map.put("b", "beta");
        map.put("c", "gamma");
        map.put("d", "delta");
        map.put("e", "alfa");

        //map.put("a", "ALFA");

        map.replace("x", "XALFA");

        System.out.println(map);


        System.out.println(map.get("b"));
        System.out.println(map.getOrDefault("x", "Nem létezik"));

        Map<Integer, Double> numMap = new HashMap<>();
        numMap.put(3, 3.14);
        numMap.put(4, 2.0);

        System.out.println(numMap.getOrDefault(5, 0.0));

        System.out.println(map.containsKey("a"));
        System.out.println(map.containsValue("alfa"));


        System.out.println(map.keySet());
        System.out.println(map.values());

        for (Entry e : map.entrySet()) {
            System.out.printf("Key=%s, Value=%s\n", e.getKey(), e.getValue());
        }

        System.out.println(map.size());
    }
}

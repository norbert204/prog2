import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        
        array.add(32);
        array.add(13);
        array.add(54);

        System.out.println(array);

        for (int i : array) {
            System.out.println(i);
        }

        System.out.println(array);
        Collections.sort(array);
        System.out.println(array);

        array.remove(0);
        System.out.println(array);

        System.out.println(array.get(1));
        

        array.clear();
        System.out.println(array);
        
        
        array.add(32);
        array.add(13);
        array.add(54);

        System.out.println(array.size());
        System.out.println(array.get(array.size() - 1));

        System.out.println(array.isEmpty());
        array.clear();
        System.out.println(array.isEmpty());


        String[] stringArray = { "hello", "szia", "hogy vagy" };
        List<String> list2 = new ArrayList<>(List.of(stringArray));
        System.out.println(list2);

        array.add(32);

        List<Integer> result = gimmeList(array);
        System.out.println(array);
        System.out.println(result);
    }

    public static List<Integer> gimmeList(List<Integer> paramList) {
        List<Integer> list = new ArrayList<>();
        list.addAll(paramList);
        list.add(12);
        return list;
    }
}
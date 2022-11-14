import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Halmaz {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(List.of(1, 2, 2, 4));
        System.out.println(set);

        /*set.add(5);
        set.remove(1);
        System.out.println(set.contains(1));*/

        //set.remove(2);
        //System.out.println(set.contains(2));

        System.out.println(set.size());

        Set<Integer> set2 = new HashSet<>(List.of(2, 5, 7));

        //set.addAll(set2);       //  Unió
        //set.retainAll(set2);    //  Metszet
        //set.removeAll(set2);    //  Különbség/Kivonás
        //System.out.println(set);

        List<Integer> lista = new ArrayList<>(set);
        System.out.println(lista);

        lista.add(2);

        Set<Integer> set3 = new HashSet<>(lista);
        System.out.println(set3);

        for (int i : set) {
            System.out.println(i);
        }

        for (int i = 0; i < 100; i++) {
            set.add(i);
        }
        System.out.println(set);
    }
}
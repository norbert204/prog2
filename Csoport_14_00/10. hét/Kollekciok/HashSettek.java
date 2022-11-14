import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class HashSettek {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(List.of(1, 2, 2, 3));

        System.out.println(lista);

        Set<Integer> set = new HashSet<>(lista);
        System.out.println(set);
        /*set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);
        set.add(4);

        set.remove(3);
        System.out.println(set.contains(1));
        System.out.println(set.size());*/

        Set<Integer> set2 = new HashSet<>(List.of(2, 4, 9));

        //set.addAll(set2);     // Unio
        //set.retainAll(set2);  // Metszet
        //set.removeAll(set2);  // Kivonás
        System.out.println(set);


        List<Integer> lista2 = new ArrayList<>(set);
        System.out.println(lista2);

        for(int i : set) {
            System.out.println(i);
        }

        for (int i = 0; i < 100; i++) {
            set.add(i);
        }

        System.out.println(set);
    }
}

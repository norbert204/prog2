import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();

        lista.add(32);
        lista.add(12);
        lista.add(46);

        System.out.println(lista);

        lista.remove(1);

        System.out.println(lista);

        for (int value : lista) {
            System.out.println(value);
        }

        System.out.println(lista.get(0));

        lista.clear();
        System.out.println(lista);


        lista.add(32);
        lista.add(12);
        lista.add(46);

        System.out.println(lista.size()); 

        System.out.println(lista.get(lista.size() - 1));

        System.out.println(lista.isEmpty());

        List<String> lista2 = new ArrayList<>();
        lista2.add("asd");
        lista2.add("dsa");
        System.out.println(lista2);


        List<Integer> newList = createList(lista);
        System.out.println(lista);
        System.out.println(newList);
    }

    public static List<Integer> createList(List<Integer> paramList) {
        List<Integer> res = new ArrayList<>();
        res.add(12);
        res.addAll(paramList);
        return res;
    }
}
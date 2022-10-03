import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        float f = 3.14f;
        int i = (int)f;

        char c = (char)9654;
        System.out.println(c);

        System.out.println(Character.getName(c));

        System.out.println(Character.isDigit(c));
        System.out.println(Character.isDigit('3'));

        System.out.println(Character.isLetter('a'));
        System.out.println(Character.isLetter('3'));

        System.out.println(Character.isWhitespace('\n'));

        System.out.println(Character.toUpperCase('c'));
        System.out.println(Character.isUpperCase('c'));

        System.out.println(Character.toLowerCase('C'));
        System.out.println(Character.isLowerCase('c'));

        String s = "123123";
        int sum = 0;
        for (char c1 : s.toCharArray()) {
            sum += Character.getNumericValue(c1);
        }

        System.out.println(sum);
        //int x = Character.getNumericValue('7');

        List<Integer> l = new ArrayList<>(List.of(1, 2, 4, 5));

    }
}
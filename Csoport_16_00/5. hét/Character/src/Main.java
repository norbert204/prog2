import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        char c = (char)9654;
        System.out.println(c);

        System.out.println(Character.getName(c));

        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isLetter(c));
        System.out.println(Character.isUpperCase('c'));
        System.out.println(Character.isLowerCase('c'));
        System.out.println(Character.isWhitespace('\t'));
        System.out.println(Character.toUpperCase('c'));
        System.out.println(Character.toLowerCase('A'));

        int x = Character.getNumericValue('9');
        System.out.println(x);

        String s = "123456789";
        int sum = 0;
        for (char c1 : s.toCharArray()) {
            sum += Character.getNumericValue(c1);
        }
        System.out.println(sum);

        List<Integer> list = new ArrayList<>(List.of(1, 2, 4, 5));
    }
}
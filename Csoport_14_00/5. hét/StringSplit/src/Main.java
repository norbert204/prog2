import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "Alma.Körte.Barack";
        String[] split = s.split("\\.");

        System.out.println(Arrays.toString(split));
    }
}
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "192.168.0.1";
        String s2 = "Alma       Körte               Barack";
        String s3 = "1+3+5";

        String[] split = s.split("\\.");
        s2 = s2.replaceAll("\\s+", "");
        System.out.println(s2);
        System.out.println(Arrays.toString(split));
    }
}
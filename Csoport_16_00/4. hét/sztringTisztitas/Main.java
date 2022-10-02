import java.util.Arrays;

class Main {
    public static String cleanse(String input) {
        return input.replaceAll("\\s+", "");
    }
    
    public static void main(String[] args) {
        System.out.println(cleanse("192.20.246.138:\n 6666"));

        String ip = "192.20.246.138";

        String[] split = ip.split("\\.");

        String asd = "asdsa";
        split = asd.split("d");
        System.out.println(Arrays.toString(split));
    }
}
public class Main {
    public static void main(String[] args) {
        int x = 5;

        String xAsString = "" + x;
        String xAsString2 = String.valueOf(x);
        System.out.println(xAsString2);

        String xAsString3 = Integer.toString(x);
        System.out.println(xAsString3);
    }
}
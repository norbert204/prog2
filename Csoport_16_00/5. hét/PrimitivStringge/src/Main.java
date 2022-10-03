public class Main {
    public static void main(String[] args) {
        int x = 5;

        String xToString = x + "";

        String xToString2 = String.valueOf(x);
        System.out.println(xToString2);

        String xToString3 = Integer.toString(x);
        System.out.println(xToString3);
    }
}
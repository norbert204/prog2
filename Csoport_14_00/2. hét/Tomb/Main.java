public class Main {

    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = a;

        b[0] = 10;

        System.out.printf("a[0]: %d, b[0]: %d\n", a[0], b[0]);
    }
}

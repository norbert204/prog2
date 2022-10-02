import java.util.Arrays;

class Main {
    static final int NUM = 12;
    static final int[] ARRAY = new int[12];

    public static void main(String[] args) {
        ARRAY[0] = 12;
        ARRAY = new int[13];
        System.out.println(Arrays.toString(ARRAY));
    }
}
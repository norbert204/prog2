import java.util.Arrays;

class Main {
    public static final int[] ARRAY = new int[10];
    public static final int INT_VALUE = 0;
    
    public static void main(String[] args) {
        ARRAY[0] = 12;

        final int N = 10;
        int[] a = new int[N];
        System.out.println(Arrays.toString(ARRAY));
    }
}
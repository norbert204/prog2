import java.util.Arrays;

class Main {

    public static int[] gimmeArray() {
        return new int[] { 10, 12, 13 };
    }

    public static void fillArray(int[] a) {
        Arrays.fill(a, 2);
    }

    public static int[] minMax(int[] a) {
        int[] b = a.clone();
        Arrays.sort(b);

        int[] result = { b[0], b[b.length - 1] };
        return result;
    }

    public static MinMax minMaxClass(int[] a) {
        int[] b = a.clone();
        Arrays.sort(b);

        MinMax result = new MinMax(b[0], b[b.length - 1]);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(gimmeArray()));

        int[] a = new int[10];
        fillArray(a);
        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.equals(a, gimmeArray()));

        /*for (int i = 0; i < a.length; i++) {

        }*/

        for (int i : gimmeArray()) {
            System.out.println(i);
        }

        int[] t1 = { 12, 13, 15 };
        int[] t2 = t1.clone();
        t2[0] = 32;

        System.out.println(Arrays.toString(t1));
        System.out.println(Arrays.toString(t2));

        int[] res = minMax(t2);
        MinMax res1 = minMaxClass(t2);
        System.out.printf("Min: %d\nMax: %d\n", res[0], res[1]);
        System.out.printf("Min: %d\nMax: %d\n", res1.min, res1.max);
    }
}
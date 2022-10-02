import java.util.Arrays;

class Main {

    public static int[] minMax(int[] array) {
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }

        int[] result = { min, max };
        return result;
    }

    public static MinMax minMaxClass(int[] array) {
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }

        MinMax result = new MinMax(min, max);
        return result;
    }

    public static void main(String[] args) {
        int[] array = { 1, 3, 5 };

        /*for (int i = 0; i < array.length; i++) {

        }*/

        /*for (int value : array) {
            System.out.println(value);
        }

        int[] b = array.clone();
        b[0] = 2;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(b));*/

        int[] minMax1 = minMax(array);
        System.out.printf("Min: %d\nMax: %d\n", minMax1[0], minMax1[1]);

        MinMax minMax2 = minMaxClass(array);
        System.out.printf("Min: %d\nMax: %d\n", minMax2.min, minMax2.max);

    }
}
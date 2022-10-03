public class Main {
    public static void main(String[] args) {
        String toLong = "123";
        long l = Long.parseLong(toLong);

        String toFloat = "3.14";
        float f = Float.parseFloat(toFloat);

        String toDouble = "7.1234567";
        double d = Double.parseDouble(toDouble);

        int x = 12;
        float f1 = (float)x;

        float f2 = 3.14f;
        int x1 = (int)f2;

        System.out.println(x1);
    }
}
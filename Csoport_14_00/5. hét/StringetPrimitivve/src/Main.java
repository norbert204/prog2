public class Main {
    public static void main(String[] args) {
        String toLong = "123";
        long l = Long.parseLong(toLong);

        String toFloat = "3.14";
        float f = Float.parseFloat(toFloat);

        String toDouble = "7.123";
        double d = Double.parseDouble(toDouble);

        String toChar = "a";
        char c = toChar.charAt(0);
        char c1 = toChar.toCharArray()[0];
    }
}
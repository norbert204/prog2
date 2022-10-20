public class MyStringUtils {
    public static String removeLetterRepetition(String text) {
        StringBuilder sb = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (!sb.toString().contains("" + c) || c == ' ') {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
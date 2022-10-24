import java.util.Scanner;

class Main {

    public static int occurences(char c, String text) {
        int count = 0;

        for (char c1 : text.toCharArray()) {
            if (c == c1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");

        String text = scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (occurences(c, text) == 1) {
                sb.append(c);
            }
        }

        System.out.println("Output: " + sb.toString());

        scanner.close();
    }
}
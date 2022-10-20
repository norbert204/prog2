import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adjon meg egy szöveget: ");

        String text = scanner.nextLine();

        String result = MyStringUtils.removeLetterRepetition(text);

        System.out.println("Kimenet: " + result);

        scanner.close();
    }
}

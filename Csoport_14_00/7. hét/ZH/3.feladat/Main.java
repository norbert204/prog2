import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adjon meg egy szöveget: ");

        String text = scanner.nextLine();

        if (text.contains("bad") && text.contains("good")) {
            text = text.replace("good", "goodtmp");
            text = text.replace("bad", "good");
            text = text.replace("goodtmp", "bad");
        }

        System.out.println("Kimenet: " + text);

        scanner.close();
    }
}

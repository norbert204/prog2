import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adjon meg egy szöveget: ");

        String text = scanner.nextLine();

        if (text.contains("bad") && text.contains("good")) {
            text = text.replace("bad", "baddddddd");
            text = text.replace("good", "bad");
            text = text.replace("baddddddd", "good");
        }

        System.out.println("Kimenet: " + text);
    }
}
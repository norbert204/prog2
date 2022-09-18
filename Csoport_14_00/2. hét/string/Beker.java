import java.util.*;

public class Beker {
    static String greeting(String name) {
        return String.format("Hello %s!", name);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Szia! Mi a neved? ");
        String s = scanner.nextLine();
        System.out.println(greeting(s));

        scanner.close();
    }
}

import java.util.Scanner;

public class Osszeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adj egy számot: ");
        int a = scanner.nextInt();

        System.out.print("Adj még egy számot: ");
        int b = scanner.nextInt();

        System.out.println("Össszeg: " + (a + b));

        scanner.close();
    }
}

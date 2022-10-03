import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Hiba! Nem adtál meg minimum 2 számot!");
            System.exit(1);
        }

        int sum = 0;
        for (String s : args) {
            sum += Integer.parseInt(s);
        }

        System.out.println("Összeg: " + sum);

        /*Scanner scanner = new Scanner(System.in);

        System.out.print("Adj számot: ");
        String s1 = scanner.nextLine();

        System.out.print("Adj még egy számot: ");
        String s2 = scanner.nextLine();

        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);

        System.out.println("Összeg: " + (n1 + n2));

        scanner.close();*/
    }
}
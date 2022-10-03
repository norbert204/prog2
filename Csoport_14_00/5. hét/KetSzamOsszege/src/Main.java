import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //  A változat
        if (args.length < 2) {
            System.err.println("Hiba! Adj meg minimum 2 számot!");
            System.exit(1);
        }

        int sum = 0;
        for (String s : args) {
            sum += Integer.parseInt(s);
        }

        System.out.println("Számok összege: "+ sum);

        //  B változat

        /*Scanner scanner = new Scanner(System.in);

        System.out.print("Adj egy számot: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.print("Adj még egy számot: ");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println("Végeredmény: " + (a + b));

        scanner.close();*/

    }
}
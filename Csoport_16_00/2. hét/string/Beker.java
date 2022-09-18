import java.util.Scanner;

public class Beker {

    static String greeting(String name) {
        return String.format("Hello %s!", name);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adj nevet: ");

        String s = scanner.nextLine();
        System.out.println(greeting(s));

        //int a = scanner.nextInt();
        //System.out.println(a);

        scanner.close();
    }
}

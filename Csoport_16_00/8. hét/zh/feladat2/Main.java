
public class Main {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.err.println("Hiba");
            System.exit(1);
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);

        int res = 0;

        /*if (args[1].equals("+")) {
            res = a + b;
        }
        else if (args[1].equals("-")) {

        }*/
        switch (args[1]) {
            case "+":
                res = a + b;
                break;
            case "-":
                res = a - b;
                break;
            case "x":
                res = a * b;
                break;
            case "/":
                res = a / b;
                break;
        }

        System.out.println(res);
    }
}

public class Main {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.err.println("Hiba! Paraméterként 3 számot adjon meg!");
            System.exit(1);
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (MyMath.isRightTriangle(a, b, c)) {
            System.out.println("A háromszög derékszögű!");
        }
        else {
            System.out.println("A háromszög nem derékszögű!");
        }
    }
}

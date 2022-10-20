public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Hiba! Adjon meg egy pozitív páratlan egész számot!");
            System.exit(1);
        }

        int width = Integer.parseInt(args[0]);

        assert width > 0;
        assert width % 2 != 0;

        int current = 1;
        boolean add = true;

        for (int i = 0; i < width; i++) {
            System.out.printf("%s%s\n", " ".repeat((width - current) / 2), "*".repeat(current));
            if (current == width) {
                add = false;
            }

            if (add) {
                current += 2;
            }
            else {
                current -= 2;
            }
        }
    }
}
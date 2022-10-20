import java.util.List;

public class Main {
    public static void main(String[] args) {
        final String SEARCHING_FOR = "A5:B8:F9";

        if (args.length != 1) {
            System.err.println("Hiba! Paraméterben egy fájlt adjon meg feldolgozásra!");
            System.exit(1);
        }

        List<String> lines = FileUtils.readLines(args[0]);
        int count = 0;
        for (String line : lines) {
            if (line.startsWith(SEARCHING_FOR)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
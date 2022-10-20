import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Hiba! Paraméternek egy nevet adjon meg!");
            System.exit(1);
        }

        List<String> names = FileUtils.readLines("nevek.txt");

        int count = 0;
        for (String name : names) {
            String[] split = name.split("\\s+");

            if (split[0].equals(args[0]) || split[1].equals(args[0])) {
                count++;
            }
        }

        System.out.println(count);
    }
}
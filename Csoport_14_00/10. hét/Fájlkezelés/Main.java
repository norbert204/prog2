import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

class Main {
    public static void main(String[] args) {
        read();
        write();
    }

    public static void write() {
        try (PrintWriter writer = new PrintWriter("out.txt", "utf-8")) {
            /*writer.println("új sor");
            writer.print("nincs sortörés");
            writer.printf("Pretty string %.2f\n", 3.1456);*/

            for (int i = 1; i <= 100; i++) {
                writer.println(i);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static void read() {
        try (BufferedReader reader = new BufferedReader(new FileReader("pelda.txt"))) {

            int sum = 0;
            String line;
            while ((line = reader.readLine()) != null) {
                sum += Integer.parseInt(line);
            }

            System.out.println(sum);

            //reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("Hiba! pelda1.txt nem találtható!");
            System.exit(1);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
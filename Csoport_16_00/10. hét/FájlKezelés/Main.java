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

        /*try {
            String x = "12";
            int n = Integer.valueOf(x);
        }
        catch (Exception e) {
            System.out.println("Hülye vagy!");
        }
        finally {
            System.out.println("Lefut");
        }*/
    }

    public static void write() {
        try (PrintWriter writer = new PrintWriter("out.txt", "utf-8")) {
            writer.println("Új sor ");
            writer.print("Nincs sortörés");
            writer.printf("Pretty print %.2f\n", 5.3456789);
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
        try (BufferedReader reader = new BufferedReader(new FileReader("in.txt"))) {
            
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e) {
            System.err.println("Hiba! Fájl nem található!");
            System.exit(1);
        }
        catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
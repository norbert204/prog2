import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtils
{
    // input: a megnyitandó file neve
    // output: egy List<String> objektum, ami az egyes sorokat tartalmazza
    public static List<String> readLines(String fileName)
    {
        List<String> lines = new ArrayList<String>();

        try
        {
            String line;
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null)
            {
                lines.add(line);
            }
            br.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
            System.exit(1);
        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.exit(2);
        }

        return lines;
    }

    public static List<Integer> readFirstLineAsDigits(String fname) {
        List<String> lines = readLines(fname);
        String firstLine = lines.get(0);

        List<Integer> result = new ArrayList<>();
        for(char c : firstLine.toCharArray()) {
            result.add(Character.getNumericValue(c));
        }

        return result;
    }
}

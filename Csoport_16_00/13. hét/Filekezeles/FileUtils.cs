namespace Filekezeles;

public class FileUtils
{
    public static List<string> ReadLines(string fileName)
    {
        List<string> res = new List<string>();

        try
        {
            using (StreamReader sr = new StreamReader(fileName))
            {
                while (!sr.EndOfStream)
                {
                    string line = sr.ReadLine();
                    res.Add(line);
                }
            }
        }
        catch (FileNotFoundException e)
        {
            Console.WriteLine(e.Message);
            Environment.Exit(2);
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);
            Environment.Exit(2);
        }

        return res;
    }

    public static void WriteLines(string fileName, List<string> data)
    {
        try
        {
            using (StreamWriter sw = new StreamWriter(fileName))
            {
                foreach (var s in data)
                {
                    sw.WriteLine(s);
                }
            }
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);
            Environment.Exit(2);
        }
    }
}
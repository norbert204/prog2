namespace FileKezeles;

public static class FileUtils
{
    public static List<string> ReadLines(string fileName)
    {
        var result = new List<string>();

        try
        {
            using (var reader = new StreamReader(fileName))
            {
                while (!reader.EndOfStream)
                {
                    var line = reader.ReadLine();
            
                    result.Add(line);
                }
            }
        }
        catch (FileNotFoundException e)
        {
            Console.WriteLine(e.Message);
        }
        

        return result;
    }

    public static void WriteLines(string fileName, List<string> data)
    {
        try
        {
            using (var writer = new StreamWriter(fileName))
            {
                foreach (var s in data)
                {
                    writer.WriteLine(s);
                }
            }
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
        }
    }
}
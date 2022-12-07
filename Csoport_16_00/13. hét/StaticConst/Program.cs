namespace StaticConst;

class Program
{
    private static int Alma = 3;
    private const int Korte = 4;

    public static void Main(string[] args)
    {
        const string url = "https://asd.com/";
        
        Console.WriteLine(Alma);
        Console.WriteLine(Program.Alma);
        Alma++;
        Console.WriteLine(Alma);
        
        Console.WriteLine(Korte);
        Console.WriteLine(Program.Korte);
        //Korte++;
        
        Console.WriteLine(url);
    }
}
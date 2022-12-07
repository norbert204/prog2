namespace Argok;

class Program
{
    public static void Main(string[] args)
    {
        /*foreach (var s in args)
        {
            Console.WriteLine(s);
        }
        
        Console.WriteLine(string.Join(", ", Environment.GetCommandLineArgs()));*/

        if (args.Length != 1)
        {
            Console.WriteLine("Add meg a nevedet!");
            Environment.Exit(1);
        }
        
        Console.WriteLine("Szia {0}!", args[0]);
        string s = string.Format("Szia {0}!", args[0]);

        string s1 = $"Szia {args[0]} {12}{true}!";
        Console.WriteLine(s1);
    }
}



namespace Argumentumok;

class Program
{
    public static void Main(string[] args)
    {
        /*foreach (var s in args)
        {
            Console.WriteLine(s);
        }
        
        Console.WriteLine(string.Join(",", Environment.GetCommandLineArgs()));*/

        if (args.Length != 1)
        {
            Console.WriteLine("Hiba! Add meg a neved!");
            Environment.Exit(1);
        }
        
        Console.WriteLine("Szia {0}!", args[0]);
        var s = string.Format("Szia {0}!", args[0]);
        Console.WriteLine(s);

        var s1 = $"Szia {args[0]} de nagyon!";
        Console.WriteLine(s1);
    }
}
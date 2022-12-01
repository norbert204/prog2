using Extension.Utils;

namespace Extension;

public class Program
{
    public static void Main(string[] args)
    {
        var s = "Alma".ReverseStr();
        //s = StringUtils.ReverseStr(s);

        Console.WriteLine(s);
        
        5.Print();
        
        6.Multiply(9).Print();
    }
}

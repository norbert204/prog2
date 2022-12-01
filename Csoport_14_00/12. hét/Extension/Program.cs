using Extension.Utils;

namespace Extension;

class Program
{
    public static void Main(string[] args)
    {
        string s = "Prog 2 yey".ReverseStr();

        // var reversed = StringUtils.Reverse(s);

        int i = 2.Duplicate();
        int j = 4.Multiply(5);
        
        Console.WriteLine(s);
        Console.WriteLine(i);
        Console.WriteLine(j);
    }
}
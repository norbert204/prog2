namespace Extension.Utils;

public static class IntExtensions
{
    public static void Print(this int i)
    {
        Console.WriteLine(i);
    }

    public static int Multiply(this int i, int n)
    {
        return i * n;
    }
}
namespace Extension.Utils;

public static class StringExtensions
{
    public static string ReverseStr(this string s)
    {
        var chars = s.ToCharArray();
        Array.Reverse(chars);
        return new string(chars);
    }
}
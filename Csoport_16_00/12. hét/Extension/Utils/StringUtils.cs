namespace Extension.Utils;

public class StringUtils
{
    public static string ReverseStr(string s)
    {
        var chars = s.ToCharArray();
        Array.Reverse(chars);
        return new string(chars);
    }
}
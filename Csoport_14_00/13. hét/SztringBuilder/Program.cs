using System.Text;

string s = "asd";
s += "17";
s += "42";

// s[0] = 'b';

StringBuilder sb = new StringBuilder();
sb.Append("Hello");
sb.Append("Szia");
sb.Append("Hogy vagy?");
sb.Append(42);

var res = sb.ToString();
Console.WriteLine(res);
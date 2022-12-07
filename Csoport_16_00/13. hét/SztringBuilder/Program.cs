using System.Text;

string s = "asd";
s += 123;
s += "dsa";

// s[0] = 'a';

StringBuilder sb = new StringBuilder();
sb.Append("asd");
sb.Append(123);
sb.Append("dsa");
Console.WriteLine(sb.ToString());
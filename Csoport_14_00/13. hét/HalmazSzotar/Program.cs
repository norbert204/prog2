HashSet<int> halmaz = new HashSet<int>();
halmaz.Add(1);
halmaz.Add(1);
halmaz.Add(1);
halmaz.Add(1);
halmaz.Add(3);
halmaz.Add(5);
halmaz.Remove(1);
int c = halmaz.Count;
var cont = halmaz.Contains(5);
halmaz.Clear();

HashSet<int> hashSet2 = new HashSet<int>
{
    1, 2, 4, 5
};

Console.WriteLine(string.Join(", ", halmaz));

//Console.WriteLine(string.Join("alma", halmaz));

Dictionary<int, string> dict = new Dictionary<int, string>();
dict.Add(4, "alma");
dict.Add(5, "körte");
dict.Add(1, "barack");

string helper = "";
bool success = dict.TryGetValue(3, out helper);
if (success)
{
    Console.WriteLine(helper);
}

dict.Remove(1);
Console.WriteLine(string.Join(", ", dict.Values));
Console.WriteLine(string.Join(", ", dict.Keys));
Console.WriteLine(dict.ContainsKey(1));
Console.WriteLine(dict.ContainsValue("alma"));

foreach (KeyValuePair<int, string> kvp in dict)
{
    Console.WriteLine("{0}: {1}", kvp.Key, kvp.Value);
}
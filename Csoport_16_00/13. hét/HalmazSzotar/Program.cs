HashSet<int> halmaz = new HashSet<int>();
halmaz.Add(1);
halmaz.Add(1);
halmaz.Add(1);
halmaz.Add(1);
halmaz.Add(1);
halmaz.Add(5);
halmaz.Add(3);
halmaz.Add(2);

Console.WriteLine(string.Join(", ", halmaz));

halmaz.Remove(1);
Console.WriteLine(halmaz.Count);
Console.WriteLine(halmaz.Contains(1));
//Console.WriteLine(halmaz.UnionWith());
//Console.WriteLine(halmaz.Overlaps());

HashSet<int> halmaz2 = new HashSet<int>
{
    1, 2, 6, 8, 2,
};

Dictionary<int, string> dict = new Dictionary<int, string>();

dict.Add(1, "hülye vagy");
dict.Add(2, "grat");
dict.Add(3, "impossible");
dict.Add(4, "Nem vagy ember");
dict.Add(5, "Csicska stréber");

string val = "";
dict.TryGetValue(3, out val);
Console.WriteLine(val);

Console.WriteLine(dict.ContainsKey(6));
Console.WriteLine(dict.ContainsValue("kettes"));
dict[1] = "mind1";
dict[6] = "asd";

dict.Remove(1);

foreach (KeyValuePair<int, string> kvp in dict)
{
    Console.WriteLine("{0}: {1}", kvp.Key, kvp.Value);
}
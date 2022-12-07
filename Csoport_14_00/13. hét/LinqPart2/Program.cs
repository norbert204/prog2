var list = new List<int>
{
    42,
    43,
    12,
    4,
    9,
};

Console.WriteLine(list.First());
Console.WriteLine(list.Last());
Console.WriteLine(list.Average());
Console.WriteLine(string.Join(", ", list.Take(3).ToList()));
Console.WriteLine(string.Join(", ", list.Skip(2).ToList()));
Console.WriteLine(string.Join(", ", list.Skip(2).Take(2).ToList()));

Console.WriteLine(list.All(x => x > 0));
Console.WriteLine(list.Any(x => x > 44));
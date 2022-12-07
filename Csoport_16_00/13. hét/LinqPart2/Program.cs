List<int> values = new List<int>
{
    69,
    42,
    666,
    96,
    3,
};

Console.WriteLine(values.First());
Console.WriteLine(values.Last());
Console.WriteLine(values.Average());
Console.WriteLine(string.Join(", ", values.Take(3).ToList()));
Console.WriteLine(string.Join(", ", values.Skip(3).ToList()));
Console.WriteLine(string.Join(", ", values.Skip(2).Take(2).ToList()));
Console.WriteLine(values.Skip(2).Take(2).Sum());
Console.WriteLine(values.All(x => x > 0));
Console.WriteLine(values.Any(x => x % 2 != 0));
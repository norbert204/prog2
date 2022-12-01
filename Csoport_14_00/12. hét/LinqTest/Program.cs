using System.Linq;


var nums = new List<int>
{
    1, 2, 5, 8, 9, 1, 3,
};

var even = nums.Where(x => x % 2 == 0).ToList();

var doubl = nums.Select(x => x * 3).ToList();

var t = nums.Select(x => x * x).Where(x => x < 20).ToList();

Console.WriteLine(string.Join(", ", even));

Console.WriteLine(string.Join(", ", doubl));

Console.WriteLine(string.Join(", ", t));

var words = new List<string>
{
    "alma",
    "korte",
    "barack",
};

var trimmed = words.Select(x => x[1..^1]).Where(x => x.Length >= 3).ToList();

Console.WriteLine(string.Join(", ", trimmed));
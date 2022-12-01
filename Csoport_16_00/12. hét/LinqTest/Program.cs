
var nums = new List<int> { 4, 6, 2, 78, 2, 7, 2, 9 };

var odd = nums.Where(x => x % 2 == 1).ToList();

Console.WriteLine(string.Join(", ", odd));

var duplicates = nums.Select(x => x * 2).ToList();

Console.WriteLine(string.Join(", ", duplicates));

var squares = nums.Select(x => x * x).Where(x => x < 20).ToList();

Console.WriteLine(string.Join(", ", squares));
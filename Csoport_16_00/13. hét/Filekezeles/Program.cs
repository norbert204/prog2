using Filekezeles;

List<string> data = new List<string>
{
    "busz",
    "troli",
    "menetrend",
};

FileUtils.WriteLines("out.txt", data);

var input = FileUtils.ReadLines("out.txt");

Console.WriteLine(string.Join(", ", input));
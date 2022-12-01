using static System.Console;

namespace Lista;
class Program
{
    static void Main(string[] args)
    {
        List<string> words = new List<string>();
        words.Add("aa");
        words.Add("bb");
        words.Add("cc");
        words.Add("dd");

        WriteLine(string.Join(", ", words));

        var nums = new List<int> { 5, 2, 7 };

        WriteLine(string.Join(";", nums));

        for (var i = 0; i < nums.Count; i++)
        {
            WriteLine(nums[i]);
        }


        foreach (int i in nums)
        {
            WriteLine(i);
        }

        nums.AddRange(nums);
        nums.Remove(3);
        nums.RemoveAt(1);
        nums.Contains(5);
        // nums.Count;
    }
}

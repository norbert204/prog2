// using System.Collections.Generic;
using static System.Console;

namespace Lista
{
    class Program
    {
        static void Main(string[] args)
        {
            var words = new List<string>();
            words.Add("aa");
            words.Add("bb");
            words.Add("cc");
            words.Add("dd");

            WriteLine(string.Join(", ", words));

            var nums = new List<int> { 3, 2, 1 };
            
            WriteLine(string.Join(";", nums));
            
            for (var i = 0; i < nums.Count; i++) 
            {
                WriteLine(nums[i]);
            }

            foreach (var i in nums) 
            {
                WriteLine(i);
            }

            nums.AddRange(nums);
            nums.Remove(1);
            nums.RemoveAt(3);
            // nums.RemoveAll()
            // nums.Count
            nums.Contains(3);
        }
    }
}

// int[] scores;
int[] scores = new int[10];
int[] scores1 = { 1, 2, 3, 4 };

Console.WriteLine(string.Join(", ", scores1)); 
Console.WriteLine(scores[0]);

scores1[1] = 42;

Console.WriteLine(string.Join(", ", scores1));

int[,] matrix = new int[4, 3];
int[,] matrix1 =
{
    { 1, 2, 3 },
    { 4, 5, 6 },
    { 7, 8, 9 }
};

for (var sor = 0; sor < matrix1.GetLength(0); sor++)
{
    for (var oszlop = 0; oszlop < matrix1.GetLength(1); oszlop++)
    {
        Console.Write(matrix1[sor, oszlop] + ", ");
    }
    Console.WriteLine();
}
int[] scores;
int[] scores1 = new int[10];
int[] scores2 = { 1, 2, 3, 4, 5 };

Console.WriteLine(scores2.Length);
Console.WriteLine(scores2[1]);

scores1[0] = 2;

Console.WriteLine(string.Join(", ", scores1));

//int[,] matrix = new int[3, 2];
int[,,] matrix3d = new int[4, 5, 3];

int[,] matrix =
{
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

for (var sor = 0; sor < matrix.GetLength(0); sor++)
{
    for (var oszlop = 0; oszlop < matrix.GetLength(1); oszlop++)
    {
        Console.Write(matrix[sor, oszlop] + ", ");
    }
    Console.WriteLine();
}
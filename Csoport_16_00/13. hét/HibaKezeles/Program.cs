
try
{
    Console.Write("Adj meg egy számot: ");

    string s = Console.ReadLine();

    int n = int.Parse(s);
    //double d = double.Parse(s);

    Console.WriteLine("A számod: " + n);
}
catch (FormatException e)
{
    Console.WriteLine("Adj meg egy számot számjegyekkel!");
}
catch (Exception e)
{
    Console.WriteLine("Mégis mit csináltál?");
}
finally
{
    Console.WriteLine("Nemtom elrontottad-e");
}

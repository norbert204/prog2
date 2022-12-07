
Console.Write("Szia! Adj meg egy számot: ");
try
{
    string input = Console.ReadLine();

    int num = int.Parse(input);

    Console.WriteLine("A számod: " + input);
}
catch (FormatException e)
{
    Console.WriteLine("Számjegyeket kértem!");
    // Environment.Exit(1);
}
finally
{
    Console.WriteLine("Nem tudom, hogy jót adtál-e meg.");
}

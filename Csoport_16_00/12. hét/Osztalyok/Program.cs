// See https://aka.ms/new-console-template for more information

using Osztalyok;

Console.WriteLine("Hello, World!");

var m1 = new Movie("Avatar 2", 2022, 9.3);
//m1.Title = "Avatar 3";

Console.WriteLine(m1.Title);

var movies = new List<Movie>
{
    new Movie("ASD", 123, 3.2),
    new Movie("StarGate", 1997, 8.0),
};

foreach (var m in movies) 
{
    Console.WriteLine(m);
}
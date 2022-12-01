using static System.Console;
using Osztalyok;

var m1 = new Movie("Avatar 2", 2022, 9.2);

// m1.Title = "Avatar 3";
m1.Year = 1234;

WriteLine(m1.Title);
WriteLine(m1.Year);

WriteLine(m1);

var movies = new List<Movie>
{
    new Movie("asdf", 2011, 6.0),
    new Movie("ghjk", 1999, 3.0)
};
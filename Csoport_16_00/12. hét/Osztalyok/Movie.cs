namespace Osztalyok;

public class Movie
{
    private string _title;
    // private int _year;
    private double _score;

    public Movie(string title, int year, double score)
    {
        _title = title;
        //_year = year;
        Year = year;
        _score = score;
    }

    /*public string GetTitle()
    {
        return _title;
    }

    public void SetTitle(string val)
    {
        this._title = val;
    }*/

    public string Title
    {
        get
        {
            return _title;
        }
        private set
        {
            this._title = value;
        }
    }

    public int Year { get; set; }

    public override string ToString()
    {
        return string.Format("Movie({0} ({1}), {2})", Title, Year, _score);
    }
}
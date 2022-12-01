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
        Title = title;
        _score = score;
    }

    /*public void SetTitle(string value)
    {
        this._title = value;
    }

    public string GetTitle()
    {
        return this._title;
    }*/

    public string Title
    {
        get
        {
            return this._title;
        }
        set
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
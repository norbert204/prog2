public class Movie {
    // Ezeket mind priváttá kell tenni és írni hozzá getter/settert
    public String title;
    public int releaseYear;
    private double score;

    public Movie(String title, int releaseYear, double score) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.setScore(score);
    }

    public void setScore(double value) {
        if (value < 0)
            this.score = 0;
        else if (value > 10)
            this.score = 10;
        else 
            this.score = value;
    }

    public double getScore() {
        return this.score;
    }

    @Override
    public String toString() {
        //  Movie(title (rYear), score)
        return String.format("Movie(%s (%d), %.1f)", this.title, this.releaseYear, this.score);
    }
}

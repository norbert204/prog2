import java.util.Scanner;

public class Movie {
    private String title;
    private int releaseYear;
    private double score;

    public Movie(String title, int releaseYear, double score) {
        this.setTitle(title);
        this.setReleaseYear(releaseYear);
        this.setScore(score);
    }

    public void setTitle(String value) {
        this.title = value;
    }

    public String getTitle() {
        return this.title;
    }

    public void setReleaseYear(int value) {
        this.releaseYear = value;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double value) {
        if (value < 0) {
            this.score = 0;
        }
        else if (value > 10) {
            this.score = 10;
        }
        else {
            this.score = value;
        }
    }

    @Override
    public String toString() {
        return String.format("Movie(%s (%d), %.1f)", this.getTitle(), this.getReleaseYear(), this.getScore());
    }
}
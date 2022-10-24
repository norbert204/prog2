public class Game {
    private String title;
    private int score;
    private double time;

    public Game(String title, String score, String time) {
        this.title = title;
        //this.score = Integer.parseInt(score.replace("%", ""));
        this.score = Integer.parseInt(score.substring(0, score.length() - 1));
        this.time = Double.parseDouble(time.split("\\s+")[0]);
    }

    public String getTitle() {
        return title;
    }

    public int getScore() {
        return score;
    }

    public double getTime() {
        return time;
    }

    public boolean isBetterThan(Game g) {
        if (this.getScore() > g.getScore()) {
            return true;
        }
        return false;
    }

    public boolean isLongerThan(Game g) {
        if (this.getTime() > g.getTime()) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s (%d%%), %.1f hours to beat", title, score, time);
    }
}
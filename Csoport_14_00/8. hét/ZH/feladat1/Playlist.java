import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private List<Game> games;
    
    public Playlist() {
        this.games = new ArrayList<>();
    }

    public void add(Game g) {
        games.add(g);
    }

    public Game getBestGame() {
        Game best = games.get(0);

        for (Game g : games) {
            if (g.getScore() > best.getScore()) {
                best = g;
            }
        }

        return best;
    }

    public Game getLongestGame() {
        Game longest = games.get(0);

        for (Game g : games) {
            if (g.getTime() > longest.getTime()) {
                longest = g;
            }
        }

        return longest;
    }

    public Game getShortestGame() {
        Game shortest = games.get(0);

        for (Game g : games) {
            if (g.getTime() < shortest.getTime()) {
                shortest = g;
            }
        }

        return shortest;
    }
}
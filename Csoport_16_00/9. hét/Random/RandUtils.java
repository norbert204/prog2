import java.util.List;
import java.util.Random;

public class RandUtils {
    private static final Random RAND = new Random();

    public static int choice(List<Integer> list) {
        return list.get(RAND.nextInt(0, list.size()));
    }
}

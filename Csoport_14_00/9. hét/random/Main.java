import java.util.List;
import java.util.Random;

class Main {
    private static final Random RAND = new Random();

    public static void main(String[] args) {
        Random random = new Random(2022);
        
        System.out.println(random.nextDouble());
        System.out.println(random.nextLong(10, 400));

        /*for (int i = 0; i < 10; i++) {
            //System.out.println(random.nextInt(11));
            System.out.println(RAND.nextInt(5, 15));
        }*/

        List<Integer> list = List.of(1, 2, 3, 4, 5);

        int res = RandUtils.choice(list);

        System.out.println(res);
    }
}
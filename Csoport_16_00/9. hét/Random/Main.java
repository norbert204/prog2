import java.util.List;
import java.util.Random;

class Main {
    public static final Random random = new Random(2022);
    
    public static void main(String[] args) {
        /*for (int i = 0; i < 10; i++) {
            //System.out.println(random.nextInt());
            //System.out.println(random.nextInt(11));
            System.out.println(random.nextInt(5, 15));
        }*/

        //System.out.println(RandUtils.choice(List.of(3, 5, 4)));

        //System.out.println(random.nextDouble());
        //System.out.println(random.nextLong(-5, 5));
        System.out.println(random.nextBoolean());
    }
}
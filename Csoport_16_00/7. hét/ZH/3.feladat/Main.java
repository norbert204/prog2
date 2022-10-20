public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Hiba! Adjon meg két számot paraméterben!");
            System.exit(1);
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        if (a > b) {
            System.err.println("Hiba! A második megadott szám nagyobb legyen mint az első!");
            System.exit(1);
        }

        //
        //  Itt elfelejtettem mondani, de a feladatba bele volt írva,
        //  hogy "feltételezhetjük az összeg 10 millió alatt van".
        //  10 millió int-be nem fér be, viszont long-ba igen
        //
        long sum = 0;
        for (long i = a; i <= b; i++) {
            //sum += Math.pow(i, i);

            long helper = 1;
            for (int j = 0; j < i; j++) {
                helper *= i;
            }

            sum += helper;
        }

        System.out.println(sum);
    }
}

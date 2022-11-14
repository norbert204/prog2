class Main {

    public static int product(int... x) {
        if (x.length == 0) {
            return 0;
        }
        
        int pr = 1;

        /*for (int i = 0; i < x.length; i++) {
            pr *= x[i];
        }*/
        for (int i : x) {
            pr *= i;
        }

        return pr;
    }

    public static void main(String[] args) {
        System.out.println(product(1));
        System.out.println(product(1, 2));
        System.out.println(product(1, 2, 3, 4, 5, 6, 7));
        System.out.println(product());
    }
}
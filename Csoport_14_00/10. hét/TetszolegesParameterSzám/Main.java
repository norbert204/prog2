class Main {

    public static int product(int... x) {
        if (x.length == 0) {
            return 0;
        }

        int res = 1;

        for (int i = 0; i < x.length; i++) {
            res *= x[i];
        }

        return res;
    }

    public static void printAll(String... s) {
        for (String val : s) {
            System.out.println(val);
        }
    }

    public static void main(String[] args) {
        System.out.println(product(1));
        System.out.println(product(1, 2));
        System.out.println(product(1, 2, 3, 4, 5, 6, 7));
        System.out.println(product());

        printAll("asd");
        printAll("Hello", "Szia", "Hogy vagy?");
        printAll("Prog2 2-es érdekel?");
    }
}
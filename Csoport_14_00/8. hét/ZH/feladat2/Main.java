import java.rmi.Remote;

class Main {
    public static String remove(String original, String chars) {
        StringBuilder sb = new StringBuilder();

        for (char c : original.toCharArray()) {
            if (chars.contains("" + c)) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
    
    public static void main(String[] args) {
        if (args.length != 3) {
            System.err.println("Adjál 3 sztringet köszi csáó");
            System.exit(1);
        }

        String res = remove(args[0], args[1]);

        System.out.printf("köztes eredmény: '%s'\n", res);

        res = remove(res, args[2]);

        System.out.printf("végeredmény: '%s'\n", res);
    }
}
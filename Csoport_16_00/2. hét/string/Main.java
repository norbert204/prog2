class Main {
    public static void main(String[] args) {
        //String s = new String("Java 17");

        String s = "Java 17";

        char c = s.charAt(2);

        //s.charAt(2) = 'V';

        System.out.println(c);

        s += " is bad";

        System.out.println(s.substring(5));
        System.out.println(s.substring(0, 3+1).toUpperCase());

        s = "Java 17";

        System.out.println(s.length());
        System.out.println(s.charAt(s.length() - 1));

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf("17"));
        System.out.println(s.indexOf('x'));

        s = "          Java     17         ";
        System.out.println("'" + s.trim() + "'");

        s = "Java 17 17";

        System.out.println(s.startsWith("Asd"));
        System.out.println(s.endsWith("17"));

        System.out.println(s.replace("17", "18"));
        s = s.replace("17", "18");
        System.out.println(s);

        //System.out.println(s.replaceAll(regex, replacement));

        String s1 = "Java" + 17 + 3.14f + true;
        System.out.println(s1);

        System.out.println("-".repeat(10));
    }
}

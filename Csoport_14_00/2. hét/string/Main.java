class Main {
    public static void main(String[] args) {
        //String s = new String("Java 17");

        String s = "Java 17";

        //System.out.println(s.charAt(2));

        //s.charAt(2) = 'V';
        s = "alma" + "körte";
        s += "barack";
        System.out.println(s);

        String s1 = s.substring(0,4);
        System.out.println(s1);

        String s1 = "sajtos kifli";
        System.out.println(s1.substring(7));
        System.out.println(s1.substring(0,7).toUpperCase());

        String s1 = "Java";
        System.out.println(s1.length());
        System.out.println(s1.charAt(s1.length() - 1));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        System.out.println(s1.indexOf('a'));
        System.out.println(s1.indexOf("va"));
        System.out.println(s1.indexOf('x'));

        s1 = "            Java      17      ";
        System.out.println(s1.trim());

        System.out.println(s1.startsWith("Ja") && s1.endsWith("va"));
        System.out.println(s1.endsWith("17"));

        String s2 = "Java Java";
        System.out.println(s2.replace("Java", "C#"));
        //System.out.println(s2.replaceAll(regex, replacement));

        String s3 = "Java" + 17;
        int version = 17;
        System.out.println(s3);
    }
}

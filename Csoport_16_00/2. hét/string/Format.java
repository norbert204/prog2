public class Format {
    public static void main(String[] args) {
        String name = "Name";
        int age = 20;
        String school = "Random School";

        // name (age), school
        //System.out.println(name + " (" + age + "), " + school);
        System.out.printf("%s (%d), %s\n", name, age, school);
        //System.out.println("asd");
        String s = String.format("%s (%d), %s", name, age, school);
        System.out.println(s);
    }
}

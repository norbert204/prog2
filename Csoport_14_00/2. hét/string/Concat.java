public class Concat {
    public static void main(String[] args) {
        String name = "Name";
        int age = 20;
        String school = "Random School";
        // Név (életkor), suli
        //System.out.println(name + " (" + age + "), " + school);
        System.out.printf("%s (%d), %s\n", name, age, school);

        String nice = String.format("%s (%d), %s\n", name, age, school);
        System.out.println(nice);
    }
}

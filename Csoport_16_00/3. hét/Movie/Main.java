public class Main {
    public static void main(String[] args) {
        Movie m1 = new Movie("Harry Potter 1", 2001, -7.6);
        Movie m2 = new Movie("The Terminator", 1980, 8.7);

        m1.setScore(-7);

        System.out.println(m1.getScore());

        System.out.println("Ez egy " + m1.toString());
    }
}

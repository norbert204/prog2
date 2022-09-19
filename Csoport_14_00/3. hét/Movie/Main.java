public class Main {
    public static void main(String[] args) {
        Movie m1 = new Movie("Harry Potter 1", 2001, 7.6);
        Movie m2 = new Movie("The Terminator", 1980, 123);
        System.out.println(m2.getScore());

        m2.setScore(-10);
        System.out.println(m2.getScore());


        System.out.println(m1);
    }
}

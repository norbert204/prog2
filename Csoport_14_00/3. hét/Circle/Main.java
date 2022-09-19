public class Main {
    static void hello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(2.5);

        Circle c2 = new Circle(3.5);

        System.out.println(c1.getR());
        System.out.println(c1.kerulet());
        System.out.println(c1.terulet());

        System.out.println(c1.isSmallerThan(c2));

        System.out.println(c1);

        System.out.println(Circle.circleCount);
        //System.out.println(Circle.getR());

        hello();
    }
}

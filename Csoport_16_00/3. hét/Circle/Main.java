public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(-2.5);
        //c1.r = 3;

        Circle c2 = new Circle(3.5);
        //c2.r = 4;

        System.out.println(c1.kerulet());
        System.out.println(c1.terulet());

        System.out.println(c1.isSmallerThan(c2));

        System.out.println(c1.getR());
        System.out.println(c1);

        System.out.println(Circle.circleCount);
    }
}

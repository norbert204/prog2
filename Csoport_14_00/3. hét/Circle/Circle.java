public class Circle {
    public static int circleCount = 0;
    
    private double r;

    public Circle(double r) {
        this.r = r;

        circleCount++;
    }

    public void setR(double value) {
        if (value < 0) {
            this.r = 0;
        }
        else {
            this.r = value;
        }
    }

    public double getR() {
        return this.r;
    }

    public double kerulet() {
        return 2 * r * Math.PI;
    }

    public double terulet() {
        return r * r * Math.PI;
    }

    public boolean isSmallerThan(Circle other) {
        return this.r < other.r;
    }

    @Override
    public String toString() {
        return String.format("Circle(%f)", this.r);
    }
}

public class Car {
    private String brand;
    private String licensePlateNumber;
    private double weight;
    private String color;

    public Car(String licensePlateNumber, String brand, double weight, String color) {
        this.brand = brand;
        this.licensePlateNumber = licensePlateNumber.toUpperCase();
        this.weight = weight;
        this.color = color;
    }

    /*private void setLicensePlateNumber(String value) {
        this.licensePlateNumber = value.toUpperCase();
    }*/

    public String getBrand() {
        return this.brand;
    }

    public String getColor() {
        return this.color;
    }

    public double getWeight() {
        return this.weight;
    }

    public String getLicensePlateNumber() {
        return this.licensePlateNumber;
    }

    public boolean isLighterThan(Car other) {
        return this.weight < other.weight;
    }

    public boolean requiresCLicense() {
        return this.weight > 3.5;
    }

    @Override
    public String toString() {
        return String.format("Car(%s (%s), %s, %.2ft)", this.brand, this.licensePlateNumber, this.color, this.weight);
    }
}

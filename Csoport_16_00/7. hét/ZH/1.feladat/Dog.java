public class Dog {
    private String name;
    private String breed;
    private String gender;
    private double weight;

    public Dog(String name, String breed, String gender, double weight) {
        this.name = name;
        this.breed = breed;
        this.gender = gender.toLowerCase();
        this.weight = weight;
    }

    /*private void setBreed(String value) {
        this.breed = breed;
    }*/

    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return this.breed;
    }

    public String getGender() {
        return this.gender;
    }

    public double getWeight() {
        return this.weight;
    }

    public int compareWeight(Dog other) {
        if (this.weight > other.getWeight()) {
            return -1;
        } 
        return 1;
    }

    @Override
    public String toString() {
        return String.format("Dog(%s (%s), %s, %.1fkg)", this.name, this.breed, this.gender, this.weight);
    }
}
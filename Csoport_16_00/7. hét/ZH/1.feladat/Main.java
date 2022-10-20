public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog("Rexi", "németjuhász", "Hím", 32.62);
        Dog d2 = new Dog("Keyush", "husky", "hÍM", 30.10);
        Dog d3 = new Dog("Csipesz", "csivava", "NőStény", 2);
    
        System.out.println(d1);
        System.out.println(d2.getBreed());
        System.out.println(d2.getGender());
        System.out.println(d3.getWeight());
        System.out.println(d1.compareWeight(d2));
        System.out.println(d3.compareWeight(d2));
        System.out.println(d3.getName());
    }
}

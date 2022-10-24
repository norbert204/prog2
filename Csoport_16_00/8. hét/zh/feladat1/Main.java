class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Tej", 3, 400);
        Product p2 = new Product("Alma", 10, 600);
        Product p3 = new Product("Körte", 12, 600);

        System.out.println(p1);
        System.out.println(p1.getId());
        System.out.println(p3.getId());
        System.out.println(p3.getName());
        p3.setQuantity(13);
        System.out.println(p3.getUnitPrice());
        System.out.println(p3.getTotalPrice());
        System.out.println(p1.compare(p2));
        System.out.println(p2.compare(p3));
        System.out.println(p3.compare(p1));
    }
}
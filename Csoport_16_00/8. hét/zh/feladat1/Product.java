public class Product {
    private static int nextId = 1;

    private int id;
    private String name;
    private int quantity;
    private int unitPrice;

    public Product(String name, int quantity, int unitPrice) {
        this.id = nextId;
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;

        nextId++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    /*private void setName(String value) {
        this.name = value;
    }*/

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int value) {
        this.quantity = value;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public int getTotalPrice() {
        return quantity * unitPrice;
    }

    public int compare(Product other) {
        if (this.getUnitPrice() > other.getUnitPrice()) {
            return -1;
        }
        else if (this.getUnitPrice() < other.getUnitPrice()) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Termék: %s, Mennyiség: %d, Egységár: %dft", name, quantity, unitPrice);
    }
}

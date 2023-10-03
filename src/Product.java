public class Product {
    public String name;
    public double price;
    public int quantity;

    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }
    public void printProduct() {
        System.out.println(name + ", " + price + ", " + quantity + " pcs");
    }
}
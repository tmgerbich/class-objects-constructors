public class Product {
    private double cost;
    private int quantity;
    private String name;

    public Product(int cost, int quantity, String name) {
        this.cost = cost;
        this.quantity = quantity;
        this.name = name;
    }

    public void totalCost() {
        double totalCost = this.cost * this.quantity;
        System.out.println("Total cost is " + totalCost);
    }

    public void printProduct() {
        System.out.println("" + this.name + " costs " + this.cost + " and " + this.quantity + " were purchased");
    }
}

// Step 1: Define the marker interface
interface Market {
    // This interface is empty; it acts as a marker.
}

// Step 2: Create the Product class
class Product implements Market {
    private int product_id;
    private String product_name;
    private double product_cost;
    private int product_quantity;

    public Product() {
        // Default constructor
    }

    public Product(int product_id, String product_name, double product_cost, int product_quantity) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_cost = product_cost;
        this.product_quantity = product_quantity;
    }

    public void displayProductDetails() {
        System.out.println("Product ID: " + product_id);
        System.out.println("Product Name: " + product_name);
        System.out.println("Product Cost: $" + product_cost);
        System.out.println("Product Quantity: " + product_quantity);
    }
}

public class marketInterface {
    public static void main(String[] args) {
        // Create objects of the Product class
        Product product1 = new Product(1, "Laptop", 800.0, 10);
        Product product2 = new Product(2, "Mobile Phone", 400.0, 20);
        Product product3 = new Product(3, "Tablet", 300.0, 15);

        // Display the contents of each object
        System.out.println("Details of Product 1:");
        product1.displayProductDetails();
        System.out.println();

        System.out.println("Details of Product 2:");
        product2.displayProductDetails();
        System.out.println();

        System.out.println("Details of Product 3:");
        product3.displayProductDetails();
        System.out.println();

        // Display the object count using the instanceof operator and Market interface
        int objectCount = 0;
        if (product1 instanceof Market) {
            objectCount++;
        }
        if (product2 instanceof Market) {
            objectCount++;
        }
        if (product3 instanceof Market) {
            objectCount++;
        }
        System.out.println("Object Count: " + objectCount);
    }
}

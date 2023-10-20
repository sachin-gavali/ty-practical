// Step 1: Define the abstract class Order
abstract class Order {
    protected int id;
    protected String description;

    public Order(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public abstract void accept();
    public abstract void display();
}

// Step 2: Create the subclass PurchaseOrder
class PurchaseOrder extends Order {
    private String customerName;

    public PurchaseOrder(int id, String description, String customerName) {
        super(id, description);
        this.customerName = customerName;
    }

    @Override
    public void accept() {
        // You can implement input logic here
    }

    @Override
    public void display() {
        System.out.println("Purchase Order ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Customer Name: " + customerName);
    }
}

// Step 3: Create the subclass SalesOrder
class SalesOrder extends Order {
    private String vendorName;

    public SalesOrder(int id, String description, String vendorName) {
        super(id, description);
        this.vendorName = vendorName;
    }

    @Override
    public void accept() {
        // You can implement input logic here
    }

    @Override
    public void display() {
        System.out.println("Sales Order ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Vendor Name: " + vendorName);
    }
}

public class OrderDemo {
    public static void main(String[] args) {
        int n = 3; // Number of Purchase Orders and Sales Orders

        // Create arrays to hold the PurchaseOrder and SalesOrder objects
        PurchaseOrder[] purchaseOrders = new PurchaseOrder[n];
        SalesOrder[] salesOrders = new SalesOrder[n];

        // Populate Purchase Orders
        purchaseOrders[0] = new PurchaseOrder(101, "Electronics", "John Doe");
        purchaseOrders[1] = new PurchaseOrder(102, "Furniture", "Jane Smith");
        purchaseOrders[2] = new PurchaseOrder(103, "Clothing", "Alice Johnson");

        // Populate Sales Orders
        salesOrders[0] = new SalesOrder(201, "Electronics", "XYZ Electronics");
        salesOrders[1] = new SalesOrder(202, "Furniture", "ABC Furniture");
        salesOrders[2] = new SalesOrder(203, "Clothing", "Fashion House");

        // Display details of all Purchase Orders
        for (int i = 0; i < n; i++) {
            System.out.println("Details of Purchase Order #" + (i + 1) + ":");
            purchaseOrders[i].display();
            System.out.println();
        }

        // Display details of all Sales Orders
        for (int i = 0; i < n; i++) {
            System.out.println("Details of Sales Order #" + (i + 1) + ":");
            salesOrders[i].display();
            System.out.println();
        }
    }
}

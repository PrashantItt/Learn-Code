import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }
}

class Inventory {
    private List<Product> itemList;

    public Inventory() {
        this.itemList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        itemList.add(product);
    }

    public List<Product> getInventory() {
        return itemList;
    }
}

public class InventoryManagement {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nInv Mgmt System");
            System.out.println("1. Add Product");
            System.out.println("2. Display Inventory");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String productName = scanner.next();
                    System.out.print("Enter product price: ");
                    double productPrice = scanner.nextDouble();
                    System.out.print("Enter product quantity: ");
                    int productQuantity = scanner.nextInt();

                    Product product = new Product(productName, productPrice, productQuantity);
                    inventory.addProduct(product);

                    System.out.println("Product added successfully!");
                    break;

                case 2:
                    System.out.println("\nCurrent Inventory:");
                    List<Product> inventoryList = inventory.getInventory();
                    for (Product currentProduct : inventoryList) {
                        System.out.println("Name: " + currentProduct.getName() +
                                ", Price: $" + currentProduct.getPrice() +
                                ", Quantity: " + currentProduct.getQuantity());
                    }
                    break;

                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

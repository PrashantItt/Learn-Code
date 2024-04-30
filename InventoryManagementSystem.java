import java.util.Scanner;
import CustomExceptionHandling.*;

public class InventoryManagementSystem {
    private ProductManager productManager;

    public InventoryManagementSystem() {
        this.productManager = new ProductManager();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Inventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Sell Product");
            System.out.println("5. List Products");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addProduct(scanner);
                    break;
                case 2:
                    updateProduct(scanner);
                    break;
                case 3:
                    deleteProduct(scanner);
                    break;
                case 4:
                    sellProduct(scanner);
                    break;
                case 5:
                    listProducts();
                    break;
                case 0:
                    System.out.println("Exiting Inventory Management System.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    private void addProduct(Scanner scanner) {
        try {
            System.out.print("Enter Product ID: ");
            int id = scanner.nextInt();
            System.out.print("Enter Product Name: ");
            String name = scanner.next();
            System.out.print("Enter Product Price: ");
            double price = scanner.nextDouble();
            if (price < 0) {
                throw new InvalidProductDataException("Price cannot be negative.");
            }
            System.out.print("Enter Product Quantity: ");
            int quantity = scanner.nextInt();
            if (quantity < 0) {
                throw new InvalidProductDataException("Quantity cannot be negative.");
            }
    
            Product product = new Product(id, name, price, quantity);
            productManager.addProduct(product);
            System.out.println("Product added successfully.");
        } catch (DuplicateProductException | InvalidProductDataException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    

    private void updateProduct(Scanner scanner) {
        try {
            System.out.print("Enter Product ID to update: ");
            int id = scanner.nextInt();
            System.out.print("Enter new Product Name: ");
            String name = scanner.next();
            System.out.print("Enter new Product Price: ");
            double price = scanner.nextDouble();
            if (price < 0) {
                throw new InvalidProductDataException("Price cannot be negative.");
            }
            System.out.print("Enter new Product Quantity: ");
            int quantity = scanner.nextInt();
            if (quantity < 0) {
                throw new InvalidProductDataException("Quantity cannot be negative.");
            }
    
            Product product = new Product(id, name, price, quantity);
            productManager.updateProduct(product);
            System.out.println("Product updated successfully.");
        } catch (ProductNotFoundException | InvalidProductDataException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    

    private void deleteProduct(Scanner scanner) {
        try {
            System.out.print("Enter Product ID to delete: ");
            int id = scanner.nextInt();
            productManager.deleteProduct(id);
            System.out.println("Product deleted successfully.");
        } catch (ProductNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void sellProduct(Scanner scanner) {
        try {
            System.out.print("Enter Product ID to sell: ");
            int id = scanner.nextInt();
            System.out.print("Enter Quantity to sell: ");
            int quantity = scanner.nextInt();
            productManager.sellProduct(id, quantity);
            System.out.println("Product sold successfully.");
        } catch (ProductNotFoundException | InsufficientQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void listProducts() {
        System.out.println("List of Products:");
        for (Product product : productManager.getProducts()) {
            System.out.println(product.getId() + " | " + product.getName() + " | $" + product.getPrice() + " | Quantity: " + product.getQuantity());
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem system = new InventoryManagementSystem();
        system.start();
    }
}


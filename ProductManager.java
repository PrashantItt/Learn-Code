import java.util.*;
public class ProductManager {
  private List<Product> products;

  public ProductManager() {
    this.products = new ArrayList<>();
  }

  public void addProduct(Product product) throws DuplicateProductException {
    for (Product existingProduct : products) {
      if (existingProduct.getId() == product.getId()) {
        throw new DuplicateProductException("Product with ID " + product.getId() + " already exists.");
      }
    }
    products.add(product);
  }

  public void updateProduct(Product product) throws ProductNotFoundException {
    int index = findProductIndex(product.getId());
    if (index == -1) {
      throw new ProductNotFoundException("Product with ID " + product.getId() + " not found.");
    }
    products.set(index, product);
  }

  public void deleteProduct(int productId) throws ProductNotFoundException {
    int index = findProductIndex(productId);
    if (index == -1) {
      throw new ProductNotFoundException("Product with ID " + productId + " not found.");
    }
    products.remove(index);
  }

  public void sellProduct(int productId, int quantity) throws InsufficientQuantityException, ProductNotFoundException {
    int index = findProductIndex(productId);
    if (index == -1) {
      throw new ProductNotFoundException("Product with ID " + productId + " not found.");
    }
    if (products.get(index).getQuantity() < quantity) {
      throw new InsufficientQuantityException("Insufficient quantity for product " + productId + ".");
    }
    products.get(index).setQuantity(products.get(index).getQuantity() - quantity);
  }

  private int findProductIndex(int productId) {
    for (int index= 0; index< products.size(); index++) {
      if (products.get(index).getId() == productId) {
        return index;
      }
    }
    return -1;
  }

  public Product findProduct(int productId) throws ProductNotFoundException {
    int index = findProductIndex(productId);
    if (index == -1) {
      throw new ProductNotFoundException("Product with ID " + productId + " not found.");
    }
    return products.get(index);
  }

  public List<Product> getProducts() {

    return Collections.unmodifiableList(products);
  }
}

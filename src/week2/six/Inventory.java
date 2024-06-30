package week2.six;

import java.util.ArrayList;

public class Inventory {
  private ArrayList<Product> products;

  public Inventory() {
    products = new ArrayList<>();
  }

  public void addProduct(Product product) {
    if (product == null || product.getId() == null || product.getId().isEmpty() || product.getName() == null || product.getName().isEmpty() || product.getPrice() < 0 || product.getStock() < 0) {
      throw new IllegalArgumentException("Invalid product.");
    }
    products.add(product);
  }

  public void removeProduct(String productId) {
    Product productToRemove = products.stream().filter(p -> p.getId().equals(productId)).findFirst().orElse(null);
    if (productToRemove == null) {
      throw new IllegalArgumentException("Product not found in inventory.");
    }
    products.remove(productToRemove);
  }

  public void updateProductStock(String productId, int newStock) {
    Product productToUpdate = products.stream().filter(p -> p.getId().equals(productId)).findFirst().orElse(null);
    if (productToUpdate == null) {
      throw new IllegalArgumentException("Product not found in inventory.");
    }
    if (newStock < 0) {
      throw new IllegalArgumentException("Invalid stock value.");
    }
    productToUpdate.setStock(newStock);
  }

  public double getTotalInventoryValue() {
    return products.stream().mapToDouble(product -> product.getPrice() * product.getStock()).sum();
  }
}

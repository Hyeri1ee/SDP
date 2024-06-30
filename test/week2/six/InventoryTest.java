package week2.six;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class InventoryTest extends TestCase {
  private Inventory inventory;

  @BeforeEach
  public void setUp() {
    inventory = new Inventory();
  }
  @Test
  public void InvalidProductAddingThrowIllegalArgumentException() {
        // Given
        Product invalidProduct = new Product(null, "Invalid Product", 10.0, 5);
        // When
        Assertions.assertThrows(IllegalArgumentException.class, () -> inventory.addProduct(invalidProduct));
        // Then
        // IllegalArgumentException should be thrown
    }

    @Test
    public void NonExistingProductWhenRemovingThrowIllegalArgumentException() {
        // Given
        String nonExistingProductId = "non-existing-id";
        // When
        Assertions.assertThrows(IllegalArgumentException.class, () -> inventory.removeProduct(nonExistingProductId));
        // Then
        // IllegalArgumentException should be thrown
    }
    @Test
    public void NonExistingProductUpdatingProductStockThrowIllegalArgumentException() {
        // Given
        String nonExistingProductId = "non-existing-id";
        // When
        Assertions.assertThrows(IllegalArgumentException.class, () -> inventory.updateProductStock(nonExistingProductId, 10));
        // Then
        // IllegalArgumentException should be thrown
    }

    @Test
    public void NegativeStockValueUpdatingProductStockThrowIllegalArgumentException() {
        // Given
        Product product = new Product("123", "Product", 10.0, 5);
        // When
        Assertions.assertThrows(IllegalArgumentException.class, () -> inventory.updateProductStock(product.getId(), -1));
        // Then
    }



}
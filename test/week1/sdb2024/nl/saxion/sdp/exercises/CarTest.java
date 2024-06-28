package week1.sdb2024.nl.saxion.sdp.exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
  private Car car;

  @BeforeEach
  void setUp() {
    car = new Car("BMW", "12-AB-CD", 50, 10);
  }

  @Test
  void createNewCarWithValidLicensePlateGivesNotException() {
    assertNotNull(car);
  }

  @Test
  void newCarHasFullTank() {
    assertEquals(100, car.getCurrentTankPosition());
  }

  @Test
  void carWhenDriving50kmConsumes5LiterOfFuel() {
    car.drive(50);
    assertEquals(45, car.getCurrentTankPosition() * car.getTankSize() / 100);
  }
}
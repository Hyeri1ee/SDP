package week1.sdb2024.nl.saxion.sdp.exercises;

public class Car {
  private String brand;
  private String licensePlate;
  private double tankSize;
  private double currentTankPosition;
  private double fuelConsumption;
  private int distanceDriven;

  //constructor
  public Car(String brand, String licensePlate, double tankSize, double fuelConsumption) {
      this.brand = brand;
      this.licensePlate = licensePlate;
      this.tankSize = tankSize;
      this.fuelConsumption = fuelConsumption;
      //for calculating currentTankPosition
      //for calculating currentTankPosition
      double fuelUsed = distanceDriven / fuelConsumption;
      if (fuelUsed > tankSize) {
        fuelUsed = tankSize;
      }
      this.currentTankPosition = ((tankSize - fuelUsed) / tankSize ) * 100;
      this.distanceDriven = 0;
  }

  //methods
  public void drive(int km) {
      double fuelUsed = km / fuelConsumption;
      double currentFuel = currentTankPosition * tankSize;
      if (fuelUsed > currentFuel) {
        System.out.println("The car can't drive that far!");
        return;
      }
      currentFuel -= fuelUsed;
      this.currentTankPosition = currentFuel / tankSize;
      this.distanceDriven += km;
    System.out.println("You drove " + km + " km");
  }
  public void fuel(int litres){
    double currentFuel = currentTankPosition * tankSize;
    currentFuel += litres;
    if (currentFuel > tankSize) {
      currentFuel = tankSize;
      System.out.println("You cannot overfill the tank!");
      return;
    }
    this.currentTankPosition = currentFuel / tankSize;
    System.out.println("You filled the tank with " + litres + " litres");
  }

  @Override
  public String toString() {
    return "Car{" +
            brand +
            "(" + licensePlate + "), " +
            tankSize + " litres " +
            "(" + currentTankPosition +"%) " +
            distanceDriven + " km"+
            "\n";
  }

  //getter ans setter methods
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getLicensePlate() {
    return licensePlate;
  }

  public void setLicensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
  }

  public double getTankSize() {
    return tankSize;
  }

  public void setTankSize(double tankSize) {
    this.tankSize = tankSize;
  }

  public double getCurrentTankPosition() {
    return currentTankPosition;
  }

  public void setCurrentTankPosition(double currentTankPosition) {
    this.currentTankPosition = currentTankPosition;
  }

  public double getFuelConsumption() {
    return fuelConsumption;
  }

  public void setFuelConsumption(double fuelConsumption) {
    this.fuelConsumption = fuelConsumption;
  }

  public double getDistanceDriven() {
    return distanceDriven;
  }

  public void setDistanceDriven(int distanceDriven) {
    this.distanceDriven = distanceDriven;
  }
}

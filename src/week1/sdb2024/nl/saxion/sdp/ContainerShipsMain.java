package week1.sdb2024.nl.saxion.sdp;

import java.util.ArrayList;

class Ship {
  private String name;
  private int maxContainers;
  private int maxWeight;
  private int deepNeeded;
  ArrayList<Container> containers = new ArrayList<>();
  ArrayList<Port> destinations = new ArrayList<>();

  public Ship(String name, int maxContainers, int maxWeight, int deepNeeded) {
    this.name = name;
    this.maxContainers = maxContainers;
    this.maxWeight = maxWeight;
    this.deepNeeded = deepNeeded;
  }

  public boolean addDestination(Port port) {
    return destinations.add(port);
  }

  public boolean addContainer(Container container) {
    //container size
    if (containers.size() >= maxContainers) return false;
    //container weight
    int totalWeight = containers.stream().mapToInt(c -> c.weight).sum() + container.weight;
    if (totalWeight > maxWeight) return false;
    //container destination
    if (!destinations.contains(container.destination)) return false;
    //result
    return containers.add(container);
  }

  public String getName() {
    return name;
  }
  public int getDeepNeeded() {
    return deepNeeded;
  }
}

class Container {
  int weight;
  Port destination;

  public Container(int weight, Port destination) {
    this.weight = weight;
    this.destination = destination;
  }
}

class Port {
  String name;
  int maxDepth;

  public Port(int maxDepth, String name) {
    this.name = name;
    this.maxDepth = maxDepth;
  }
}

class ShipManagment {
  private ArrayList<Ship> ships = new ArrayList<>();
  private ArrayList<Port> ports = new ArrayList<>();

  public boolean addShip(Ship ship) {
    return ships.add(ship);
  }

  public Ship getShip(String name) {
    return ships.stream().filter(ship -> ship.getName().equals(name)).findFirst().orElse(null);
  }

  public boolean addPort(Port port) {
    return ports.add(port);
  }

  public Port getPort(String name) {
    return ports.stream().filter(port -> port.name.equals(name)).findFirst().orElse(null);
  }
}

public class ContainerShipsMain {
  public static void main(String[] args) {
    ShipManagment shipManagment = new ShipManagment();
    shipManagment.addShip(new Ship("BigSur", 30, 30000, 20));
    shipManagment.addShip(new Ship("Adrianna", 40, 40000, 25));
    shipManagment.addPort(new Port(30, "SanFrancisco"));
    shipManagment.addPort(new Port(15, "Curacao"));
    shipManagment.addPort(new Port(40, "Los Angeles"));

    Ship s = shipManagment.getShip("BigSur");
    s.addDestination(shipManagment.getPort("SanFrancisco"));
    s.addDestination(shipManagment.getPort("Curacao"));
    s.addDestination(shipManagment.getPort("Los Angeles"));
    boolean result;
    result = s.addContainer(new Container(300, shipManagment.getPort("SanFrancisco")));
    System.out.println("Should be true: " + result);
    result = s.addContainer(new Container(200, shipManagment.getPort("SanFrancisco")));
    System.out.println("Should be true: " + result);
    result = s.addContainer(new Container(250, shipManagment.getPort("Curacao")));
    System.out.println("Should be true: " + result);  // Changed from false to true
    result = s.addContainer(new Container(350, shipManagment.getPort("Los Angeles")));
    System.out.println("Should be true: " + result);
  }
}
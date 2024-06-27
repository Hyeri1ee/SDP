package week1.sdb2024.nl.saxion.sdp.exercises;

public class Airplane {
  private boolean everyoneLoaded;
  private boolean everyLuggaugeLoaded;

  private boolean doorLocked;

  public Airplane(boolean everyoneLoaded, boolean everyLuggaugeLoaded, boolean doorLocked) {
    this.everyoneLoaded = everyoneLoaded;
    this.everyLuggaugeLoaded = everyLuggaugeLoaded;
    this.doorLocked = doorLocked;
  }

  public boolean depart(){
    if(everyoneLoaded && everyLuggaugeLoaded && doorLocked){
      System.out.println("The plane is ready for depart! Preparation complete!");
      return true;
    }
    System.out.println("The plane is NOT yet ready for departure!");
    return false;
  }

  public void lockDoors(){
    doorLocked = true;
    System.out.println("Locking doors!");
  }
  public void unlockDoors(){
    doorLocked = false;
  }
  public boolean hasLockedDoors(){
    return doorLocked;
  }
  public boolean loadLuggage(){
    if (!doorLocked) {
      everyLuggaugeLoaded = true;
      System.out.println("Loading luggages!");
    }else{
      System.out.println("Unable to load luggages. The doors are locked!");
    }
    return everyLuggaugeLoaded;
  }
  public boolean loadPassengers(){
    if (!doorLocked) {
      everyoneLoaded = true;
      System.out.println("Loading passengers!");
    }else{
      System.out.println("Unable to load passengers. The doors are locked!");
    }
    return everyoneLoaded;
  }

  public boolean isDoorLocked() {
    return doorLocked;
  }
}

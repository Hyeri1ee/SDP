package week1.sdb2024.nl.saxion.sdp;

import week1.sdb2024.nl.saxion.sdp.exercises.Airplane;

import java.util.Scanner;

public class AirplaneMain{
  public static void main(String[] args) {
    Airplane airplane = new Airplane(false, false, false);
    Scanner scanner = new Scanner(System.in);
    int num;
    do {
      System.out.println("********Aircraft preparation terminal*********");
      System.out.println("* 1) Load passengers");
      System.out.println("* 2) Load luggage");
      System.out.println("* 3) Lock/Unlock doors");
      System.out.println("* 9) Depart");
      System.out.println("* 0) Exit program");
      System.out.println("**********************************************");
      System.out.print("Please make a selection from the menu:");
      num = scanner.nextInt();

      switch(num)
      {
        case 1:
          airplane.loadPassengers();
          break;
        case 2:
          airplane.loadLuggage();
          break;
        case 3: {
          if (airplane.isDoorLocked())
            airplane.unlockDoors();
          else
            airplane.lockDoors();
          break;
        }
        case 9:
          airplane.depart();
          break;
        default:
          break;
      }
    } while (num != 0);


  }
}
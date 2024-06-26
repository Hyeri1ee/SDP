package week1.sdb2024.nl.saxion.sdp;

import week1.sdb2024.nl.saxion.sdp.exercises.Car;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Car car = new Car("Toyota", "12-AB-CD", 50, 1);
    Scanner scanner = new Scanner(System.in);
    int num;
    do {
      System.out.println("**********************************");
      System.out.println("* 1) Display statistics of the car");
      System.out.println("* 2) Drive some kilometers");
      System.out.println("* 3) Refuel");
      System.out.println("* 4) Exit program");
      System.out.println("**********************************");
      System.out.print("Please make a selection from the menu:");
      num = scanner.nextInt();

      switch(num)
      {
        case 1:
          System.out.println(car.toString());
          break;
        case 2:
          System.out.print("How many kilometers do you want to drive?  ");
          int km = scanner.nextInt();
          car.drive(km);
          break;
        case 3:
          System.out.print("How many litres do you want to throw into the tank?  ");
          int litres = scanner.nextInt();
          car.fuel(litres);
          break;
        default:
          break;
      }
    } while (num != 0);


  }
}
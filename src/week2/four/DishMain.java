package week2.four;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DishMain {
  public static void main(String[] args) {
    //read csv file
    CSVReader reader = new CSVReader("src/week2/four/indian_food.csv");


    //parse csv file
    List<Dish> dishes = new ArrayList<Dish>();
    reader.readCSV().forEach(dish -> dishes.add(dish));

    //things to do with streams
    //1. create a list of dishes that are vegetarian
    List<String> vegetarianDishes = dishes.stream()
            .filter(dish -> dish.getDiet().equals("vegetarian"))
            .map(dish->dish.getName())
            .collect(Collectors.toList());
    System.out.println(vegetarianDishes);

    System.out.println("=====================================");
    //2. Create a list of dishes that have less than 500 calories
    List<String> lowCalorieDishes = dishes.stream()
            .filter(dish -> dish.getPrepTime() < 30)
            .map(dish->dish.getName())
            .collect(Collectors.toList());
    System.out.println(lowCalorieDishes);
  }

}

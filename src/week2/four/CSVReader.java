package week2.four;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
  private String csvFile;
  private String csvSplitDishAndIngredients = ";";

  public CSVReader(String csvFile) {
    this.csvFile = csvFile;
  }


  public List<Dish> readCSV() {
    List<Dish> dishes = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
      String line;
      while ((line = br.readLine()) != null) {
        // use semicolon as separator
        String[] dishData = line.split(csvSplitDishAndIngredients);

        if (dishData.length < 9) {
          System.out.println("Skipping line due to insufficient data: " + line);
          continue;
        }

        ArrayList<String> ingredients = new ArrayList<>();
        try {
          String[] ingredientsData = dishData[1].split(",");
          for (String i : ingredientsData) {
            ingredients.add(i);
          }
        } catch (Exception e) {
          System.out.println("Error parsing ingredients for line: " + line);
        }

        String name = dishData[0];
        String diet = dishData[2];
        int prepTime = isNumeric(dishData[3]) ? Integer.parseInt(dishData[3]) : 0;
        int cookTime = isNumeric(dishData[4]) ? Integer.parseInt(dishData[4]) : 0;
        String flavorProfile = dishData[5];
        String course = dishData[6];
        String state = dishData[7];
        String region = dishData[8];

        Dish dish = new Dish(name, ingredients, diet, prepTime, cookTime, flavorProfile, course, state, region);
        dishes.add(dish);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    return dishes;
  }

  private boolean isNumeric(String str) {
    return str.matches("-?\\d+(\\.\\d+)?");
  }
}

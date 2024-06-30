package week2.four;

import java.util.ArrayList;

public class Dish {
  private String name;
  private ArrayList<String> ingredients;
  private String diet;
  private int prepTime;
  private int cookTime;
  private String flavorProfile;
  private String course;
  private String state;
  private String region;

  public Dish(String name, ArrayList<String> ingredients, String diet, int prepTime, int cookTime, String flavorProfile, String course, String state, String region) {
    this.name = name;
    this.ingredients = ingredients;
    this.diet = diet;
    this.prepTime = prepTime;
    this.cookTime = cookTime;
    this.flavorProfile = flavorProfile;
    this.course = course;
    this.state = state;
    this.region = region;
  }

  public String getName() {
    return name;
  }

  public ArrayList<String> getIngredients() {
    return ingredients;
  }

  public String getDiet() {
    return diet;
  }

  public int getPrepTime() {
    return prepTime;
  }

  public int getCookTime() {
    return cookTime;
  }

  public String getFlavorProfile() {
    return flavorProfile;
  }

  public String getCourse() {
    return course;
  }

  public String getState() {
    return state;
  }

  public String getRegion() {
    return region;
  }


}

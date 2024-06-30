package week2.three;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise8 {
  public static boolean areEqual(double a, double b, double epsilon) {
    return Math.abs(a - b) < epsilon;
  }

  public static void main(String[] args) {
    double avg = calculateAverageWordLength("Hello world, this is a test string.");
    if (!areEqual(avg,4.143d, 0.001)) {
      throw new RuntimeException("Function not correctly implemented");
    }
    System.out.println("Function correctly implemented");
  }

  public static double calculateAverageWordLength(String input) {
    ArrayList<String> words = new ArrayList<>(Arrays.asList(input.split("\\s+")));
    return words.stream()
            .mapToInt(String::length)
            .average()
            .orElse(0.0);
  }
}

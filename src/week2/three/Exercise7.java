package week2.three;

import java.util.Arrays;

public class Exercise7 {
  public static void main(String[] args) {
    String[] expectation = {"this","test"};
    if (!Arrays.deepEquals(getWordsStartingWith('t', "this is a test"),expectation)) {
      throw new RuntimeException("Function not correctly implemented");
    }
  }


  public static String[] getWordsStartingWith(char letter, String input) {
    //todo: your implementation here
    return Arrays.stream(input.split("\\s+"))
            .filter(s -> s.startsWith(String.valueOf(letter)))
            .toArray(String[]::new);

  }
}

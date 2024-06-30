package week2.three;

public class Exercise6 {
  public static void main(String[] args) {
    if (countLetters("Hello World") != 10) {
      throw new RuntimeException("Function not correctly implemented");
    }
  }

  public static int countLetters(String input) {
    long count = input.chars()
            .filter(Character::isLetter)
            .count();
    return (int) count;
  }
}

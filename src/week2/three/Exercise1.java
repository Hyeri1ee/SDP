package week2.three;

import java.util.Arrays;
import java.util.List;

public class Exercise1 {
  public static void main(String[] args) {
    new Exercise1().exec();
  }

  public void exec() {
    List<String> list = Arrays.asList("this", "is", "a", "test");

    exercise(list);
  }

  private void exercise(List<String> list) {
    int total = 0;
    for (String s : list){
      if (s.startsWith("t")) {
        total++;
      }
    }
    System.out.println(total);
  }
}

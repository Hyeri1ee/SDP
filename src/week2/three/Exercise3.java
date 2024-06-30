package week2.three;

import java.util.Arrays;
import java.util.List;

public class Exercise3 {
  public static void main(String[] args) {
    new Exercise3().exec();
  }

  public void exec() {
    List<String> list = Arrays.asList("this", "is", "a", "test");

    exercise(list);
  }

  private void exercise(List<String> list) {
    System.out.println(
            list.stream()
                    .filter(s -> s.startsWith("t"))
                    .mapToInt(s -> 1)
                    .reduce(0, Integer::sum)
    );
  }
}

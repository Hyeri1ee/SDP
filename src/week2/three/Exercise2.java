package week2.three;

import java.util.Arrays;
import java.util.List;

public class Exercise2 {
  public static void main(String[] args) {
    new Exercise2().exec();
  }

  public void exec() {
    List<String> list = Arrays.asList("this", "is", "a", "test");

    exercise(list);
  }

  private void exercise(List<String> list) {
    int total = list.stream()
                    .filter(s-> s.startsWith("t"))
                    .mapToInt(s->1)
                    .reduce(0,(a,b)->a+b);
    System.out.println(total);
  }
}


package week2.two;

import java.util.Arrays;
import java.util.List;

public class Step3 {
  static List<Person> values = Arrays.asList(new Person("Tom"), new Person("Piet"), new Person("Henk"));

  public static void main(String[] args) {
    for (Person p : values) {
      p.doPrint();
    }

  }
}

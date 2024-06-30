package week2.two;

import java.util.Arrays;
import java.util.List;

public class Step2 {
  static List<Person> values = Arrays.asList(new Person("Tom"), new Person("Piet"), new Person("Henk"));

  static MyCustomPrinter somePrinter = new MyCustomPrinter();

  public static void main(String[] args) {
    for(Person p : values){
      somePrinter.doPrint(p);
    }
  }
}

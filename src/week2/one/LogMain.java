package week2.one;

public class LogMain {
  public static void main(String[] args) {
    //1. anonymous class implementation
    Log logone = new Log() {
      @Override
      public void log(int logLevel, String message) {
        System.out.println(logLevel + ": " + message);
      }
    };
    logone.log(0, "This is some message!");
    logone.log(3, "This is a message with a higher log level!");
    logone.log(99, "This is very important message!");

    //2. convert to lambda expression
    Log logtwo = (logLevel, message) -> System.out.println(logLevel + ": " + message);
    logtwo.log(0, "This is some message!");
    logtwo.log(3, "This is a message with a higher log level!");
    logtwo.log(99, "This is very important message!");
  }
}

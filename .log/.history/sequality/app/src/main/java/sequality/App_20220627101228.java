/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());

    int a = 2, b = 3;
    System.out.println("Sum of " + a + "and" b + new App().getGreeting());
  }
}

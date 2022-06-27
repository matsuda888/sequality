/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
  @Test
  public void appHasAGreeting() {
    App classUnderTest = new App();
    assertNotNull("app should have a greeting", classUnderTest.getGreeting());
  }

  @Test
  public void testAppReturnHelloWorld() {
    App classUnderTest = new App();
    assertEquals("Hello World!", classUnderTest.getGreeting());
  }

  @Test
  public void testGetAtoBMessage() {
    App classUnderTest = new App();
    assertEquals("Sum of 1 to 10 is 55. Average is 5.5.", classUnderTest.getAtoBMessage(1, 10));
  }

  @Test
  public void testGetOddandEvenMessage() {
    App classUnderTest = new App();
    assertEquals("Sum of 1 to 10 is 55. Average is 5.5.", classUnderTest.getAtoBMessage(1, 10));
  }
}

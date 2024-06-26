package week1.example;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.Assert;

@RunWith(Enclosed.class)
public class RectangleTestTest {

  public static class TestMathUtils{
      @Test
      public void CalculatingSurface_ReturnsTheCorrectValues(){
        int width = 5;
        int height = 3;
        int answer = RectangleTest.Rectangle.calculateSurface(width, height);
        int expectedAnswer = 15;
        Assert.assertEquals(expectedAnswer, answer);
      }
  }
}
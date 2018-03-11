package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {
  @Test
  public void testDistance() {
    Point p = new Point(12, 1, 9,5);
    Assert.assertEquals(p.distance2(), 5.0);
  }
  @Test
  public void testDistance1() {
    Point p1 = new Point(12, 1, 9, 5);
    Assert.assertEquals(p1.distance2(), 6.0);
  }
  @Test
  public void testDistance2() {
    Point p1 = new Point(-1, 1, 4, 1);
    Assert.assertEquals(p1.distance2(), 2.0);
  }
}


//    Square s = new Square(5);
//    Assert.assertEquals(s.area(), 25);
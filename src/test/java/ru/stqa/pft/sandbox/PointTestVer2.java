package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTestVer2 {

  @Test
  public void testDistance1(){
    MethodForPoint p1 = new MethodForPoint(12,1);
    MethodForPoint p2 = new MethodForPoint(9, 5);
    Assert.assertEquals(p1.distance3(p2), 5.0);
  }

  @Test
  public void testDistance2(){
    MethodForPoint p1 = new MethodForPoint(9,-1);
    MethodForPoint p2 = new MethodForPoint(-3, 4);
    Assert.assertEquals(p1.distance3(p2), 13.0);
  }
  @Test
  public void testDistance3(){
    MethodForPoint p1 = new MethodForPoint(3,-4);
    MethodForPoint p2 = new MethodForPoint(8, -27);
    Assert.assertEquals(p1.distance3(p2), 16.0);
  }
}

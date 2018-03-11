package ru.stqa.pft.sandbox;
import java.awt.*;

public class PointVer2 {

  double x;
  double y;

  public PointVer2(double x, double y){
    this.x = x;
    this.y = y;
  }

  public static double distance(PointVer2 p1, PointVer2 p2) {
    double res = Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
    return res;
  }

  public static void main(String[] args) {

    PointVer2 p1 = new PointVer2(3, 8);
    PointVer2 p2 = new PointVer2(-2, -4);

    System.out.println("Расстояние между точкой Р1 с координатами x: " + p1.x + " и y: " + p1.y + " и точкой P2 с координатами " +
            " x: " + p2.x + " и y: " + p2.y + " равно " + distance(p1, p2));

  }

}

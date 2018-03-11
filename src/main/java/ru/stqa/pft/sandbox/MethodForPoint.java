package ru.stqa.pft.sandbox;

public class MethodForPoint {

  double x;
  double y;

  public MethodForPoint(double x, double y){
    this.x = x;
    this.y = y;
  }

  public double distance3(MethodForPoint p2) {
      double res = Math.sqrt(Math.pow((this.x - p2.x), 2) + Math.pow((this.y - p2.y), 2));
      return res;
  }

  public static void main(String[] args) {

    MethodForPoint p1 = new MethodForPoint(5, 8);
    MethodForPoint p2 = new MethodForPoint(3, -7);

    System.out.println("Расстояние между точкой Р1 с координатами x: " + p1.x + " и y: " + p1.y + " и точкой Р2 с координатами" +
            " x: " + p2.x + " y: " + p2.y + " равно " + p1.distance3(p2));
  }
}

package ru.stqa.pft.sandbox;

public class Point {

  public double x1;
  public double x2;
  public double y1;
  public double y2;

  //создаем конструктор
  public Point(double x1, double y1, double x2, double y2){
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }

  public double distance2 () {
    return Math.sqrt(Math.pow((this.x1 - this.x2), 2) + Math.pow((this.y1 - this.y2), 2));
  }

  public static void main(String[] args) {

    Point p = new Point(1,5,4,1);

    System.out.println("Расстояние между точкой 1 с координатами (" + p.x1 + ", " + p.y1 +") и точкой 2 " +
            "с координатами (" + p.x2 + ", " + p.y2 + ") равно " + p.distance2());

  }

}



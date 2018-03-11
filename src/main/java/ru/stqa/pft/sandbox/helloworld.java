package ru.stqa.pft.sandbox;

import java.awt.*;

public class helloworld {

  public static void main(String[] args) {
    hello("world");
    hello("Max");

    Square s = new Square(5);
//   s.l = 5;
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
//    r.a = 6;
//    r.b = 9;
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

    double q = 9;
    double w = 8;
    if (q > w) {
      System.out.println("Дискриминант от " + q + " и " + w + " = " + disc(q, w));
    } else {
      System.out.println("q must be bigger than w");
    }
  }

  public static void hello(String smt) {
//    String smt = "world";
    System.out.println("Hello " + smt);
  }

  public static double disc(double a, double b) {
    return Math.sqrt(a * a - b * b);
  }


}

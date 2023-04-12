package Quiz;

import java.util.Scanner;

public class Quiz {
  private static Scanner sc = new Scanner(System.in);

  public static void Quiz01(){
    NamedCircle w = new NamedCircle(5, "Waffle");
    w.show();
  }

  public static void Quiz04(){
    ColorPoint cp = new ColorPoint(5, 5, "Yellow");
    cp.show();

    cp.setPoint(10, 20);
    cp.setColor("GREEN");
    cp.show();

  }
  public static void main(String[] args) {
    Quiz01();
    Quiz04();
  }
}

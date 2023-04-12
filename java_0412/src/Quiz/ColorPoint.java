package Quiz;

public class ColorPoint extends Point{
  private String color;

  public ColorPoint(int x, int y, String color){
    super(x, y);
    this.color = color;
  }

  public void setPoint(int x, int y){
    move(x, y);
  }

  public void setColor(String color){
    this.color = color;
  }

  public void show(){
    int x = getX();
    int y = getY();
    System.out.println(color + "색으로 (" + x + "," + y + ")");
  }

}

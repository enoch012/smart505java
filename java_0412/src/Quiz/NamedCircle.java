package Quiz;


public class NamedCircle extends Circle {

  private String name;
  public NamedCircle(int radius, String name){
    super(radius);
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void show(){
    int radius = getRadius();
    String name = getName();

    System.out.println(name + ", 반지름 = " + radius);
  }

}

package Quiz;

public class Box {
  private int width, height;
  private char fillChar;

  public Box(){
    this(10, 1);
  } // this() 이용하기

  public Box(int width, int height){
    this.width = width;
    this.height = height;
  }

  public void draw(){
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        System.out.print(fillChar);
      }
      System.out.println(); // 한줄 내려가게 하기
    }
  }

  public void fill(char c){
    this.fillChar = c;
  }

}

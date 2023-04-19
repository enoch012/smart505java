package pr07_iostream;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx3 {
  public static void main(String[] args) throws Exception{
    Writer writer = new FileWriter("C:\\smart505\\writer3.txt");

    String data = "문자열 받로 읽긔 진짜 졸려 죽겟긔";

    writer.write(data);

    writer.flush();
    writer.close();


  }
}

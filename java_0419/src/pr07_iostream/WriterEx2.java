package pr07_iostream;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx2 {
  public static void main(String[] args) throws Exception{
    Writer writer = new FileWriter("C:\\smart505\\writerex2");

    char[] data = "아오진심졸려뒤지겠음".toCharArray();

    // char[] 배열의 내용을 한번에 쓰기

    writer.write(data, 3, 6);
    writer.flush();
    writer.close();

  }
}

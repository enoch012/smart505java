package pr07_iostream;

import java.io.FileReader;
import java.io.Reader;

public class ReaderEx2 {
  public static void main(String[] args) throws Exception {

    // 아웃풋이랑 거의 ㅠ사
    Reader reader = new FileReader("C:\\smart505\\tokentest.txt");

    int readData;
    // 파일에서 가져올 문자를 저장하는 버퍼 메모리로 사용할 byte[]
    char[] chef = new char[2]; // 한번에 두글자씩 저장하도록
    String data = "";

    while (true){
      readData = reader.read(chef);

      if(readData == -1){
        break;
      }
      data += new String(chef, 0, readData);

    }

    System.out.println(data);
    reader.close();
  }
}

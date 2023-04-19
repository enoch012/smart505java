package pr07_iostream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx2 {
  public static void main(String[] args) throws IOException {

    // FileInputStream을 통해서 파일 정보를 가져옴

    InputStream is = new FileInputStream("C:\\smart505\\tokentest.txt");

      int readData; // 읽어올 데이터 저장하는 변수
      byte[] readBytes = new byte[3];
      String data = ""; // 문자가 저장될 변수

      while (true){
        // 매개변수로 사용됨 byte 배열으 ㅣ크기만큼 스트림에서 데이터를 읽어옴, 실행 후 가져온byte수 출력
        readData = is.read(readBytes);
        if (readData == -1){
          break;
        }
        // 파일에서 한번에 읽어온 byte 배열을 읽어온 크기만큼 문자열로 변환
        // 변환된 문자열을 기존 문자열 뒤에 추가함
        data += new String(readBytes, 0, readData);

        // read() 사용 후 읽을 데이터가 없으면 -1을 반환
      }
        is.close();

      }

  }


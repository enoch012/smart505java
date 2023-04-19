package pr07_iostream;

import java.io.FileInputStream;
import java.io.InputStream;

public class IntputStream {

  // 부모 클래스인 InputStread이 추상 클래스이므로 자식 클래스인 filrInputStream is = new FilInputStream 이 상속 받아 구현해야함
  // 부모 클래스 다입의 변수 is에 자식 클래스인 Fi;eInputStrea 객체를 생성하여 대입
  public static void main(String[] args) throws Exception {
    InputStream is = new FileInputStream("C:\\smart505\\tokentest.txt");
    // 데이터를 입력 받기 위한 변수
    int readData;

    // 파일의 모드 내용을 출력하기 위한 반복문
    while(true) {
      // FileInputStream 객차의 read()메소드를 통해서 파일에 있는 정보를 1byte 가져옴

      // 더이상 읽어볼 데이커가 들지 않았을 경우 -1로 풀력, 반복문 조ㅇ료
      readData = is.read();
      if (readData == -1){
        break;
      }
      System.out.print((char) readData);
    //  읽어온 데이터를 char 타입의 강제 타입으로 변환하여 화면 출력
    }


    is.close();
  }
}

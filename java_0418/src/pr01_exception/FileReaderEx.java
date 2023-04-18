package pr01_exception;


import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
  /* 파일 입출력 예외 처리 */
  public static void main(String[] args) {
    FileReader reader = null;

    try {
      System.out.println("-----파일 읽기 시작-----");
      reader = new FileReader("C:\\smart505\\tokentes.txt"); // 파일 이름을 잘못 적어 오류 발생
      int c;

      while ((c = reader.read()) != -1){
        System.out.print((char)c);
      }

      reader.close(); // 파일이름이 잘못되어 실행되지 않으면 메모리만 계속 차지하고 있음.
      System.out.println("\n-----파일 읽기 완료-----");
    }
    catch (IOException e){
      System.out.println("입출력 오류");
    }
    finally {
      System.out.println("여기는 무조건 실행되는 부분입니당.");
      try {
        if(reader != null){ // 실행이 되긴 했다면
          reader.close();
        }
      }catch (Exception e){} // 오류날 게 없으니까 안적어도됨 구문 오류가 안 나려고 적는 것
    }

    System.out.println("\n ***** 프로그램 종료 ***** \n");
  }
}

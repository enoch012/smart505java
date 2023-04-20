package pr01_exception;

public class TryWithResourceEx {
  /* FileInputStream의 실행 파일*/
  public static void main(String[] args) {
    
    /*try with resource 방식 사용
    * try 다음 바로 사용할 객체를 적음
    * autocloseable을 상속 받고 있기 때문에 예외가 발생하면 파일이 알아서 바로 닫힌다.*/

    try(FileInputStream fis = new FileInputStream("file.txt")) {
      fis.read();
      throw new Exception(); // 강제로 예외를 발생
    }
    catch (Exception e){
      System.out.println("예외 처리 코드가 실행되었습니다.");
    }

    /*기존 try catch finally 방식*/

    FileInputStream fis = null;
    try {
      fis = new FileInputStream("file.txt");
      fis.read();
      throw new Exception(); // 강제로 예외를 발생
    }
    catch (Exception e){
      System.out.println("예외 처리 코드가 실행되었습니다.");
    }
    finally {
      try{
        if (fis != null){
          fis.close();
        }
      }
      catch (Exception e){}
    }

    }

  }

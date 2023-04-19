package pr06_thread;

import javax.tools.Tool;
import java.awt.*;

public class BeepPrintEx3 {
  public static void main(String[] args) {
    // 방법 1) Thread 클래스를 직접 상속 받은 BeepThread 클래스 타입의 객체를 이용함
    /*Thread thread = new BeepThread();
      */

    // 방법 2) 익명 클래스를 사용하여 스레드를 추가함
    Thread thread = new Thread(){ //익명 구현 클래스 (일회용짜리클래스)
      @Override
      public void run(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for (int i = 0; i < 5; i++) {
          toolkit.beep();

          try{
            Thread.sleep(500);
          } catch (Exception e){

          }
        }
      }
    };

    thread.start();

    for (int i = 0; i <5 ; i++){
      System.out.println("띵");
      try {
        Thread.sleep(500);
      }
      catch (Exception e){

      }
    }
  }
}

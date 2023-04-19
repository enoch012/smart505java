package pr06_thread;

import java.awt.*;

public class BeepPrintEx1 {

  /* 소리가 끝나고 글자가 나옴 */

  public static void main(String[] args) {

    /* 싱글 스레드로 프로그램을 동작했을 경우 */

    Toolkit toolkit = Toolkit.getDefaultToolkit();

    // 윈도우 띵띵 울리는 소리 출력

    for (int i = 0; i < 5; i++) {
      toolkit.beep();
      try {
        Thread.sleep(500);
      }catch (Exception e){}

    }

    for (int i = 0; i < 5; i++) {
      System.out.println("띵");
      try {
        Thread.sleep(500);
      } catch (Exception e){};
    }
  }
}

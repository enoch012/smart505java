package pr02_polymorphism;

/* 인터페이스 변수를 배열에 넣어보자 */
public class Car2 {

  // 인터페이스 타입의 변수 선언
  Tire[] tires = {
    new KumhoTire(),
    new KumhoTire(),
    new KumhoTire(),
    new KumhoTire()
  };

  // 배열이기 때문에 향상된 for문으로 코드 구현이 가능하다.
  void run(){
    for(Tire tire : tires){
      tire.roll();
    }
  }
}

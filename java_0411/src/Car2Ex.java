public class Car2Ex {
  public static void main(String[] args) {
    Car2 car = new Car2();
    /*car.speed = 100;*/ // private로 접근이 제한되어있음

    // Setter를 사용하여 speed를 수정해줌

    car.setSpeed(-50);

    // Getter를 사용하여 speed를 가져옴
    System.out.println("현재 속도 : " + car.getSpeed());

    car.setSpeed(60);

    System.out.println("현재 속도 : " + car.getSpeed());

    // 차가 멈추지 않았으면
    if (!car.isStop()){
      car.setStop(true);
    }
    System.out.println("현재 속도 : " + car.getSpeed());
  }
}

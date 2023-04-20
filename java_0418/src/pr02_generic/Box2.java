package pr02_generic;

/* 제네릭 타입이 뭔지 알아보자
 * 제네릭 활용 한 버전 */

public class Box2<T> {
  private T t;

  public T getData(){
    return t;
  }

  public void setData(T t){
    this.t = t;
  }
}

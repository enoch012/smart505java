package pr02_generic;

/* 제네릭 타입이 뭔지 알아보자
* 제네릭 활용 안한 버전 */
public class Box {
  private Object object;

  public void setData(Object object){
    this.object = object;
  }

  public Object getData(){
    return object;
  }
}

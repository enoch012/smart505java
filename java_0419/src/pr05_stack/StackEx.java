package pr05_stack;

import pr05_stack.Coin;

import java.util.Stack;

public class StackEx {

  /* Stack 사용 예시 */
  public static void main(String[] args) {
    Stack<Coin> coinBox = new Stack<Coin>();

    coinBox.push(new Coin(100));
    coinBox.push(new Coin(50));
    coinBox.push(new Coin(500));
    coinBox.push(new Coin(10));

    while (!coinBox.isEmpty()){
      Coin coin = coinBox.pop();
      System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
    }
  }
}

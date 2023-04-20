package pr01_exception;

public class Account {
  private long balance;

  public Account(){}

  public long getBalance(){
    return balance; // 현재 저금된 금액
  }

  public void deposit(int money){
    balance += money;
  }

  public void withdraw(int money) throws BlifException {
    if (balance < money){
      throw new BlifException("잔고 부족 : " + (money - balance) + "모자람");
    }
    balance -= money;
  }
}

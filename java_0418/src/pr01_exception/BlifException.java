package pr01_exception;

public class BlifException extends Exception{
  public BlifException(){

  }

  public BlifException(String message){
    super(message);
  }
}

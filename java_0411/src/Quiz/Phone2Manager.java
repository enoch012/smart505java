package Quiz;

import java.util.Scanner;

public class Phone2Manager {

  // Scanner 클래스 타입의 객체를 필드로 사용하여 해당 클래스 전체에서 사용할 수 있도록 함
  private Scanner sc = new Scanner(System.in);


  // 연락처 정보 입력 받기
  private Phone2[] inputPhone2(){
    System.out.print("인원수 >>");
    int count = sc.nextInt();

    Phone2[] phones = new Phone2[count];

    for(int i=0; i<phones.length; i++){
      System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>");
      String name = sc.next();
      String tel = sc.next();

      // 입력받는 정보를 통해서 객체를 생성과 동시에 저장
      phones[i] = new Phone2(name, tel);
    }

    System.out.println("저장되었습니다!");

    return phones;
  }

  // 이름 찾아서 전화번호 반환하기
  private String search(String name, Phone2[] phones){
    String tel = "";
    // 입력된 배열의 크기만큼 반복하면서 사용자를 검색
    for (int i = 0; i < phones.length; i++) {
      if (phones[i].getName().equals(name)){
        tel = phones[i].getTel();
        break;
      }
    }

    return tel;
  }

  private void printResult(String name, String tel){
    if(tel.equals("")){
      System.out.println(name + "이 없습니다.");
    } else {
      System.out.println(name + "의 번호는 " + tel + "입니다.");
    }
  }



  public void run(){
    // 연락처 정보 입력 받아 배열에 바로 저장
    Phone2[] phones = inputPhone2();

    String name = "";
    String tel = "";

    while (true){
      System.out.print("검색할 이름 >>");
      name = sc.next();

      if(name.equals("exit")){
        break;
      }

      tel = search(name, phones);

      printResult(name, tel);

    }

    System.out.println("프로그램을 종료합니다.");


  }


}

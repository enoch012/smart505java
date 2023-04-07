import java.util.Calendar;

public class EnumWeekEx {

  public static void main(String[] args) {
    /* ����ڰ� ������ ������ ������ Ÿ���� week�� ����Ͽ� ���� today�� ����
    * ���� today �� ������ �� �ִ� �����ʹ� week ������ Ÿ�Կ� ��ϵ� �����͸� ��� ����.*/

    Week today = null; // ������ Ÿ���� week ��� �ϰ� week ���� �ִ� ���� ������ �� �ִ�.

    // �ڹ��� ��¥ ������ �������� Ŭ����
    Calendar cal = Calendar.getInstance();

    // Calendar.DAY_OF_WEEK : ������ ���� ������ 1~7�� ���ڷ� ��������.
    int week = cal.get(Calendar.DAY_OF_WEEK);

    switch(week){
      case 1 :
        today = Week.MONDAY;
        break;

      case 2 :
        today = Week.TUESDAY;
        break;

      case 3 :
        today = Week.WEDNESDAY;
        break;

      case 4 :
        today = Week.THURSDAY;
        break;

      case 5 :
        today = Week.FRIDAY;
        break;

      case 6 :
        today = Week.SATURDAY;
        break;

      case 7 :
        today = Week.SUNDAY;
        break;
    }

    System.out.println("���� ���� : " + today);

    if (today == Week.SUNDAY){
      System.out.println("�Ͽ��Ͽ��� �౸�� �մϴ�.");
    } else {
      System.out.println("������ �ڹ� ���θ� �մϴ�.");
    }
  }

}

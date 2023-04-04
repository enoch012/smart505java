public class Hello {
    // 메소드(자바스크립트의 함수와 동일한 기능을 가지고 있음)
    // 클래스의 멤버인 함수를 메소드라고 함
    // 클래스의 멤버가 아닐 경우 함수라고 함

    /*
    * 클래스 규칙
    * 1) 파일명은 해당 클래스 이름
    * 2) 하나의 파일에 하나의 클래스 작성
    * 3) 클래스 이름은 첫 글자는 대문자, 나머지는 소문자
    * 4) 2개 이상의 단어로 이름을 정할 경우 각 단어의 첫글자는 대문자
    * 5) 파일명과 같은 클래스만 public을 사용할 수 있음.
     * */

    public static int sum(int n, int m){ // 리턴 타입과 변수 타입을 숫자로 지정한 것
        return n+m;
    }

    // 자바 프로그램의 시작점(main())
    public static void main(String[] args){
        // 데이터 타입 구분
        int i = 20;
        int s;
        char a;

        s = sum(i, 10);
        a = '?';

        System.out.println(a); // 자바스크립트의 console.log 같은 것
        System.out.println("Hello");
        System.out.println(s);
    }
}

package pr02_properties;

import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesEx {
  public static void main(String[] args) {
    Properties properties = new Properties();

    String path = PropertiesEx.class.getResource("database.properties").getPath(); // getResource 자바 리소스 파일을 읽어옴, getPath 경로까지 같이 들고옴

    System.out.println(path); // 파일 경로가 찍힘

    try {
      // 파일 경로 가져오기
      path = URLDecoder.decode(path, "UTF-8");

      // 파일을 로딩함
      properties.load(new FileReader(path));

      // getProperty(key) : 지정한 키 값과 연동된 value를 파일에서 가져옴
      // setProperty(key, value) : 키와 값을 설정

      String driver = properties.getProperty("driver");
      String url = properties.getProperty("url");
      String username = properties.getProperty("username");
      String password = properties.getProperty("password");

      System.out.println("driver : " + driver);
      System.out.println("url : " + url);
      System.out.println("username : " + username);
      System.out.println("password : " + password);

    } catch (IOException e){
      e.printStackTrace();
    }


  }
}

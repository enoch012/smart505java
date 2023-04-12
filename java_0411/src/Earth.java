public class Earth {

  /*상수는 관례적으로 대문자로 적어준다.
  * 단어가 조합될 때는 언더바를 붙여준다.*/
  static final double EARTH_RADIUS = 6400;
  static final double EARTH_SURDACE_AREA;

  static {
    EARTH_SURDACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
  }
}

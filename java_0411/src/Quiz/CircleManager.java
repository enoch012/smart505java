package Quiz;

import Quiz.Circle;

class CircleManager { // static 메소드만 가짐
  static void copy(Circle src, Circle dest){
    dest.setRadius(src.getRadius());
  }

  static boolean equals(Circle a, Circle b){
    if (a.getRadius() == b.getRadius()){
      return true;
    } else {
      return false;
    }
  }

}

package castingTest;

public class CastingTest02 {
   public static void main(String[] args) {
//      ""(문자열)과 +로 연결 되어서 "3"으로 들어가고+8과 연결되어 "38"이 된다
      System.out.println("" + 3 + 8);
      
//      아래 코드를 수정하여 결과가 11이 나오도록 한다.
      System.out.println(3 + 8 + "");
      
//      "1 + 3 = 4"
//      위의 문자열에서 4를 변수로 사용한다.
//      변수 선언
      int data = 4;
//      아래의 출력 메소드에서 사용한다.
//      출력 결과: "1 + 3 = 4"
      System.out.println("1 + 3 = " + data);
      
      String name = "한동석";
      String message = name + "님 환영합니다.";
      
      System.out.println(message);
      
  
   }
}





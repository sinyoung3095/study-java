package variableTest;

public class VariableTest {
   public static void main(String[] args) {
//      정수형, 변수명은 a, 값은 10, 단, 기본형으로 선언하다.
//      실수형, 변수명은 b, 값은 10.1563, 단, float으로 선언한다.
//      실수형, 변수명은 c, 값은 10.1563, 단, double로 선언한다.
//      문자형, 변수명은 d, 값은 A
//      문자열, 변수명은 e, 값은 ABC
      int age = 10;
      float floatNumber = 10.1563F;
      double doubleNumber = 10.1563;
      char grade = 'A';
      String data = "ABC";
      
      
//      각 변수를 사용하여 출력 메소드로 출력해본다.
      System.out.println(age + 5);
      System.out.println(floatNumber);
      System.out.println(doubleNumber);
      System.out.println(grade);
      System.out.println(data);
   }
}
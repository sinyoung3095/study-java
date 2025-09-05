package inputTest;

import java.util.Scanner;

public class InputTask02 {
   public static void main(String[] args) {
//      두 정수를 입력받은 뒤 곱셈 결과를 출력한다.
//      단, nextInt()가 아닌 next()로 사용한다.
      Scanner scanner = new Scanner(System.in);
      
//      초반 출력값을 저장
      String message = "두 개의 정수를 입력하세요.";
//      예시 문장을 저장
      String example = "예)4 5";
//      포멧 값을 저장
      String format = "%d * %d = %d";
      
      
      int number1 = 0, number2 = 0;
      int result = 0;
      
//      메시지 출력
      System.out.println(message);
      System.out.println(example);
      
//      한번에 두 숫자를 입력 받은 next는 공백을 기준으로 순차적으로 변수에 저장 
      number1 = Integer.parseInt(scanner.next());
      number2 = Integer.parseInt(scanner.next());
      
      result = number1 * number2;
      
//      printf로 출력시 (포멧 형식, 포멧 값, ... )
      System.out.printf(format, number1, number2, result);
   }
}

package operTest;

import java.util.Scanner;

public class OperTest02 {
   public static void main(String[] args) {
//      두 정수 입력받기
      int number1 = 0, number2 = 0;
      String result = "";
      String message = "두 정수를 입력하세요.\n예)2 5";
      Scanner scanner = new Scanner(System.in);
     
      System.out.println(message);
      number1 = scanner.nextInt();
      number2 = scanner.nextInt();
      
      
//      System.out.println(number1);
//      System.out.println(number2);
      
//      두 정수 비교
//      더 큰 값을 출력한다.
//      단, 두 수가 같을 경우 "두 수가 같습니다" 출력
//      
      result = number1 > number2 ? "더 큰값은 : "+ number1 :
    	  number2 == number1 ? "두 수가 같습니다." : "더 큰값은 : "+number2;
      
      System.out.println(result);
      
            
   }
}


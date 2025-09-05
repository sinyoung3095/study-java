package controlStatementTest;

import java.util.Scanner;

public class IfTest {
   public static void main(String[] args) {
//      두 정수 입력받기
      int number1 = 0, number2 = 0;
      String result = "";
      String message = "두 정수를 입력하세요.\n예)2 5";
      Scanner scanner = new Scanner(System.in);
      
      System.out.println(message);
      number1 = scanner.nextInt();
      number2 = scanner.nextInt();
      
      if(number1 > number2) {
         result = "큰 값: " + number1;
         
      }else if(number1 < number2) {
         result = "큰 값: " + number2;
         
      }else {
         result = "두 수는 같습니다.";
         
      }
      
      System.out.println(result);
   }
}


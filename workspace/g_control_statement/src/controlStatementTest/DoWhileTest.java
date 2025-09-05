package controlStatementTest;

import java.util.Scanner;

public class DoWhileTest {
   public static void main(String[] args) {
      String message = "1.통신 요금 조회\n2.번호 변경\n3.통신사 변경\n0.상담원 연결";
      
      Scanner scanner = new Scanner(System.in);
      int choice = 0;
//      실행문을 무조건 한번은 실행한다.
      do {
         System.out.println(message);
         choice = scanner.nextInt();
//      조건이 맞으면 다시한번 실행한다.
      } while(choice != 0);
   }
}

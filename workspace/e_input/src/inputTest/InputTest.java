package inputTest;

import java.util.Scanner;

public class InputTest {
   public static void main(String[] args) {
//      이름을 입력받고 출력하기
	   
//     메시지 출력 값 저장
      String nameMessage = "이름: ";
//      이름 저장 받음
      String name = "";
      
//      스캐너 호출
      Scanner scanner = new Scanner(System.in);
      
//      메세지값 출력
      System.out.println(nameMessage);
//      입력받은 값 저장
      name = scanner.next();
      
      System.out.println(name);
      
   }
}


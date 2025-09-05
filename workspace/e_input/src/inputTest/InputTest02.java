package inputTest;

import java.util.Scanner;

public class InputTest02 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int age = 0;
      
      String message = "이름을 입력해주세요.";
      String ageMessage = "나이를 입력해주세요.";
      String name = "";
      
      System.out.println(ageMessage);
      age = scanner.nextInt();

//      nextLine()은 앞에서의 엔터(\n)를 먹기 때문에
//      기존 입력 알고리즘에 문제가 생길 수 있다.
//      따라서 nextLine()으로 입력받기 전 다른 입력이 실행되었다면,
//      반드시 \n을 먹어줄 nextLine()을 사용해준다.
      scanner.nextLine();
      
      System.out.println(message);
      name = scanner.nextLine();
      
      System.out.println(name);
      System.out.println(age + "살");
   }
}



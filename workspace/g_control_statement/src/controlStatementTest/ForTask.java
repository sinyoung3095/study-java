package controlStatementTest;

import java.util.Scanner;

public class ForTask {
   public static void main(String[] args) {
//      반복의 핵심은 반복횟수 최소화이다.

//      브론즈
//      1 ~ 100까지 출력
//      for (int i = 0; i < 100; i++) {
//         System.out.println(i + 1);
//      }

//      100 ~ 1까지 출력
//      for (int i = 0; i < 100; i++) {
//         System.out.println(100 - i);
//      }

//      1 ~ 100까지 중 짝수만 출력
//      for (int i = 0; i < 50; i++) {
//         System.out.println((i + 1) * 2);
//      }

//      짝수: 2의 배수다
//      홀수: 2의 배수가 아니다
//      2의 배수란, 2로 나누었을 때 나머지가 0인 수이다.
//      나머지 연산자: %(모듈러스)
//      예시) 10 % 3 == 1
//      System.out.println(10 % 3);
//      System.out.println(11 % 2 == 0);

//      for (int i = 0; i < 100; i++) {
//         if((i + 1) % 2 == 0) {
//            System.out.println(i + 1);
//         }
//      }

//      실버
//      1 ~ 10까지 합 출력
//      int result = 0;
//      for (int i = 0; i < 10; i++) {
////         result = result + i + 1;
////         첫 번째 반복: result = 0 + 1
////         두 번째 반복: result = (0 + 1) + 2
////         세 번째 반복: result = (0 + 1 + 2) + 3
////         네 번째 반복: result = (0 + 1 + 2 + 3) + 4
//         result += i + 1;
//      }
//      
//      System.out.println(result);

//      1 ~ n까지 합 출력(n은 사용자에게 입력받는다)
//      Scanner scanner = new Scanner(System.in);
//      String message = "1~n까지의 합\nn: ";
//      int end = 0, result = 0;
//
//      System.out.print(message);
//      end = scanner.nextInt();
//
//      for (int i = 0; i < end; i++) {
//         result += i + 1;
//      }
//      System.out.println(result);

//      골드
//      A ~ F까지 출력
//      for (int i = 0; i < 6; i++) {
//         char c = (char)(65 + i);
//         System.out.println(c);
//      }

//      A ~ F까지 중 C 제외하고 출력
//      for (int i = 0; i < 5; i++) {
//         System.out.println((char)((i > 1 ? 66 : 65) + i));
//      }

//      다이아
//      0 1 2 3 0 1 2 3 0 1 2 3 출력
//      for (int i = 0; i < 12; i++) {
//         System.out.print(i % 4 + " ");
//      }
//      System.out.println();

//      aBcDeFgH...Z 출력
//      for (int i = 0; i < 26; i++) {
//         int target = i % 2 == 0 ? 97 : 65;
//         System.out.print((char)(i + target));
//      }
//      System.out.println();
   }
}






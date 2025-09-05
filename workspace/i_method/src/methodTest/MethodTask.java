package methodTest;

import java.util.Scanner;

public class MethodTask {
//   1 ~ 10까지 println()으로 출력하는 메소드
   void printFrom1To10() {
      for (int i = 0; i < 10; i++) {
         System.out.println(i + 1);
      }
   }

//   "홍길동"을 n번 println()으로 출력하는 메소드
   void printHong(int n) {
      for (int i = 0; i < n; i++) {
         System.out.println("홍길동");
      }
   }

//   이름을 n번 println()으로 출력하는 메소드
   void printName(String name, int n) {
      for (int i = 0; i < n; i++) {
         System.out.println(name);
      }
   }

//   세 정수의 뺄셈 메소드
//   int subtract(int number1, int number2, int number3){
//      return number1 - number2 - number3;
//   }

//   int subtract(int[] arNumber){
//      int result = 0;
//      
//      arNumber[0] *= -1;
//      
//      for (int i = 0; i < arNumber.length; i++) {
//         result -= arNumber[i];
//      }
//      return result;
//   }

//   두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드
//   return 값은 반드시 1개만 가능하다.
   int[] divide(int number1, int number2) {
      int[] arResult = new int[2];

      if (number2 != 0) {
         arResult[0] = number1 / number2;
         arResult[1] = number1 % number2;
         return arResult;
      }

      return null;
   }

//   1 ~ n까지의 합을 구해주는 메소드
   int getTotal(int n) {
      int result = 0;
      for (int i = 0; i < n; i++) {
         result += i + 1;
      }
      return result;
   }

//   문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
   String changeABC(String content) {
      String result = "";

      for (int i = 0; i < content.length(); i++) {
         char c = content.charAt(i);

         if (c >= 97 && c <= 122) {
            result += (char) (c - 32);

         } else if (c >= 65 && c <= 90) {
            result += (char) (c + 32);

         } else {
            result += c;
         }
      }

      return result;
   }

//   한글을 정수로 바꿔주는 메소드
//   일공이사 -> 1024
   int changeToInteger(String data) {
      String hangeul = "공일이삼사오육칠팔구";
      String temp = "";

      for (int i = 0; i < data.length(); i++) {
         temp += hangeul.indexOf(data.charAt(i));
      }

      return Integer.parseInt(temp);
   }

//   정수를 한글로 바꿔주는 메소드
//   1024 -> 일공이사
   String changeToHangeul(int number) {
      String hangeul = "공일이삼사오육칠팔구";
      String result = "";

      while (number != 0) {
         result = hangeul.charAt(number % 10) + result;
         number /= 10;
      }

      return result;
   }

//   문자열과 문자를 입력받고 해당 문자가 몇 개 있는지 구하기
//   입력 예) banana, a
//   출력 예) 3
   int getCount(String content, char c) {
      int count = 0;
      for (int i = 0; i < content.length(); i++) {
         if (content.charAt(i) == c) {
            count++;
         }
      }
      return count;
   }

//   1~100을 입력받고 짝수만 리턴하는 메소드
   int[] getEven(int[] arData) {
      int[] arEven = new int[50];
      for (int i = 0; i < arEven.length; i++) {
         arEven[i] = arData[i * 2 + 1];
      }
      return arEven;
   }

//   숙제
//   문제 5개 만들어서 풀어오기

//  짝수인지 홀수인지 0인지 구분하여 알맞은 문자열값을 리턴
   String ouput(int input) {
      if (input == 0) {
         return "0입니다.";
      }

      if (input % 2 == 1) {
         return "홀수입니다.";
      }

      return "짝수입니다";
   }

//   대소문자 구분 없이 처리
   int countVowels(String text) {
      text = text.toUpperCase();
      String vowels = "AEIOU";

      int count = 0;

      for (int i = 0; i < text.length(); i++) {
         char ch = text.charAt(i);
         if (vowels.indexOf(ch) != -1) {
            count++;
         }
      }
      return count;
   }

//   다섯 개의 정수를 입력받고 짝수만 리턴하는 메소드
   int[] getEvens(int[] arData) {
      int count = 0;
      int[] arEven = null;
      int index = 0;

      for (int i = 0; i < arData.length; i++) {
         if (arData[i] % 2 == 0) {
            count++;
         }
      }

      arEven = new int[count];

      for (int i = 0; i < arData.length; i++) {
         if (arData[i] % 2 == 0) {
            arEven[index++] = arData[i];
         }
      }

      return arEven;
   }

//  문자열에서 대문자 개수 세기
   int changeABC2(String capital) {
      String result = "";
      for (int i = 0; i < capital.length(); i++) {
         char c = capital.charAt(i);
         if (64 < c && c < 91) {
            result += (char) (c);
         }
      }
      return result.length();
   }
   
//   두 정수를 입력받고 두 정수 사이의 수를 모두 합한다.
//   단, 양수만 가능
   int getTotalFromStartToEnd(int firstNumber, int lastNumber){
      if(firstNumber > lastNumber) {
         return getTotal(lastNumber, firstNumber);
      }
      
      return getTotal(firstNumber, lastNumber);
      
   }
   
//   n ~ m까지의 합
   int getTotal(int start, int end){
      int result = 0;
      for (int i = start + 1; i < end; i++) {
         result += i;
      }
      
      return result;
   }

//   5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
   int[] getMaxAndMin(int[] arData){
      int[] result = new int[2];
      
      for (int i = 0; i < result.length; i++) {
         result[i] = arData[0];
      }
      
      for (int i = 1; i < arData.length; i++) {
         if(result[0] < arData[i]) {
            result[0] = arData[i];
         }
         if(result[1] > arData[i]) {
            result[1] = arData[i];
         }
      }
      
      return result;
   }
   
//   
   void increase(int[] data) {
      data[0] = data[0] + 10;
   }
   
//   5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
   void getMaxAndMin2(int[] arData, int[] result){
      
      for (int i = 0; i < result.length; i++) {
         result[i] = arData[0];
      }
      
      for (int i = 1; i < arData.length; i++) {
         if(result[0] < arData[i]) {
            result[0] = arData[i];
         }
         if(result[1] > arData[i]) {
            result[1] = arData[i];
         }
      }
   }
   
   public static void main(String[] args) {
//      메소드를 선언했다면, 반드시 사용해서 테스트한다.

      Scanner scanner = new Scanner(System.in);

      MethodTask methodTask = new MethodTask();
//      methodTask.printFrom1To10();
//      methodTask.printHong(10);

//      String message = "이름: ";
//      System.out.print(message);
//      methodTask.printName(scanner.next(), 5);

//      int[] arNumber = {3, 4, 1};
//      int result = methodTask.subtract(arNumber);
//      System.out.println(result);

//      int[] arResult = methodTask.divide(10, 3);
//      
//      if(arResult == null) {
//         System.out.println("0으로 나눌 수 없습니다.");
//      }else {
//         System.out.println("몫: " + arResult[0]);
//         System.out.println("나머지: " + arResult[1]);
//      }

//      int result = methodTask.getTotal(10);
//      System.out.println(result);

//      String result = methodTask.changeABC("aBcDefff!@#!@#123");
//      System.out.println(result);

//      int result = methodTask.changeToInteger("공공공공공공공일");
//      System.out.println(result);

//      String data = methodTask.changeToHangeul(48125750);
//      System.out.println(data);

//      int count = methodTask.getCount("banana", 'z');
//      System.out.println(count);

//      int[] arData = new int[100];
//      int[] arEven = null;
//
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = i + 1;
//      }
//
//      arEven = methodTask.getEven(arData);
//
//      for (int i = 0; i < arEven.length; i++) {
//         System.out.println(arEven[i]);
//      }
      
//      int[] result = methodTask.getMaxAndMin(new int[] {3, 5, 1, 2, 6});
//      for (int i = 0; i < result.length; i++) {
//         System.out.println(result[i]);
//      }
      
//      int[] data = {0};
//      methodTask.increase(data);
//      System.out.println(data[0]);

      int[] result = new int[2];
      methodTask.getMaxAndMin2(new int[] {3, 5, 1, 2, 6}, result);
      for (int i = 0; i < result.length; i++) {
         System.out.println(result[i]);
      }
   }
}

 



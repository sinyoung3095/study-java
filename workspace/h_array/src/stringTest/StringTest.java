package stringTest;

import java.util.Scanner;

public class StringTest {
   public static void main(String[] args) {
//      String의 초기값은 ""이 아니라 null이다.
      
//      선언 후 문자열 연결을 사용하고자 한다면, ""(빈 문자열)로 초기화한다.
//      String data = "";
      
//      선언 후 문자열 연결을 사용하지 않으면, null로 초기화한다.
      String data = null;
      
//      data += "ABC";
//      System.out.println(data);
      
//      data = "ABC";
//      System.out.println(data);
      
//      String data = "ABC";
//      System.out.println(data.length());
//      System.out.println(data.charAt(2));
//      System.out.println(data.indexOf('Z'));
      
      data = "CABCABC";
      System.out.println(data.indexOf('C'));
//    순차적으로 확인하여 첫번째 'C'가 나오는 인덱스의 번호를 출력
      System.out.println(data.lastIndexOf('C'));
//    역순으로 확인하여 첫번째 'C'가 나오는 인덱스의 번호를 출력
      System.out.println(data.contains("C"));
//    문자의 포함 여부를 확인하여 포함되어있으면 true
      System.out.println(data.contains("Z"));
//    문자의 포함 여부를 확인하여 포함되어 있지 않으면 false
      System.out.println(data.substring(1));
//    index 1번 부터 끝까지 추출해서 저장
      System.out.println(data.substring(1, 2));
//    index 1번 부터 2번 전까지 추출해서 저장
      System.out.println(data.substring(1, 3));
//    index 1번 부터 3번 전까지 추출해서 저장
      System.out.println(data.replace('A', 'Z'));
//    'A'문자에 'Z'를 저장
      System.out.println(data.replace('C', 'Z'));
//    'C'문자에 'Z'를 저장
      System.out.println(data.replaceAll("ABC", "Z"));
//    'ABC'문자에 'Z'를 저장
      
//      문자열 값 비교
//      String data1 = "ABC";
//      String data2 = "ABC";
//      
//      System.out.println(data1.equals(data2));
      
//      String data = "1,2,3,4,5";
//      String[] arData = data.split(",");
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);
//      }
      
//      String data = "가 나 다 라 마 바 사";
//      String[] arData = data.split(" ");
//      
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);
//      }
      
//      "www.naver.com/news";
//      String url = "www.naver.com/news";
//      String[] arData = url.split("/");
//      String target = arData[arData.length - 1];
//      
//      if(target.equals("news")) {
////         뉴스 페이지로 이동
//         
//      }
   }
}








package castingTest;

public class Encryption {
   public static void main(String[] args) {
//	   password에 문자열 저장
      String password = "ehdtjrdl1234";
//      암호화값 저장소, 복호화 저장소 선언
      String encryptedPassword = "", decryptedPassword = "";
//      암호화의 키값을 상수로 저장
      final int KEY = 3;
      
//      password의 각 문자에 키값을 곱하고 암호화 저장소에 저장
      for (int i = 0; i < password.length(); i++) {
         encryptedPassword += (char)(password.charAt(i) * KEY);
      }
      
      System.out.println(encryptedPassword);
      
//      encryptedPassword의 각 문자에 키값을 나누고 복호화 저장소에 저장
      for (int i = 0; i < encryptedPassword.length(); i++) {
         decryptedPassword += (char)(encryptedPassword.charAt(i) / KEY);
      }
      
      System.out.println(decryptedPassword);
      
   }
}

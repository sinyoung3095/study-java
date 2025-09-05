package methodTest;

public class MethodTest {
//	x값에 2을 곱하고 1을 더하는 f라는 메소드
   int f(int x){
      return 2 * x + 1;
   }
   
//   static
//   컴파일러가 가장 먼저 메모리에 할당해준다.
//   일반 메소드를 static 메소드에서 사용하기 위해서는 아래의 두 가지 방법이 존재한다.
//   1. 일반 메소드에 static을 작성하여 같은 시간대에 메모리로 올려준다.
//   2. 일반 메소드가 소속된 클래스를 Heap 메모리에 할당(new)하여 static이 찾을 수 있도록 한다.
//      즉, 메소드의 소속을 알려준다.
   public static void main(String[] args) {
//	  메소드 사용을 위한 선언
      MethodTest methodTest = new MethodTest();
      methodTest.f(3);
   }
}
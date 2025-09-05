package inputTest;

import java.util.Scanner;

public class InputTask01 {
	public static void main(String[] args) {
//		변수 값에 임시 값을 저장
		String name ="";
//		초반 출력 메시지를 변수로 저장
		String nameMessage = "반려동물 이름은: ";
//		결과를 출력하기 위한 변수를 저장
		String result = "";
		
//		입력값을 받기 위한 스캐너 호출
		Scanner sc = new Scanner(System.in);
		
		System.out.print(nameMessage);
//		이름을 입력받아서 name에 저장
		name = sc.next();
//		문장을 완성하여 result에 저장
		result = name + "의 주인님 환영합니다.";
		
		System.out.println(result);
		
	
	}
}

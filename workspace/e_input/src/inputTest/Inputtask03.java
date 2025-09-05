package inputTest;

import java.util.Scanner;

public class Inputtask03 {
	public static void main(String[] args) {
		
		int number1 = 0;
		int number2 = 0;
		int number3 = 0;
		int result = 0;
//		포맷 형식 정의
		String format = "%d*%d*%d=%d";
//		메시지값 변수로 저장
		String numberMessage = "곱셈 할 숫자 3개를 입력해주세요.";
//		예시값 저장
		String example = "예) 1 5 6";
		
//		스캐너 호출
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(numberMessage);
		System.out.println(example);
//		메시지 출력
		
//		입력 받은 값 변수에 저장
		number1 = scanner.nextInt();
		number2 = scanner.nextInt();
		number3 = scanner.nextInt();
		
//		곱셈 결과를 저장
		result = number1*number2*number3;
		
//		포멧에 맞춰서 값 입력
		System.out.printf(format,number1,number2,number3,result);
		
		
		
		
	}
}

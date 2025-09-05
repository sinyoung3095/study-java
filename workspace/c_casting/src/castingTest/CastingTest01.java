package castingTest;

public class CastingTest01 {
	public static void main(String[] args) {
//		정수와 정수를 나눠서 정수타입의 결과로 나온다.
		System.out.println(5/2);
//		정수와 실수를 나눠서 실수타입의 결과로 나온다.
//		강제형변환
		System.out.println(5/2.0);
//		정수와 강제형변환 된 실수를 나눠서 실수로 나온다.
		System.out.println(5/(double)2);
//		실수를 강제형변환하여 정수 값만 남고 정수 끼리 더해졌다.
		System.out.println((int)2.9+5);
		
//		실수를 강제형변환하여 정수 값만 남겼다.
//		8+2 =10
		int first = (int)8.43; 
		int second = (int)2.59;
		System.out.println(first+second);
		System.out.println((int)8.43+(int)2.59);

	}
}

package methodTest;

public class MethodPrectice {
	

	
//	1. 매개변수의 문자들의 각 문자사용 횟수 확인(소문자에 한함)
	String charnum(String a) {
		String result = "";
		int[] count = new int[26];
		char[] cha = new char[26];
		for (int i = 0; i < cha.length; i++) {
			cha[i]= (char)(97+i);
		for (int j = 0; j < a.length(); j++) {
			if(cha[i] == a.charAt(j)) {
				count[i] +=1;
			}
		}
		}for (int i = 0; i < count.length; i++) {
			result+=(char)(97+i)+":"+count[i]+"\n";
		}return result;
				}
//	2.입력된 문자를 거꾸로 반환		
	String reverse(String a){
		String result = "";
		for (int i = 0; i < a.length(); i++) {
			result+=a.charAt(a.length()-1-i);
		}
		return result;
	}
//	3.소수 구하기(실패)
	boolean isPrime(int num){
		boolean result = false;
		int count =0;
		for (int i = 1; i < num+1; i++) {
			if((double)num%i==0.0||(double)num%i==1.0) {
				count++;
				
			}
			if(count==2) {result=true;}
		}
		
		return result;
		
	}
	
//	두 정수를 입력받고 두 정수 사이의 수를 모두 합한다.
	
	
	
	
	public static void main(String[] args) {
		
	
		MethodPrectice test = new MethodPrectice();
		String result = "";
		boolean resu = false;
		String charnumer = "";
		char[] cha = new char[26];
		
		
		charnumer = test.charnum("sdnvjvnjiasfd");
		result=test.reverse("hello");
		resu=test.isPrime(6);
		
		System.out.println(charnumer);
		System.out.println(result);
		System.out.println(resu);
		
	}
}

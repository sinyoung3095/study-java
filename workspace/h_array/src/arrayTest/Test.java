package arrayTest;

public class Test {
public static void main(String[] args) {
//	int[] arr = {1, 2, 3, 4, 5};
//	int sum = 0;
//	
//	for (int i = 0; i < arr.length; i++) {
//		sum+=arr[i];
//	}
//	System.out.println(sum);
	
	int[] arr = {3, 9, -1, 0, 7};
	int max = 0, min =0;
	for (int i  = 0; i < arr.length; i++) {
	
		if(max<arr[i]) {
			max = arr[i];
		}
		if(min>arr[i]) {
			min = arr[i];
		}
		
		
	}System.out.println(max+","+min);
	
	
}
}

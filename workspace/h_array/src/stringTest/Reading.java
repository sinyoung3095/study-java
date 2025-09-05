package stringTest;

public class Reading {
public static void main(String[] args) {
	
	int[] arOriginalData = { 9, 1, 9, 2, 9 };
    boolean[] arCheck = new boolean[5];
    int[] arData = null;
    int count = 0, index = 0;
// 		arOriginalData의 길이의 1뺀 4번 반복
    for (int i = 0; i < arOriginalData.length - 1; i++) {
//    	J에다 i+1을 하고 arOriginalData 길이만큼 반복
       for (int j = i + 1; j < arOriginalData.length; j++) {
//    	arOriginalData의 i 인덱스 값과 j의 인덱스 값이 동일하면 카운트++
//    	   arCheck의 i인덱스에 true값 대입
//    	   i가 0일때 j는 1,4에 true
//    	   카운트 2 배열체크 0 인덱스는 True
          if (arOriginalData[i] == arOriginalData[j]) {
             count++;
             arCheck[i] = true;
             break;
          }
       }
    }
    
    arData = new int[arOriginalData.length - count];
    for (int i = 0; i < arCheck.length; i++) {
       if(!arCheck[i]) {
          arData[index++] = arOriginalData[i];
       }
    }
    
    for (int i = 0; i < arData.length; i++) {
       System.out.println(arData[i]);
    }
}
}

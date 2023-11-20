package 배열기본;

import java.util.Random;

public class 배열최솟값찾기 {

	public static void main(String[] args) {
		int[] n = {90, 80, 20, 60, 70};	
		int min = n[0]; //첫번째값부터 시작
		
		for (int x : n) {
			if(x < min) { // 80 < 90
				min = x; // min = 80
			}			
		}
		System.out.println(min);
		Print.arrayPrint(n);	
	}		
}

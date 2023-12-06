package 배열기본;

import java.util.Random;

public class 배열최댓값찾기 {

	public static void main(String[] args) {
		Random r = new Random();
		r.setSeed(100); //똑같은 데이터셋(의사랜덤) / Random()안에 넣어도됨.
		int[] n = new int[1000];
		int max = n[0]; 
		
		for (int i = 0; i < n.length; i++) {
			n[i] = r.nextInt(1000);
		}
		Print.arrayPrint(n);
		
		for (int x : n) {
			if (x > max) {
				max = x;
			}
		}
		System.out.println(max);
	}
			
}

package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 토익문제 {

	public static void main(String[] args) {
		int [] 답안 = new int[990]; //총문제수
		int [] 내답 = new int[990];
		
		Random r = new Random(18);
		
		for (int i = 0; i < 내답.length; i++) {
			답안[i] = r.nextInt(4); //0~3  객관식 번호
			내답[i] = r.nextInt(4); //0~3
		}
		System.out.println(Arrays.toString(답안));
		System.out.println(Arrays.toString(내답));
		
		//1개 맞으면 1점, 내점수는?
		
		int count = 0;
		for (int i = 0; i < 내답.length; i++) {
			if(답안[i] == 내답[i]) {
				count++;
			}
		}
		System.out.println(count);
		
	}//main


}

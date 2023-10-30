package 배열응용;

import java.util.Random;

public class 랜덤테스트 {

	public static void main(String[] args) {
		Random r = new Random(100);
		// r.setSeed(100);  or Random에 값넣기
		
		for (int i = 0; i < 1000; i++) {
			int data = r.nextInt(100);
			System.out.println(data);
		}
	}

}

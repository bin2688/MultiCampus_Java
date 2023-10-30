package 컬렉션;

import java.util.HashSet;
import java.util.Random;

public class 셋연습1 {

	public static void main(String[] args) {
		// 로또문제
		HashSet lotto = new HashSet();
		//고정길이, 같은 타입
		
		//랜덤하게 만들어서 배열에 6개의 숫자를 넣자.
		Random r = new Random();
		
			while (true) {
				lotto.add(r.nextInt(45) + 1); //0~44, +1 => 1~45
				if (lotto.size() == 6) {
					break;
				} 
			}
		System.out.println(lotto);
		
		
		
		
		
	}

}

package 제어문.반복문;

import java.util.Random;

public class 랜덤Test {

	public static void main(String[] args) {
		
		Random r = new Random();
		// int target = r.nextInt(); //int는 +-21억 중에서 랜덤
		//int target = r.nextInt(10); //0부터 지정한 값보다 하나 적게설정 가능!
		//int target = r.nextInt(100); //0 ~ 99
		int target = r.nextInt(99) + 1; //1 ~ 99
		System.out.println(target);
	}

}

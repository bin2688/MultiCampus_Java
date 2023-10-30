package 배열응용고급;

import java.util.Arrays;
import java.util.Scanner;

public class 스트링배열2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("전화번호입력>>  ");
		String p = sc.next();
		
		String[] p1 = p.split("-");
		System.out.println(Arrays.toString(p1));
		
	
		
		if (p1[0].equals("011")) {
			System.out.println("SK");
		} else if(p1[0].equals("019")) {
			System.out.println("LG");
		} else {
			System.out.println("Apple");
	  }
		if (p1[1].length() >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}
		
		int sum = 0;
		for (String x : p1) {
			sum = sum + x.length(); 
		}
		System.out.println(sum);
		if (sum >= 10) {
			System.out.println("유효한 전화번호");
		} else {
			System.out.println("유효한 전화번호");
		}
		
		
		
	}
}

package 제어문.반복문;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		// System.out.println("com>>" + com); 작동확인용
		
		//내가 0~2입력
		
		int com = r.nextInt(3); // 0, 1, 2
		System.out.print("me>>");
		int me = sc.nextInt();
		
		System.out.println(com + " " + me);
		
		if(me==0) {
			if(com==0) {
				System.out.println("무승부");
			} else if(com ==1) {
				System.out.println("컴 승");			
			} else {
				System.out.println("나 승");							
			}
		} else if(me ==1) {
			if(com==0) {
				System.out.println("나 승");
			} else if(com ==1) {
				System.out.println("무승부");			
			} else {
				System.out.println("컴 승");							
			}
			
		} else {
			if(com==0) {
				System.out.println("컴 승");
			} else if(com ==1) {
				System.out.println("나 승");			
			} else {
				System.out.println("무승부");							
			}
			
			System.out.println("종료하실래요?");
			String exit = sc.next();
			if(exit.equals("x")) {
				System.out.println("종료합니다.");
				System.exit(0);
			}
			
		}

	}

}

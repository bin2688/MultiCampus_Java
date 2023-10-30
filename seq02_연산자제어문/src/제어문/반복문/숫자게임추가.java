package 제어문.반복문;

import java.util.Scanner;


public class 숫자게임추가 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 while (true) {
			System.out.print("숫자입력1>>");
			int num1 = sc.nextInt();
			System.out.print("숫자입력2>>");
			int num2 = sc.nextInt();
			
			if (num1 == num2) {
				System.out.println("두 수가 같습니다.");		
			} else if (num1 > num2) {
				System.out.println("앞 숫자가 더 큽니다.");		
			} else {
				System.out.println("뒷 숫자가 더 큽니다.");
			} 
			System.out.print("더 하시겠습니까?? 종료 x>> ");
			String choice = sc.next();
			//char choice2 = choice.charAt('x');
			//if (choice2 == 'x')
			String choice2 = choice.toLowerCase();//소문자로 변경 
			if (choice.equals("x") || choice.equals("X")) {
				System.out.println("종료합니다.!");
				System.exit(0);
	
			 }
			 
		} 
		 

	}
}

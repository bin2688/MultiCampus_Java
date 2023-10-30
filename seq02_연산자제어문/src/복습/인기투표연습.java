package 복습;

import java.util.Scanner;

public class 인기투표연습 {

	public static void main(String[] args) {
		// 1. 입력받는 것
		Scanner sc = new Scanner(System.in);
		int iu = 0;
		int you = 0;
		int bts = 0;
		while (true) {
			System.out.print("입력 1)아이유 2)유재석 3)방탄 4) 종료>> ");
			int choice = sc.nextInt();
			if (choice == 4) {
				System.out.println("프로그램을 종료합니다.");
				System.out.println("아이유 득표수 " + iu);
				System.out.println("유재석 득표수 " + you);
				System.out.println("방탄 득표수 " + bts);
				System.exit(0);
			} else if (choice == 1) {
				iu++;
			} else if (choice == 2) {
				you++;
			} else if (choice == 3) {
				bts++;
			} else { // 1,2,3,4도 아닌경우!
				System.out.println("잘못 입력함.");
			}
		} // while

		// 2. 무한루프 변경 --> 종료시점 명시
		// 3. 종료하고 나서 처리

	}

}
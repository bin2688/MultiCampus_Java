package 제어문.반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 숫자맞추기게임 {

	public static void main(String[] args) {
		Random r = new Random();
		int target = r.nextInt(99) + 1;
		int total = 0;

		while (true) {
			String data = JOptionPane.showInputDialog("숫자를 입력");
			int date2 = Integer.parseInt(data); // 데이터타입 동일해야함
			// cpu가 ram에 들어 있는 값을 가져다가 1을 증가시키고 다시 램에 넣습니다.
			// total = total + 1;
			total++;
			if (target == date2) {
				System.out.println("정답입니다.");
				System.out.println("게임을 종료합니다.");
				System.out.println("전체시도횟수" + total);
				System.exit(0);
			} else {
				System.out.println("정답이 아닙니다."); // while문 시작점으로 다시가서 시작
				if (target < date2) {
					System.out.println("정답보다 높습니다.");
				} else {
					System.out.println("정답보다 낮습니다.");
				}
			}
		}
	}

}

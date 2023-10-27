package 연산자;

import javax.swing.JOptionPane;

public class 입출력 {
	public static void main(String[] args) {
		// 망치. 망치질하다();
		String name = JOptionPane.showInputDialog("이름을 입력하세요."); // prompt 같은거
		JOptionPane.showMessageDialog(null, "당신의 이름은 " + name + "이군요");
		// 이 식에서 null은 창 위치, 그냥 정 가운데

		String hobby = JOptionPane.showInputDialog("당신의 취미는 무엇인가요?");
		JOptionPane.showMessageDialog(null, name + "님의 취미는" + hobby + "입니다.");

		String wakeup = JOptionPane.showInputDialog("당신은 몇시에 일어나나요?");
		JOptionPane.showMessageDialog(null, hobby + "은" + wakeup + "에 시작할 수 있군요!");

		System.out.println("당신의 이름은" + name + "이군요."); // document.write 같은거
		System.out.println(name + "님의 취미는" + hobby + "입니다.");
		System.out.println(hobby + "은 " + wakeup + "에 시작할 수 있군요!");

		// 문자열을 숫자로 변경해주는 작업은 굉장히 자주 사용.
		// 정수.분석해서정수로바꿔줘(스트링);
		int time = Integer.parseInt(wakeup);

		int result = time + 1; // "9" + 1 ==> "91", 10
		System.out.println(hobby + "는  " + result + "시에 시작하자.");
	}

}

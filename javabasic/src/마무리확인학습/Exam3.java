package 마무리확인학습;

import javax.swing.JOptionPane;

public class Exam3 {
	public static void main(String[] args) {
		String company = JOptionPane.showInputDialog("통신사를 입력하세요.");
		String tel = JOptionPane.showInputDialog("전화번호를 입력하세요.");
		String name = JOptionPane.showInputDialog("가입자 이름을 입력하세요.");

		JOptionPane.showMessageDialog(null, name + "님은 " + company + "에 " + tel + "로 가입되셨습니다.");
		System.out.println(name + "님은 " + company + "에 " + tel + "로 가입되셨습니다.");
	}
}

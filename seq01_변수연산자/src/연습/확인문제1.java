package 연습;

import javax.swing.*;
//4500개는 java.~~(핵심부품), javax.~~(추가부품)
//패키지이름은 절대로 java, javax로 사용하지 않는다
public class 확인문제1 {

	public static void main(String[] args) {
		char pw =  'p';
		String pw2 = JOptionPane.showInputDialog("비밀번호 확인");  //"q"
		char pw3 = pw2.charAt(0); // 'q'
		
		if(pw3 == pw) {
			JOptionPane.showMessageDialog(null, "pass!");
		} else {
	     	JOptionPane.showMessageDialog(null, "재입력!");
		}
		
		 double weight =2.2;
		 if(weight > 2) {
			 JOptionPane.showMessageDialog(null, "다이어트 성공!!");
		 }
		
		 if(pw3 == pw && weight > 2) {
			 JOptionPane.showMessageDialog(null, "오늘은 성공!!");
		 } else {
		 JOptionPane.showMessageDialog(null, "내일 다시 도전!!");
		 }
	}
}
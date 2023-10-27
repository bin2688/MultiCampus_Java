package 마무리확인학습;

import javax.swing.JOptionPane;

public class Exam2 {
public static void main(String[] args) {
	String height = JOptionPane.showInputDialog("당신의 키는?");
	double height1 = Double.parseDouble(height);
	
	double result = (height1 - 100) * 0.9;
	
	JOptionPane.showMessageDialog(null, "키" + height + "일때 적정 몸무게는" + result);
	System.out.println("키" + height + "일때 적정 몸무게는" + result);
}
}

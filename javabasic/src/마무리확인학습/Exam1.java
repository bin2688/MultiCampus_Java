package 마무리확인학습;

import javax.swing.JOptionPane;

public class Exam1 {
	public static void main(String[] args) {
		String horizon = JOptionPane.showInputDialog("가로");
		String width = JOptionPane.showInputDialog("세로");
		int nemo1 = Integer.parseInt(horizon);
		int nemo2 = Integer.parseInt(width);
		
		int result = nemo1 * nemo2;

		JOptionPane.showMessageDialog(null, "사각형의 면적은" + result);
		System.out.println("사각형의 면적은" + result);
	}
}


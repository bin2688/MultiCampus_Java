package 배열스윙;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 많은부품만들기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1500, 1500);
		f.setTitle("나의 버튼들");
		f.setLayout(null);
		
		JButton[] buttons = new JButton[200];
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			buttons[i].setText("버튼" + i);
		}
	for (int i = 0; i < buttons.length; i++) {
		//	JButton b1 = new JButton();
		//	b1.setText("버튼1");
		Random r = new Random();
		int x = r.nextInt(1500);
		int y = r.nextInt(1000);
		buttons[i].setBounds(x, y, 100, 50); //(가로위치,세로위치,가로크기,세로크기)
		buttons[i].setBackground(Color.black);
		buttons[i].setForeground(Color.white);
		f.add(buttons[i]);
	}		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}

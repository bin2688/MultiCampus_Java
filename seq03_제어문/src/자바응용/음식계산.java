package 자바응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 음식계산 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(50, 70);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton f1 = new JButton();
		f1.setText("짬뽕");
		JButton f2 = new JButton();
		f2.setText("우동");
		JButton f3 = new JButton();
		f3.setText("짜장");

		JLabel amg = new JLabel();
		ImageIcon icon = new ImageIcon("bird.jpg");
		amg.setIcon(icon);
		JLabel l1 = new JLabel();
		l1.setText("개수 : 0  개 ");

		JLabel l2 = new JLabel();
		l2.setText("결제금액");

		Font font = new Font("나눔스퀘어라운드 ExtraBold", 1, 50);
		f1.setFont(font);
		f1.setBackground(Color.pink);
		f2.setFont(font);
		f2.setBackground(Color.orange);
		f3.setFont(font);
		f3.setBackground(Color.blue);
		l1.setFont(font);
		l2.setFont(font);

		f.add(f1);
		f.add(f2);
		f.add(f3);
		f.add(l1);
		f.add(amg);
		f.add(l2);

		f.setVisible(true);
	}

}

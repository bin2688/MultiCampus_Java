package 메서드활용;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 나만의영화앨범 {
	public static int start = 2;

	public static void main(String[] args) {
		String[] title = { "30일", "화사한그녀", "천박사 퇴마 연구소", "1947 보스톤", "화란" };
		String[] img = { "30일.PNG", "화사한그녀.PNG", "천박사.PNG", "보스톤.PNG", "화란.PNG" };
		double[] jumsu = { 7.7, 9.4, 6.0, 7.6, 6.5 };

		JFrame f = new JFrame("나의 영화앨범");
		f.setSize(450, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setBackground(Color.green);

		JLabel top = new JLabel(title[2]);
		ImageIcon icon = new ImageIcon(img[2]); // 이미지 넣는법
		JLabel center = new JLabel();
		center.setIcon(icon);
		JLabel under = new JLabel(String.valueOf(jumsu[2])); // JLabel은 스트링만됨


		JButton right = new JButton(" >> ");
		right.setBackground(Color.yellow);
		right.setForeground(Color.red);
		JButton left = new JButton(" << ");
		left.setBackground(Color.yellow);
		left.setForeground(Color.red);

		Font font = new Font("맑은 고딕", Font.BOLD, 40);
		top.setFont(font);
		center.setFont(font);
		under.setFont(font);
		right.setFont(font);
		left.setFont(font);

		left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (start > 0) {
					start--;
					top.setText(title[start]);
					under.setText(jumsu[start] + "");
					ImageIcon icon = new ImageIcon(img[start]); // 이미지 new연산자 다시넣어야함
					center.setIcon(icon);

				} else {
					JOptionPane.showMessageDialog(f, "마지막입니다.");
				}

			}
		});

		right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (start < 4) {
					start++;
					top.setText(title[start]);
					under.setText(jumsu[start] + "");
					ImageIcon icon = new ImageIcon(img[start]);
					center.setIcon(icon);
				} else {
					JOptionPane.showMessageDialog(f, "마지막입니다.");
				}

			}
		});

		f.add(top, BorderLayout.NORTH);
		f.add(center, BorderLayout.CENTER);
		f.add(under, BorderLayout.SOUTH);
		f.add(right, BorderLayout.EAST);
		f.add(left, BorderLayout.WEST);

		f.setVisible(true);
	}

}

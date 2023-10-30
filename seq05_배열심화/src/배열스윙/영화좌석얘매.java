package 배열스윙;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 영화좌석얘매 {

	static int count = 0;
	static String no = "";
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1500, 1000);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton[] b1 = new JButton[500];
		
		for (int i = 0; i < b1.length; i++) {
			b1[i] = new JButton();
			b1[i].setText(String.valueOf(i)); // setText는 string만 가능 그래서 i를 string으로 변경
		}
		Color[] colors = {Color.yellow,Color.white,Color.pink};
		for (int i = 0; i < b1.length; i++) {
			Random r = new Random();
			int index = r.nextInt(3);
			b1[i].setBackground(colors[index]);
			b1[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					count++;
					String s = e.getActionCommand();//버튼위의 글자를 가져온다.

					int pay = count * 10000;
					JOptionPane.showMessageDialog(f, s + "\n영화표의 가격은" + pay + "원.");
					
				}
			});
			
			
			f.add(b1[i]);
		}
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}

package 배열스윙;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 랜덤버튼배열 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1500, 1000);
		f.setLayout(null);
		
		JButton[] b1 = new JButton[500];
		
		for (int i = 0; i < b1.length; i++) {
			b1[i] = new JButton();
			b1[i].setText("눌러봐" + i);
		}
		Color[] colors = {Color.black,Color.white,Color.pink};
		for (int i = 0; i < b1.length; i++) {
			Random r = new Random();
			int x = r.nextInt(1500);
			int y = r.nextInt(1000);
			int index = r.nextInt(3);
			b1[i].setBounds(x, y, 200, 100);
			b1[i].setBackground(colors[index]);
			b1[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String s = e.getActionCommand();//버튼위의 글자를 가져온다.
					JOptionPane.showMessageDialog(f, s + "눌러버리다니");
					
				}
			});
			
			
			f.add(b1[i]);
		}
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}

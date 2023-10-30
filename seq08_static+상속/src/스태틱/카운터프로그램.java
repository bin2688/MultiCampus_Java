package 스태틱;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 카운터프로그램 {
	public static int count;
	
	public static void main(String[] args) {
		JFrame f = new JFrame("나의 카운터 프로그램");
		f.setSize(800, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// FlowLayout flow = new FlowLayout();
		f.setLayout(new FlowLayout()); //주소를 계속 쓸일이없으면 변수저장 안해도됨
		
		JButton plus = new JButton("1더하기");
		JButton reset = new JButton("0으로 초기화");
		JButton minus = new JButton("1빼기");
		JLabel number = new JLabel("0");
		number.setBackground(Color.red);
		
		Font font = new Font("맑은 고딕", Font.BOLD, 50);
		plus.setFont(font);
		reset.setFont(font);
		minus.setFont(font);
		number.setFont(new Font("맑은 고딕", Font.BOLD, 150));
					
		f.add(plus);
		f.add(reset);
		f.add(minus);
		f.add(number);
		
		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				number.setText(String.valueOf(count));
				
			}
		});
		
		minus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count--;
				number.setText(String.valueOf(count));
				
			}
		});
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count = 0;
				number.setText(String.valueOf(count));
				
			}
		});
		
		
		f.setVisible(true);

	}

}

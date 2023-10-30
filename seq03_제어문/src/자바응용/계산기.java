package 자바응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 계산기 {

	public static void main(String[] args) {
		// 필요한 부품을 ram에 다 가져다 놓아야 한다.
		JFrame f = new JFrame();
		f.setSize(500, 700);
		// f.setBackground(Color.green);
		f.getContentPane().setBackground(Color.green); //제이프레임은 테두리라 전체배경은 판을 가지고와서 거기에 색넣어야함

		FlowLayout flow = new FlowLayout(); // 물흐르듯 순서대로 붙여줌
		f.setLayout(flow);

		JButton plus = new JButton();
		plus.setText("더하기");
		JButton minus = new JButton();
		minus.setText("빼기");
		plus.setBackground(Color.yellow);
		plus.setForeground(Color.blue);
		minus.setBackground(Color.yellow);
		minus.setForeground(Color.blue);

		// 글자 넣는 부품은 JLabel
		JLabel top = new JLabel(); //이미지 넣을 때도 씀
		ImageIcon icon = new ImageIcon("bird.jpg"); // 이미지 불러오기
		top.setIcon(icon);  // 이미지 넣기
		JLabel l1 = new JLabel();
		l1.setText("숫자1");
		l1.setForeground(Color.blue);
		JLabel l2 = new JLabel();
		l2.setText("숫자2");
		l2.setForeground(Color.blue);
		
		//html에서 input역할
		JTextField t1 = new JTextField(10);
		t1.setBackground(Color.red); //배경색
		t1.setForeground(Color.white);	
		JTextField t2 = new JTextField(10);
		t2.setBackground(Color.red);
		t2.setForeground(Color.white);

		// 위에서부터 순서대로 붙음
		f.add(top);
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(plus); 
		f.add(minus);

		// Font - 글자스타일
		Font font = new Font("나눔스퀘어라운드 ExtraBold", 1, 50); // (글꼴, 진하기, 크기)
		plus.setFont(font);
		minus.setFont(font);
		l1.setFont(font);
		t1.setFont(font);
		l2.setFont(font);
		t2.setFont(font);

		// 위에 설정한 코드 다 보여줘 (맨끝줄에 넣어야함)
		f.setVisible(true);
	}

}

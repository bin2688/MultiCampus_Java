package 자바응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 음식계산 {
	static int total = 0; // 클래스 전체에서 접근이 가능 // main안에 사용하기 위해서는 main밖에 있는 변수도 static붙여야함 (main도 static이라)
    static int [] count = {0, 0, 0};
    
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(800, 1500);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton f1 = new JButton();
		f1.setText("짬뽕");
		JButton f2 = new JButton();
		f2.setText("우동");
		JButton f3 = new JButton();
		f3.setText("짜장");
		JButton f4 = new JButton();
		f4.setText("결제하기");

		JLabel amg = new JLabel();
		ImageIcon icon = new ImageIcon("bird.jpg");
		amg.setIcon(icon);
		JLabel l1 = new JLabel();
		l1.setText("개수 : 0개 ");

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
		f4.setFont(font);

		f.add(f1);
		f.add(f2);
		f.add(f3);
		f.add(l1);
		f.add(amg);
		f.add(l2);
		f.add(f4);


		f1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("짬뽕선택함");
				total++;
				count[0]++;
				l1.setText("개수 :" + total + "개 ");
				l2.setText("결제금액 : " + total * 5000 + "원");
			} //add form
		}); //f1 add

		f2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("우동선택함");
				total++;
				count[1]++;
				l1.setText("개수 :" + total + "개 ");
				l2.setText("결제금액 : " + total * 5000 + "원");
			} //perform
		}); //f2 add

		f3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("짜장선택함");
				total++;
				count[2]++;
				l1.setText("개수 :" + total + "개 ");
				l2.setText("결제금액 : " + total * 5000 + "원");
			} //perform
		}); //f3 add

		f4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, 
					"짬뽕  " + count[0] + "개" + "\n" +
					"우동  " + count[1] + "개" + "\n" +
					"짜장  " + count[2] + "개" + "\n" +
					"총 결제금액 >>  " + total*5000 +  "원   " +  
					"이대로 결제 하시겠습니까?");
			} //perform
		}); //f4 add


		f.setVisible(true);
	}

}

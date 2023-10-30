package 메서드연습;

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
import javax.swing.JTextField;

public class 로그인화면 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("로그인화면");
		f.setSize(650, 900);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
				
		JLabel top = new JLabel();
		// top.setText("<<<이미지 들어가는 곳>>>");
		JLabel id1 = new JLabel();
		id1.setText("id :  ");
		JLabel pw1 = new JLabel();
		pw1.setText("pw :  ");
		
		JTextField id2 = new JTextField(10);
		id2.setBackground(Color.pink);
		id2.setForeground(Color.blue);
		JTextField pw2 = new JTextField(10);
		pw2.setBackground(Color.pink);
		pw2.setForeground(Color.blue);
		
		JButton login = new JButton();
		//login.setText("로그인");
		login.setBackground(Color.white);
		JButton reset = new JButton();
		//reset.setText("지우기");
		reset.setBackground(Color.white);
		
		ImageIcon icon1 = new ImageIcon("bird.jpg");
		top.setIcon(icon1);
		ImageIcon icon2 = new ImageIcon("login.png");
		login.setIcon(icon2);
		ImageIcon icon3 = new ImageIcon("reset.png");
		reset.setIcon(icon3);
		
		Font font = new Font("맑은 고딕", 1 , 50);
		top.setFont(font);
		id1.setFont(font);
		pw1.setFont(font);
		id2.setFont(font);
		pw2.setFont(font);
		login.setFont(font);
		reset.setFont(font);
		
		f.add(top);
		f.add(id1);
		f.add(id2);
		f.add(pw1);
		f.add(pw2);
		f.add(login);
		f.add(reset);				
		
		login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//login버튼을 눌렀을 때 실행할 내용을 넣기
				//버튼하나당 함수 하나
				String id3 = id2.getText();
				String pw3 = pw2.getText();
				if (id3.equals("root")  &&  pw3.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인 성공!");
				일기쓰기화면 diary = new 일기쓰기화면();
				diary.open();
				} else {
					JOptionPane.showMessageDialog(f, "로그인 실패!");					
				}
				
			}
		}); //add
		
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println("리셋");
				id2.setText("");  //void <-> id2.getText(); void(x)
				pw2.setText("");
		
			}
		}); //add		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}

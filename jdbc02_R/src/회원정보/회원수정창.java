package 회원정보;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 회원수정창 {

	public void fix() {
		JFrame f = new JFrame();
		f.setSize(400, 800);
		f.setTitle("나의 회원정보 UI");
		f.setLayout(new FlowLayout());
		f.getContentPane().setBackground(Color.yellow);
		
		ImageIcon icon = new ImageIcon("kakao.png");
		
		JLabel l1 = new JLabel();
		l1.setIcon(icon);
		JLabel l2 = new JLabel("회원ID : ");
		JLabel l3 = new JLabel("회원PW : ");
		JLabel l4 = new JLabel("회원이름: ");
		JLabel l5 = new JLabel("회원TEL: ");
		
		JTextField t1 = new JTextField(10); //10은 글자수
		t1.setForeground(Color.PINK);
		JTextField t2 = new JTextField(10); 
		t2.setForeground(Color.PINK);
		JTextField t3 = new JTextField(10); 
		t3.setForeground(Color.PINK);
		JTextField t4 = new JTextField(10); 
		t4.setForeground(Color.PINK);
		
		JButton b1 = new JButton("수정완료");
		b1.setBackground(Color.green);
		b1.setForeground(Color.blue);

		
		Font font = new Font("맑은 고딕", Font.BOLD, 30);
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);
		b1.setFont(font);

		
		f.add(l1); //component c ==> car종류이면 다들어올수있다.
		f.add(l2);
		f.add(t1);
		f.add(l3);
		f.add(t2);
		f.add(l4);
		f.add(t3);
		f.add(l5);
		f.add(t4);
		f.add(b1);

		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String tel = t4.getText();
				MemberDAO dao = new MemberDAO();
				dao.update(id, tel);
				
			}
		});
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}

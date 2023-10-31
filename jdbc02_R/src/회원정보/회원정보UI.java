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
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 회원정보UI {

	public static void main(String[] args) {
		// 필요한 부품을 RAM에 가져다 놓아야한다.

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

		JTextField t1 = new JTextField(10); // 10은 글자수
		t1.setForeground(Color.PINK);
		JTextField t2 = new JTextField(10);
		t2.setForeground(Color.PINK);
		JTextField t3 = new JTextField(10);
		t3.setForeground(Color.PINK);
		JTextField t4 = new JTextField(10);
		t4.setForeground(Color.PINK);

		JButton b1 = new JButton("회원가입 요청");
		b1.setBackground(Color.green);
		b1.setForeground(Color.blue);
		JButton b2 = new JButton("회원탈퇴 요청");
		b2.setBackground(Color.green);
		b2.setForeground(Color.blue);
		JButton b3 = new JButton("회원정보 수정");
		b3.setBackground(Color.green);
		b3.setForeground(Color.blue);
		JButton b4 = new JButton("회원검색 요청");
		b4.setBackground(Color.green);
		b4.setForeground(Color.blue);

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
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);

		f.add(l1); // component c ==> car종류이면 다들어올수있다.
		f.add(l2);
		f.add(t1);
		f.add(l3);
		f.add(t2);
		f.add(l4);
		f.add(t3);
		f.add(l5);
		f.add(t4);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 1. 입력한 값을 가지고 온다.
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				// 2. db처리하는 부품을 사용
				MemberDAO dao = new MemberDAO();
				MemberVO bag = new MemberVO();
				bag.setId(id);
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);
				// 3. db처리하는 부품에 입력한 값을 주면서 db해달라고 요청
				int result = dao.insert(bag);
				if (result ==1) {
					JOptionPane.showMessageDialog(f, "회원가입성공!!");
				}

			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String id = JOptionPane.showInputDialog("탈퇴할 아이디를 입력하세요.");
				MemberDAO dao = new MemberDAO();
				int result = dao.delete(id);
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "회원탈퇴성공!!");
				}
			}
		});

//		b3.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				String id = JOptionPane.showInputDialog("아이디를 입력하세요.");
//				String tel = JOptionPane.showInputDialog("변경할 번호를 입력하세요.");
//				MemberDAO dao = new MemberDAO();
//				dao.update(id, tel);
//			}
//		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				회원수정창 fi = new 회원수정창();
				fi.fix();
			}
		});
		
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//검색하고 싶은 id를 입력받아 저장
				String id = JOptionPane.showInputDialog("id를 입력");
				//MemberDAO를 사용
				MemberDAO dao = new MemberDAO();				
				//one(id)호출, id를 주면서 row 하나 검색 요청
				MemberVO bag = dao.one(id);
				JOptionPane.showMessageDialog(f, bag);
			}
		});
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}

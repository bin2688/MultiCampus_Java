package 게시판정보;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import 회원정보.MemberDAO;

public class 게시판메인 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(400, 800);
		f.setTitle("게시판");
		f.setLayout(new FlowLayout());
		f.getContentPane().setBackground(Color.yellow);

		JLabel l1 = new JLabel("나의 게시판");
		JLabel l2 = new JLabel("게시판 제 목  ");
		JLabel l3 = new JLabel("게시판 내 용  ");
		JLabel l4 = new JLabel("게시판 작성자 ");

		JTextField t1 = new JTextField(10);
		t1.setForeground(Color.PINK);
		JTextField t2 = new JTextField(10);
		t2.setForeground(Color.PINK);
		JTextField t3 = new JTextField(10);
		t3.setForeground(Color.PINK);

		JButton b1 = new JButton("게시물 작성 완료");
		b1.setBackground(Color.green);
		b1.setForeground(Color.blue);
		JButton b2 = new JButton("게시물 삭제 완료");
		b2.setBackground(Color.green);
		b2.setForeground(Color.blue);
		JButton b3 = new JButton("게시물 수정 완료");
		b3.setBackground(Color.green);
		b3.setForeground(Color.blue);

		Font font1 = new Font("맑은 고딕", Font.BOLD, 50);
		Font font = new Font("맑은 고딕", Font.BOLD, 30);
		l1.setFont(font1);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);

		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(l3);
		f.add(t2);
		f.add(l4);
		f.add(t3);
		f.add(b1);
		f.add(b2);
		f.add(b3);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String title = t1.getText();
				String content = t2.getText();
				String writer = t3.getText();
				BbsDAO dao = new BbsDAO();
				dao.insert(title, content, writer);

			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String no = JOptionPane.showInputDialog("삭제할 게시판 no입력");
				BbsDAO dao = new BbsDAO();
				dao.delete(Integer.parseInt(no));

			}
		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String no = JOptionPane.showInputDialog("no를 입력하세요.");
				String title = t1.getText();
				String content = t2.getText();
				BbsDAO dao = new BbsDAO();
				dao.update(title, content, Integer.parseInt(no));
			}
		});

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}

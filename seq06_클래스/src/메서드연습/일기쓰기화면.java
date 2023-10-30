package 메서드연습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 일기쓰기화면 {
	// 멤버변수
	// 멤버메서드(*)

	public void open() {
		JFrame f = new JFrame();
		f.setTitle("일기장 쓰기 화면");
		f.setSize(900, 900);
		f.getContentPane().setBackground(Color.yellow);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JLabel l1 = new JLabel();
		l1.setText("오늘의 날짜 ");
		JLabel l2 = new JLabel();
		l2.setText("오늘의 제목 ");
		JLabel l3 = new JLabel();
		l3.setText("오늘의 내용 ");

		JTextField t1 = new JTextField(10);
		t1.setBackground(Color.pink);
		t1.setForeground(Color.blue);
		JTextField t2 = new JTextField(10);
		t2.setBackground(Color.pink);
		t2.setForeground(Color.blue);
		JTextArea t3 = new JTextArea(5, 10); // 5줄 10글자
		t3.setBackground(Color.pink);
		t3.setForeground(Color.blue);

		JButton save = new JButton();
		save.setText("파일에 일기 저장");
		save.setBackground(Color.red);
		save.setForeground(Color.white);

		Font font2 = new Font("맑은 고딕", 1, 80);
		Font font = new Font("맑은 고딕", 1, 50);
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		save.setFont(font2);


		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(save);
		
		save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e2) {
				String day = t1.getText();
				String title = t2.getText();
				String content = t3.getText();
				try {
					FileWriter file = new FileWriter(day+ ".txt"); 
					file.write(day + "\n");
					file.write(title + "\n");
					file.write(content);
					file.close(); //stream을 닫는다.
					JOptionPane.showMessageDialog(f, "일기 저장 성공!");
				} catch (Exception e) {
					//대처할 내용
					System.out.println("에러발생함."); 
					e.printStackTrace(); //자세한 에러정보
				}
			}
		});
		

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}

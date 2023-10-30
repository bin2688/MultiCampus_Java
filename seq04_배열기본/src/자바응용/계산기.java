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
import javax.swing.JTextField;

public class 계산기 {

	public static void main(String[] args) {
		// 필요한 부품을 ram에 다 가져다 놓아야 한다.
		JFrame f = new JFrame();
		f.setSize(500, 700);
		// f.setBackground(Color.green);
		f.getContentPane().setBackground(Color.green); // 제이프레임은 테두리라 전체배경은 판을 가지고와서 거기에 색넣어야함
		//.으로 연결하는걸 체인식 코드(편함 but좋은 코드는 아님)

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
		JLabel top = new JLabel(); // 이미지 넣을 때도 씀
		ImageIcon icon = new ImageIcon("bird.jpg"); // 이미지 불러오기
		top.setIcon(icon); // 이미지 넣기
		JLabel l1 = new JLabel();
		l1.setText("숫자1");
		l1.setForeground(Color.blue);
		JLabel l2 = new JLabel();
		l2.setText("숫자2");
		l2.setForeground(Color.blue);
		JLabel under = new JLabel();
		under.setText("결과들어가는곳");

		// html에서 input역할
		JTextField t1 = new JTextField(10);
		t1.setBackground(Color.red); // 배경색
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
		f.add(under);

		// Font - 글자스타일
		Font font = new Font("나눔스퀘어라운드 ExtraBold", 1, 50); // (글꼴, 진하기, 크기)
		plus.setFont(font);
		minus.setFont(font);
		l1.setFont(font);
		t1.setFont(font);
		l2.setFont(font);
		t2.setFont(font);
		under.setFont(font);

		// 1. plus버튼 클릭했을 때 액션처리하겠다고 설정
		// 2. 어떤 부품이 할지를 램에다 만들어서 넣어주어야함
		// 3. 그 부품안에 있는 함수(기능)을 사용해야 우리가 원하는 버튼 처리 기능을 사용할 수 있음
		
		// **버튼기능 함수**
		plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 여기에 버튼 클릭 했을 때 처리 내용 써주면 됨.
				System.out.println("플러스 버튼을 눌렀군");
				//t1, t2에 글자를 가지고 와서 ram에 저장해보자.
				String s1 = t1.getText();
				String s2 = t2.getText();
				
				//공백일때 경고 메세지
				//데이터를 입력했는지 확인하는 방법 2가지
				//1. s1.equals("")
				//2. s1.length()
				// if(s1.length() < 1 || s2.length() < 1)  //같은 공백확인
				if(s1.equals("")  || s2.equals("")) {
					JOptionPane.showMessageDialog(f,"숫자를 입력하세요");
				} else {

				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				int sum = n1 + n2;
			  //System.out.println("더한 값은 >>" + sum);
			  //JOptionPane.showMessageDialog(f,"더한 값은 >>  " + sum);
				under.setText("더한 값은 >>  " + sum);
				
				//t1, t2 입력한 값 지우자!
				t1.setText(""); //t1에 공백으로 텍스트를 setting시켜라.
				t2.setText("");
			}
		 }	
		});

		minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 여기에 버튼 클릭 했을 때 처리 내용 써주면 됨.
				System.out.println("마이너스 버튼을 눌렀군");				
				//t1, t2에 글자를 가지고 와서 ram에 저장해보자.	
				String s1 = t1.getText();
				String s2 = t2.getText();
				
				
				if(s1.length() < 1 || s2.length() < 1) {
					JOptionPane.showMessageDialog(f,"숫자를 입력하세요");
				} else {
				
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				int mi = n1 - n2;
				
			  //JOptionPane.showMessageDialog(f,"뺀 값은 >>  " + mi);
				under.setText("더한 값은 >>  " + mi);
				t1.setText(""); 
				t2.setText("");
				}
			}
		});

		// 위에 설정한 코드 다 보여줘 (맨끝줄에 넣어야함)
		f.setVisible(true);
	}

}

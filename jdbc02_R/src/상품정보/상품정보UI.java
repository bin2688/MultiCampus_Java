package 상품정보;

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

public class 상품정보UI {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.setTitle("상품정보");
		f.setLayout(new FlowLayout());
		

		
		JLabel l1 = new JLabel("상품번호 : ");
		JLabel l2 = new JLabel("상품이름 : ");
		JLabel l3 = new JLabel("상품내용 : ");
		JLabel l4 = new JLabel("상품가격 : ");
		JLabel l5 = new JLabel("상품회사 : ");
		JLabel l6 = new JLabel("상품이미지: ");

		JTextField t1 = new JTextField(10); // 10은 글자수
		t1.setForeground(Color.PINK);
		JTextField t2 = new JTextField(10);
		t2.setForeground(Color.PINK);
		JTextField t3 = new JTextField(10);
		t3.setForeground(Color.PINK);
		JTextField t4 = new JTextField(10);
		t4.setForeground(Color.PINK);
		JTextField t5 = new JTextField(10);
		t5.setForeground(Color.PINK);
		JTextField t6 = new JTextField(10);
		t6.setForeground(Color.PINK);

		JButton b1 = new JButton("상품정보 추가");
		b1.setBackground(Color.green);
		b1.setForeground(Color.blue);
		JButton b2 = new JButton("상품정보 삭제");
		b2.setBackground(Color.green);
		b2.setForeground(Color.blue);
		JButton b3 = new JButton("상품정보 수정");
		b3.setBackground(Color.green);
		b3.setForeground(Color.blue);
		JButton b4 = new JButton("상품정보 검색");
		b4.setBackground(Color.green);
		b4.setForeground(Color.blue);

		Font font = new Font("맑은 고딕", Font.BOLD, 30);
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		l6.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);
		t5.setFont(font);
		t6.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(l4);
		f.add(t4);
		f.add(l5);
		f.add(t5);
		f.add(l6);
		f.add(t6);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String name = t2.getText();
				String content = t3.getText();
				int price = Integer.parseInt(t4.getText());
				String company = t5.getText();
				String img = t6.getText();
				
				ProductDAO dao = new ProductDAO();
				ProductVO bag = new ProductVO();
				bag.setId(id);
				bag.setName(name);
				bag.setContent(content);
				bag.setPrice(price);
				bag.setCompany(company);
				bag.setImg(img);
				
				dao.insert(bag);
			}
		});
		
		

		
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}

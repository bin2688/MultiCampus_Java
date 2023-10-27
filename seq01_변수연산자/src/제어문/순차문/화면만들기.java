package 제어문.순차문;

import java.awt.*;

import javax.swing.*;

public class 화면만들기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();   //화면 만들기
			f.setSize(500, 500);   //화면 크기조절
			
			//배치해주는 부품을 따로 설정하지 않으면 다 가운데로 들어가버림.!  
			//물흐르듯이 순서대로 배치해주는 부품을 써야함  (add쓰기전에)
	    FlowLayout flow = new FlowLayout();
			f.setLayout(flow);
				
			
		JButton b = new JButton();  //버튼 만들기
			b.setText("나의 정보확인");   //버튼에 텍스트입력
			
			f.add(b); //f에 b를 올려라. (화면에 버튼을 올려라)
			
		JTextField t1 = new JTextField();
		JTextField t2 = new JTextField();
		JTextField t3 = new JTextField();
		f.add(t1);
		f.add(t2);
		f.add(t3);
 
		f.setVisible(true); //화면을 보여라 (마지막에)
	}

}

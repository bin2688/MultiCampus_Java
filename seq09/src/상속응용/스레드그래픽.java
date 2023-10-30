package 상속응용;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 스레드그래픽 extends JFrame {
	//setText(), setSize(), setVisible(),....
	
	//public void go() { //실무에선 이런식으로 안쓴다.
	//	}
	
	JLabel count, image, day;  //전역변수로 선언
	//선언위치에 따라 사용 위치가 결정됨
	
	//객체생성시 자동호출하는 생성자 메서드를 만들어주면 된다.!
	//new연사자와 같은 메서드로 만들면 static안써도됨. 
	public 스레드그래픽() {
		setTitle("나의 pc방 모니터링 서비스"); //이클래스 거니까 앞에 . 안붙여도됨
		setSize(800, 300);
		count = new JLabel("카운터들어가는 자리");
		image = new JLabel();
		day = new JLabel("시각들어가는 자리");
		Font font = new Font("맑은 고딕", Font.BOLD,30);
		count.setFont(font);
		image.setFont(font);
		day.setFont(font);
		//JFrame은 BorderLayout으로 이미 설정됨.
		//동서남북, 가운데만 넣을 수 있음 
		add(count,BorderLayout.WEST);
		add(image,BorderLayout.EAST);
		add(day,BorderLayout.SOUTH);
	
		
		카운터스레드 counter = new 카운터스레드();
		시각스레드 timer = new 시각스레드();
		배열스레드 array = new 배열스레드();
		
		counter.start();
		timer.start();
		array.start();
		
		JOptionPane.showMessageDialog(null, "");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		 스레드그래픽 name = new 스레드그래픽();
	//	 name.go();
	}
	//클래스안에 클래스를 끼워넣을 수 있다.
	//전역변수를 사용하기 위해서!!!
	//클래스안에 끼워넣은 클래스를 안쪽클래스(inner클래스) - 다만 이너클래스를 많이 쓰는건 좋지않음 (전역변수 공유목적으로만 쓰고, 따로 만들어서 연결하는게 좋음)
	public class 카운터스레드 extends Thread { 
		//run(), start(),....
		@Override
		public void run() {
			//동시에 처리하고싶은 내용!
			for (int i = 500; i >= 0; i--) {
				//System.out.println("카운터>> " + i);
				count.setText("카운트>>" + i);
				try {
					Thread.sleep(1000); //누워있는건 static
				} catch (InterruptedException e) {
					e.printStackTrace(); //어떤 에러인지 출력
					//이메일, 문자 등 처리
				} 
				//외부의 자원 cpu를 연결할 때는
				//아주 위험한 순간이기 때문에, 어떻게 처리할지를 반드시 명시해주어야함. (try/catch)
			}
		}
	}
	public class 배열스레드 extends Thread {
		//run(), start(),....
		@Override
		public void run() {
			
			String[] list = {"30일.PNG", "보스톤.PNG", "천박사.PNG", "화란.PNG", "화사한그녀.PNG"};
			for (int i = 0; i < list.length; i++) {
				//System.out.println("이미지>> " + list[i]);
				//image.setText("이미지>>" + list[i]);
				ImageIcon icon = new ImageIcon(list[i]);
				image.setIcon(icon);
				if (i == 4) {
					i = -1;
				}
				try {
					Thread.sleep(1000); //5초 (밀리세컨즈) 
				} catch (InterruptedException e) {
					e.printStackTrace(); 
					
				} 
			}
		}
	}
	public class 시각스레드 extends Thread {
		//run(), start(),....
		@Override
		public void run() {
			//동시에 처리하고싶은 내용!
			for (int i = 500; i >= 0; i--) {
				Date date = new Date();
				//System.out.println("시각>> " + date);
				day.setText("시각>>" + date);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	
	
	
	
}

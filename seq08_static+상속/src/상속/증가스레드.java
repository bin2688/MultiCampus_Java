package 상속;

public class 증가스레드 extends Thread {
	
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
	}
}

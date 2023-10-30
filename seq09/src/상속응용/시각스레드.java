package 상속응용;

import java.util.Date;

public class 시각스레드 extends Thread {
	//run(), start(),....
	@Override
	public void run() {
		//동시에 처리하고싶은 내용!
		for (int i = 500; i >= 0; i--) {
			Date date = new Date();
			System.out.println("시각>> " + date);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

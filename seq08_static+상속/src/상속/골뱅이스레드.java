package 상속;

public class 골뱅이스레드 extends Thread {
	
	//별스레드 클래스에 run()과 동시에 실행할 코드를 넣기
	
	@Override 
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("@");
		}
	}
	
	
}

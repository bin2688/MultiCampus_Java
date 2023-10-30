package 상속;

public class 별스레드 extends Thread {
	//동시에 돌아가는 부품이 됨.
	//run() -> 동시에 실행하고 프로세스를 넣어주면 됨.
	//start() -> 동시에 시작하렴!
	
	@Override 
	public void run() {
		for (int i = 0; i < 5000; i++) {
			System.out.println("*");
		}
	}
	
	
}

package 상속;

public class 스레드프로그래밍 {

	public static void main(String[] args) {
		별스레드 t1 = new 별스레드();
		이름스레드 t2 = new 이름스레드();
		증가스레드 t3 = new 증가스레드();
		감소스레드 t4 = new 감소스레드();
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();


	}

}

package 상속응용;

public class 스레드프로그래밍1 {

	public static void main(String[] args) {
		카운터스레드 counter = new 카운터스레드();
		시각스레드 timer = new 시각스레드();
		배열스레드 array = new 배열스레드();
		
		counter.start();
		timer.start();
		array.start();

	}

}

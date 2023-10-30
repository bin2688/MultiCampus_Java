package 상속응용;

public class 카운터스레드 extends Thread {
	//run(), start(),....
	@Override
	public void run() {
		//동시에 처리하고싶은 내용!
		for (int i = 500; i >= 0; i--) {
			System.out.println("카운터>> " + i);
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

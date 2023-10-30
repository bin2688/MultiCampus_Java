package 상속응용;

public class 배열스레드 extends Thread {
	//run(), start(),....
	@Override
	public void run() {
		
		String[] list = {"30일.PNG", "보스톤.PNG", "천박사.PNG", "화란.PNG", "화사한그녀.PNG"};
		for (int i = 0; i < list.length; i++) {
			System.out.println("이미지>> " + list[i]);
			try {
				Thread.sleep(5000); //5초 (밀리세컨즈) 
			} catch (InterruptedException e) {
				e.printStackTrace(); 
				
			} 
		}
	}
}

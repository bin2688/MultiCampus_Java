package 예외처리;

public class 예외처리메인2 {

	public static void main(String[] args) throws Exception { //메인에서 다시 또 throws해서 메인메서드를 부른 jvm에게 예외처리 떠넘길 수 있음.
		에러발생3 error = new 에러발생3();
			error.call();
		
		
	}

}

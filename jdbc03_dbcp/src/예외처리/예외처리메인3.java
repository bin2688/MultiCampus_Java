package 예외처리;

public class 예외처리메인3 {

	public static void main(String[] args) {
		에러발생3 error = new 에러발생3();
		try {
			error.call();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("함수를 호출한 곳에서 예외처리함2.");
			System.out.println("관리자에게 전화를 함.");
		}
		
		
	}

}

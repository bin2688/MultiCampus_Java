package 예외처리;

public class ErrorMain {

	public static void main(String[] args) {
		try {
			Error e = new Error();
			e.arr();
		} catch (Exception e) {
			System.out.println("배열 인덱스 에러가 발생함");
		}
		System.out.println("여기는 실행되어야만해");
	}

}

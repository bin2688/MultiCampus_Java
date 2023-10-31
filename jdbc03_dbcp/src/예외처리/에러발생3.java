package 예외처리;

public class 에러발생3 {

		//메서드를 만드는사람이 예외처리하는게아니고 호출한 곳에서 예외처리 시킬 때 throws
	public void call() throws Exception {
		System.out.println(3/0);
	}
}

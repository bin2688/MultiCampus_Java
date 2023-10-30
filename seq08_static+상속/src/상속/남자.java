package 상속;

public class 남자 extends 사람 {
	//사람 클래스를 확장해서 남자 클래스를 만들겠다.
	
	//몇개의 매개변수와 매개메서드를 가지고 태어났는가?
	//2개, 3개 ==> 5개를 가지고 태어남.
	
	int speed;
	
	public void 빨리달리다() {
		System.out.println("빨리달려버려");
	}
	
}

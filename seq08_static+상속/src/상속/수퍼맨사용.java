package 상속;

public class 수퍼맨사용 {

	public static void main(String[] args) {
		수퍼맨 s = new 수퍼맨();
		//super는 문법으로 사용하려고 이미 예약되어있는 단어  //예약어
		s.age = 1000; //사람
		s.speed = 1;  //남자
		s.power = 100; //수퍼맨
		
		s.걷다(); //사람
		s.빨리달리다(); //남자
		s.우주를날다(); //수퍼맨

	}

}

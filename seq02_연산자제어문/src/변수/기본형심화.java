package 변수;

public class 기본형심화 {

	public static void main(String[] args) {
		//기본형 데이터 4가지 => 값을 변수에 바로 넣는다. 원시타입
		//정수 실수 문자 논리
		//정수 4가지 (byte, short, int, long)
		//실수 2가지 (float, double)
		byte age = 127; // 127까지    / 1byte = 8bit
		short wallet = 25000; //+-3만  / 2byte
		int money = 200000000; //+-21억 / 4byte
		long space = 20000000000L; //21억이상 / 8byte
		
		//모두 int로 했을 때와 메모리 크기 비교!
		//각각 타입을 다르게 해서 메모리 할당 ==> 7byte
		//모두 같은 타입인 int로 메모리 할당 ==> 12byte
		

	}

}

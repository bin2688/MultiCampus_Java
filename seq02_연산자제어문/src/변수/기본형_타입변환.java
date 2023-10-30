package 변수;

public class 기본형_타입변환 {

	public static void main(String[] args) {
		byte age = 127;
		int age2 = age;
		
		//작은걸 큰 방에는 가능, 큰 방을 작은 방에는 x
		
		int age3 =127;
		// byte age4 = age3; 에러
		byte age4 =(byte)age3; //강제타입변환 (강제형변환, 캐스팅)

	}

}

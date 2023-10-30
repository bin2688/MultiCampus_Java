package 부품사용하기;

import 부품만들기.계좌;

public class 은행 {

	public static void main(String[] args) {
		계좌 아버지 = new 계좌();
		아버지.이름 = "홍길동";
		아버지.계좌이름 = "튼튼적금";
		아버지.금액 = 10000;
		
		계좌 어머니 = new 계좌();
		어머니.이름 = "홍길동";
		어머니.계좌이름 = "튼튼예금";
		어머니.금액 = 20000;
		
		계좌 형 = new 계좌();
		형.이름 = "홍길동";
		형.계좌이름 = "다음적금";
		형.금액 = 30000;
		
		System.out.println(아버지);
		System.out.println(어머니);
		System.out.println(형);
		형.입금하다();
		//toString()은 언제 사용(호출)되나??
		//참조형변수를 프린트할 때 자동으로 호출됨. 
	}

}

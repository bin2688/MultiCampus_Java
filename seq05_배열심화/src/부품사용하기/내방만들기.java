package 부품사용하기;

import 부품만들기.강아지;
import 부품만들기.전화기부품;

public class 내방만들기 {

	public static void main(String[] args) {
		// 전화기를 사용하고 싶어요.
		전화기부품 phone = new 전화기부품();
		phone.카톡하다();
		phone.인터넷하다();
		강아지 pet = new 강아지();
		pet.짖다();
	}

}

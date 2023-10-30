package 부품사용하기;

import 부품만들기.TV;

public class 우리집 {

	public static void main(String[] args) {
		//틀은 클래스 => 실제인 객체를 생성 
		TV myTv = new TV();  //변수 4개만들어짐
		myTv.ch = 7;
		myTv.vol = 9;
		myTv.onOff = false;
		
		TV yourTv = new TV();
		yourTv.ch = 9;
		yourTv.vol = 12;
		yourTv.onOff = true;
		//new는 객체생성 키워드
		//ram에 주소 + 멤버변수를 힙영역에 만들어준다.
		
	    System.out.println(myTv.ch);
	    System.out.println(myTv.vol);
		System.out.println(myTv.onOff);
	}

}

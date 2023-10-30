package 부품만들기;

public class 전화기부품 {
    //전화기의 특징(속성)
	//크기,색,회사,가격,....
	//특징을 선택해서 사용할 예정
	//변수로 만들어주면 됨. (멤버변수)
	int price;
	String company;

	
	//기능(function, 함수) => 메서드(방법)
	//멤버함수(멤버메서드)
	public void 카톡하다() {
		System.out.println("카톡을 하다.");
	}
	public void 인터넷하다() {
		System.out.println("인터넷을 하다.");
	}
}

package 컬렉션;

import java.awt.Button;
import java.util.ArrayList;

public class 리스트연습1 {

	public static void main(String[] args) {
		//순서가 있는 데이터를 모으고 싶을 때
		//배열??? 컬렉션(리스트 형태)
		//ArrayList
		ArrayList list = new ArrayList();
		//Collection상속 - add(),...
		list.add(100);
		list.add(11.1);
		list.add(true);
		list.add('a');
		list.add("hong");
		list.add("hong");
		list.add(new Button());
		System.out.println(list); //toString()
		//ArrayList 안에 toString()이 재정의 오버라이드
		//List라고 주소가 가르키고 있는 데이터들을 프린트하도록
		
		System.out.println(list.get(0)); //위치값 불러올 때
		System.out.println(list.size());
		
		System.out.println(list.get(4) + "gildong");
		
		for (Object x : list) {
			System.out.println("값>>" + x);
		}
		
		//hong을 꺼내서 gildong을 붙여 프린트
		//for문으로 이용해서 하나씩 꺼내와 모든 데이터를 아래와 같이 프린트
		//for문 for-each문 둘 다 사용 가능!
		//"값>>"+100
		
		System.out.println(list.contains("hong"));
		System.out.println(list.indexOf("hong"));
		System.out.println(list.isEmpty());
		list.remove(0); //원본제거 == 파괴형함수
		list.remove(11.1);
		list.add(0,"추가"); //0번 앞에 넣어라!
		list.set(0, "또수정");
		System.out.println(list);
		
	} 

}

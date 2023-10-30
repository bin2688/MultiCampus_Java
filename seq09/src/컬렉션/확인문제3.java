package 컬렉션;

import java.util.ArrayList;

public class 확인문제3 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("먹기");
		list.add("자기");
		list.add("놀기");
		list.add("책읽기");
		list.add("코딩하기");
		System.out.println(list);
		
		System.out.println(list.get(0)); //첫번째 값
		System.out.println(list.get(list.size() - 1)); //마지막 값
		
		list.set(1,"청소");
		System.out.println(list);
	}

}

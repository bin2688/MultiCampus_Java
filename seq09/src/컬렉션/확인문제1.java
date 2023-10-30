package 컬렉션;

import java.util.HashSet;

public class 확인문제1 {

	public static void main(String[] args) {
		HashSet set = new HashSet(); //중복제거
		set.add("일본");
		set.add("미국");
		set.add("중국");
		set.add("하와이");
		set.add("스페인");
		set.add("스페인"); //중복
		System.out.println(set); 
	}

}

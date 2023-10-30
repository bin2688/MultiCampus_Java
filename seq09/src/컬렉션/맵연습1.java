package 컬렉션;

import java.util.HashMap;

public class 맵연습1 {

	public static void main(String[] args) {
		//map - 맵핑시킨다. 연결시킨다.
		//키: 값인 쌍으로 매핑시켜서 연결시켜서 저장함.
		HashMap map = new HashMap();
		map.put("apple", "사과");
		map.put("melon", "메론");
		map.put("ice", "아이스크림");
		System.out.println(map);
		System.out.println(map.get("apple"));
		//순서가없다.
		map.put("apple", "파란사과"); //똑같이 입력하면 덮어씀
		System.out.println(map);
		map.remove("apple");
		System.out.println(map);
		map.replace("ice", "아이스크림", "초코아이스크림");
		System.out.println(map);
	}

}

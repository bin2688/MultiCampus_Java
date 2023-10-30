package 컬렉션;

import java.util.HashMap;

public class 확인문제2 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("안방","TV");
		map.put("거실","쇼파");
		map.put("부엌","냉장고");
		map.put("현관","신발");
		System.out.println(map);
		System.out.println(map.get("현관"));
		map.replace("거실", "책상");
		System.out.println(map);
		
	}

}

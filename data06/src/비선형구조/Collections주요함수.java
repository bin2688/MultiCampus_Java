package 비선형구조;

import java.util.ArrayList;
import java.util.Collections;

public class Collections주요함수 {

	public static void main(String[] args) {
		int[] s = {3, 3, 6, 7, 8, 11, 34, 90, 102};
		
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < s.length; i++) {
			list.add(s[i]);
		}
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(Collections.min(list));
		System.out.println(Collections.max(list));
		Collections.sort(list);
		System.out.println(list.get(2));
		System.out.println(Collections.frequency(list, 3)); //3이 몇개 있는지
		System.out.println(list.contains(6)); //6을 포함하고 있는지 true, false
		Collections.reverse(list); //역순
		
		
	
		
		
		
	}

}

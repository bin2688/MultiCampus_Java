package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 배열컬렉션변환 {

	public static void main(String[] args) {
		String[] s3 = {"박명수", "유재석","김종국","송지효","하하"};
		List<String> list = Arrays.asList(s3);
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(s3));
		for (int i = 0; i < list2.size(); i++) {
			String s2 = list2.get(i);
			if (s2.length() < 3) {
				list2.remove(i);
			}
		}
		System.out.println(list2);
		
		int index = list2.indexOf("유재석");
		list2.set(index, "유재돌");
		System.out.println(list2);
		
		list2.add(3, "김종민");
		System.out.println(list2);
		
	}
}


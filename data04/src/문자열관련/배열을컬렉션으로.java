package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 배열을컬렉션으로 {

	public static void main(String[] args) {
		String[] s2 = {"aaa","bbb","bbb","ccc"};
		List<String> list = Arrays.asList(s2); //but 읽기전용 (추가등은 불가)
		System.out.println(list); 
		
		int index = list.indexOf("bbb"); ///bbb값의 위치
		int last = list.lastIndexOf("bbb"); //중복시 마지막값의 위치
		System.out.println(index);
		System.out.println(last);
		
		boolean result = list.contains("ccc"); //ccc가 있는지 확인
		System.out.println(result);
		
		Collections.sort(list); //리스트 정렬
		System.out.println(list);
		
		Collections.reverse(list); //리스트 역순(내림차순)
		System.out.println(list);
			
		//만약 리스트를 추가하고싶은경우 새로만들어야함
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(s2));
		list2.add("ttt");
		System.out.println(list2);
	}

}

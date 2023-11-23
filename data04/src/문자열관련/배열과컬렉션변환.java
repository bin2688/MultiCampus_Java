package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 배열과컬렉션변환 {

	public static void main(String[] args) {
		String[] 냉장고음식 = {"감자","고구마","우유","감자","양파"};
		
		//1. 감자가 들어있는 마지막위치
		List<String> list = Arrays.asList(냉장고음식);
		int last = list.lastIndexOf("감자");
		System.out.println(last);
		
		//2. 양파 있는지 없는지
		if (list.contains("양파")) {
			System.out.println("양파는 안사도된다.");
		} else {
			System.out.println("양파사서 냉장고에 넣어야된다.");
		}
		
		//3. 우유를 --> 춘식이우유로
		list.set(2, "춘식이우유");
		System.out.println(list);
		
		//4. 양파를 --> 양파즙으로
		int index2 = list.indexOf("양파");
		list.set(index2, "양파즙");
		System.out.println(list);
		
		//5. 다시 배열로변환
		String[] arr = (String[])list.toArray();
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
	}	
}

package 배열컬렉션변환;

import java.util.ArrayList;

import 배열기본.Print;

public class 배열입력처리후배열만들기 {

	public static void main(String[] args) {
		int[] arr = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		//위 목록 중 3의 배수인 숫자들만 모아보자.
		ArrayList<Integer> list = new ArrayList<>();
		for (Integer x : arr) {
			if (x%3 == 0) {
				list.add(x);
			}
		}
		//결과를 배열에 모아서 출력.
		list.size();
		System.out.println(list.size()); //list배열의 개수
		System.out.println(list); //list배열의 인덱스값
		
		//answer배열에 옮겨보자.
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		Print.arrayPrint(answer);
	}
}


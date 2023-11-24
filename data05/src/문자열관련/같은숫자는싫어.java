package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class 같은숫자는싫어 {

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		int[] num_list = { 1, 1, 3, 3, 0, 1, 1 };
		int[] result = s.solution(num_list);
		System.out.println(Arrays.toString(result));
	}
}

class Solution3 {
	public int[] solution(int[] num_list) {
		int[] answer = null;
		//1. 중복 직접제거
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(num_list[0]);
		int before = num_list[0];
		for (int i = 0; i <  num_list.length; i++) {
			if (num_list[i] != before) {
				list.add(num_list[i]);
				before = num_list[i];
			}
		}
		System.out.println(list);
		//2. 중복 제거해줌(but 아예 똑같은 수 한개만 허용)
//		HashSet<Integer> set = new HashSet<Integer>();
//		for (int i = 0; i < num_list.length; i++) {
//			set.add(num_list[i]);
//		}
//		System.out.println(set);
		return answer;
	}
}

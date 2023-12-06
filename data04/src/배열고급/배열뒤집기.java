package 배열고급;

import java.util.Arrays;

public class 배열뒤집기 {

	public static void main(String[] args) {
		Solution01 s = new Solution01();
		int[] num_list = {1, 2, 3, 4, 5};
		int[] result = s.solution(num_list);
		System.out.println(Arrays.toString(result));
	}
}

class Solution01 {
	public int[] solution(int[] num_list) {
		int[] answer = new int[num_list.length];
		int j = num_list.length - 1;
		for (int x : num_list) {
			answer[j--] = x;
		}
		return answer;
	}
}
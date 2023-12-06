package 배열고급;

import java.util.Arrays;

public class 배열뒤집기2 {

	public static void main(String[] args) {
		Solution02 s = new Solution02();
		int[] num_list = {1, 2, 3, 4, 5, 33, 22, 55, 11};
		int[] result = s.solution(num_list);
		System.out.println(Arrays.toString(result));
	}
}

class Solution02 {
	public int[] solution(int[] num_list) {
		//역순으로 정렬(내림차순)
		//오름차순으로 정렬 --> 거꾸로 집어넣기. == 내림차순		
		int[] answer = new int[num_list.length];
		int j = num_list.length - 1;
		for (int x : num_list) {
			answer[j--] = x;
		}
		return answer;
	}
}
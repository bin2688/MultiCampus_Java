package 배열고급;

import java.util.Arrays;

public class 배열반환고정길이 {

	public static void main(String[] args) {
		int[] n = {44, 3, 22, 66, 88};
		Solution1 s = new Solution1();
		int[] result = s.solution(n);
		System.out.println(Arrays.toString(result));
	}
}

class Solution1 {
	public int[] solution(int[] n) {
		Arrays.sort(n);
		int[] answer = {n[0], n[n.length -1]};
	
		return answer;
	}
}

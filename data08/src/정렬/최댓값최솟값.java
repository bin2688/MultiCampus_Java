package 정렬;

import java.util.Arrays;

public class 최댓값최솟값 {

	public static void main(String[] args) {
		Solution0 s = new Solution0();
		String s2 = "1 2 3 4";
		String result = s.solution(s2);
		System.out.println(result);
	}
}

class Solution0 {
	public String solution(String s2) {
		String[] s3 = s2.split(" ");
		int[] n = new int[s3.length];
		for (int i = 0; i < n.length; i++) {
			n[i] = Integer.parseInt(s3[i]);
		}
		System.out.println(Arrays.toString(n));
		Arrays.sort(n);
		String answer = n[0] + " " + n[n.length -1];
		return answer;
	}
}


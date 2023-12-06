package 배열고급;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열반환가변길이2 {

	public static void main(String[] args) {
		int[] n = {44, 3, 22, 66, 88};
		int find = 40;
		Solution4 s = new Solution4();
		int[] result = s.solution(n,find);
		System.out.println(Arrays.toString(result));
	}
}

class Solution4 {
	public int[] solution(int[] n, int find) {		
		ArrayList<Integer> list = new ArrayList<>();
		for (Integer x : n) {
			if (x > find) {
				list.add(x);
			}
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}

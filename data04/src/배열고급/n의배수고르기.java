package 배열고급;

import java.util.ArrayList;
import java.util.Arrays;

public class n의배수고르기 {

	public static void main(String[] args) {
		int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
		int n = 3;
		Solution8 s = new Solution8();
		int[] result = s.solution(n, numlist);
		System.out.println(Arrays.toString(result));
	}
}

class Solution8 {
	public int[] solution(int n, int[] numlist) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (Integer x : numlist) {
			if (x%n == 0) {
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


package 배열고급;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열반환가변길이3 {

	public static void main(String[] args) {
		int[] n = {44, 3, 22, 66, 88};
		int find = 3;
		Solution6 s = new Solution6();
		int[] result = s.solution(n,find);
		System.out.println(Arrays.toString(result));
	}
}

class Solution6 {
	public int[] solution(int[] n, int find) {		
		//3으로 나누어서 20보다 큰 수의 리스트를 구해보세요.
		ArrayList<Integer> list = new ArrayList<>();
		for (Integer x : n) {
			if (x/3 > 20) {
				list.add(x);
			}
		}
		//리스트에 아무것도 없을 때 -1을 리턴
		//int[] answer = new int[list.size()];
		int[] answer = new int[list.size()];
		if (list.size() == 0) {
				answer = new int[1];
				answer[0] = -1;
		}else {
			for (int i = 0; i < answer.length; i++) {			
				answer[i] = list.get(i);
			}
		}
		return answer;
	}
}

class Solution98 {
	public int[] solution(int[] n, int find) {
		int[] answer = Arrays.stream(n)
				.filter(num -> num/find > 20)
			    .toArray();
		return answer;
	}
}
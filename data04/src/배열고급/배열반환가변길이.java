package 배열고급;


import java.util.ArrayList;
import java.util.Arrays;

public class 배열반환가변길이 {

	public static void main(String[] args) {
		int[] n = {44, 3, 22, 66, 88,99};
		int find = 3;
		Solution5 s = new Solution5();
		int[] result = s.solution(n,find);
		System.out.println(Arrays.toString(result));
	}
}

class Solution5 {
	public int[] solution(int[] n, int find) {
		//3의 배수 목록만 구하기.
		ArrayList<Integer> list = new ArrayList<>();
		//if(n[i]%3 == 0)
		for (Integer x : n) {
			if (x%find ==0) {
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

class Solution99 {
	public int[] solution(int[] n, int find) {
		int[] answer = Arrays.stream(n)
				.filter(num -> num % find == 0)
			    .toArray();
		return answer;
	}
}

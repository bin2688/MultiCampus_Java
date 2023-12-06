package 배열메서드입출력;

import java.util.Arrays;

public class 중앙값구하기 {

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		//int[] numbers =  {0, -31, 24, 10, 1, 9};
		int[] numbers = {9, -1, 0};
		int result = s.solution(numbers);
		System.out.println(result);
	}
}

class Solution3 {
	 public int solution(int[] numbers) {
		 Arrays.sort(numbers);
		 return numbers[numbers.length/2];

	}
}
